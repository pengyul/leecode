package jzoffer.q04;

public class Solution {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int row = matrix.length;
        int column = matrix[0].length;
        int m = 0, n = column - 1;
        while (m < row && n >= 0){
            if(matrix[m][n] == target) return true;
            else if(matrix[m][n] > target) n--;
            else m++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{1,1},{4,5}};
        System.out.println(findNumberIn2DArray(a, 5));
    }
}
