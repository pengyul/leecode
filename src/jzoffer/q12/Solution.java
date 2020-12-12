package jzoffer.q12;

public class Solution {
    public static void main(String[] args) {
        char[][] board = new char[][]{{'C','A','A'},{'A','A','A'},{'B','C','D'}};
        System.out.println(new Solution().exist(board, "AAB"));
    }

    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean res = findNextChar(board, chars, i, j, 0);
                if(res) return true;
            }
        }
        return false;
    }

    private boolean findNextChar(char[][] board, char[] chars, int m, int n, int k){
        if(m < 0 || m > board.length - 1 || n < 0 || n > board[0].length - 1 || board[m][n] != chars[k])
            return false;
        if(k == chars.length - 1) return true;
        char temp = board[m][n];
        board[m][n] = '/';
        boolean res = findNextChar(board, chars, m - 1, n, k+1)
                || findNextChar(board, chars, m + 1, n, k+1)
                || findNextChar(board, chars, m, n - 1, k+1)
                || findNextChar(board, chars, m, n + 1, k+1);
        board[m][n] = temp;
        return res;
    }
}
