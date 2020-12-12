package jzoffer.q03;

public class Solution {
    private static int num = 0;
    public static int findRepeatNumber(int[] nums) {
        int len = nums.length;
        int from = 0;
        int to = len - 1;
        quickSort(nums, from, to);
        return num;
    }

    private static void quickSort(int[] nums, int low, int high){
        if(low < high) {
            int mid = getMid(nums, low, high);
            if(mid == -1) return;
            if (nums[mid] > mid) {
                quickSort(nums, mid + 1, high);
            } else if (nums[mid] < mid) {
                quickSort(nums, low, mid - 1);
            } else {
                quickSort(nums, low, mid - 1);
                quickSort(nums, mid + 1, high);
            }
        }
    }

    private static int getMid(int[] nums, int low, int high){
        int temp = nums[low];
        while (low < high){
            while (low < high && temp <= nums[high]) {
                if(temp == nums[high]){
                    num = temp;
                    return -1;
                }
                high--;
            }
            nums[low] = nums[high];
            while (low < high && temp >= nums[low]) {
                if(temp == nums[low]){
                    num = temp;
                    return -1;
                }
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = temp;
        return low;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
    }
}
