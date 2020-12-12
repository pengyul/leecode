package jzoffer.q07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        Map<Integer,Integer> inMap = new HashMap<>();
        for (int i = 0; i < inOrder.length; i++) {
            inMap.put(inOrder[i], i);
        }
        if (preOrder.length > 0) {
            return buildTree(preOrder, 0, preOrder.length, inOrder, 0, inOrder.length, inMap);
        } else {
            return null;
        }
    }

    public TreeNode buildTree(int[] preOrder, int startPre, int endRre, int[] inOrder, int startIn, int endIn, Map<Integer, Integer> inMap){
        if(endRre < startPre) return null;
        TreeNode root = new TreeNode(preOrder[startPre]);
        int rootPosition = inMap.get(preOrder[startPre]);
        root.left = buildTree(preOrder, startPre + 1, startPre + rootPosition - startIn, inOrder, startIn, rootPosition - 1, inMap);
        root.right = buildTree(preOrder, startPre + rootPosition - startIn + 1, endRre, inOrder, rootPosition + 1, endIn, inMap);
        return root;
    }

    public static void main(String[] args) {
        int[] preOrder = new int[]{3,9,20,15,7};
        int[] inOrder = new int[]{9,3,15,20,7};
        new Solution().buildTree(preOrder, inOrder);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}