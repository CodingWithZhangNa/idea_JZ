package com.interview.JZ;

public class JZ65 {

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        //把一维数组转换成二维数组
        char[][] board = new char[rows][cols];
        int x = 0;
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (index >= cols) {
                index = 0;
                x++;
            }
            board[x][index] = matrix[i];
            index++;
        }

        //把基本数据类型：字符型char 转换成 引用数据类型：类 即string类型
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            word.append(str[i]);
        }

        boolean[][] vis = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (solve(board, word.toString(), i, j, vis, 0)) {
                    //找到一种情况即可
                    return true;
                }
            }
        }
        return false;
    }

    private boolean solve(char[][] board, String word, int x, int y, boolean[][] vis, int index) {
        //越界处理以及每个方格只能访问一次
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || vis[x][y]) {
            return false;
        }
        //匹配到某一位置不满足条件
        if (word.charAt(index) != board[x][y]) {
            return false;
        }
        //匹配成功
        if (index == word.length() - 1) {
            return true;
        }

        vis[x][y] = true;  //x,y位置的标记
        boolean flag = solve(board, word, x + 1, y, vis, index + 1) ||
                solve(board, word, x - 1, y, vis, index + 1) ||
                solve(board, word, x, y + 1, vis, index + 1) ||
                solve(board, word, x, y - 1, vis, index + 1);
        vis[x][y] = false;  //x,y位置的状态回溯
        return flag;
    }

}
