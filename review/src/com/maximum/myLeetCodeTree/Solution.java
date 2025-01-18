package com.maximum.myLeetCodeTree;

import java.util.*;
import java.util.stream.Collectors;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class TreeUtils {
    // 分隔符
    String SEP = ",";
    // 空值
    String NULL = "null";

    /* 将字符串反序列化为二叉树结构 */
    TreeNode buildTree(String data) {
        if (data.isEmpty()) return null;
        // 去除首位"[", "]"
        data = data.substring(1,data.length()-1);
        // 在data后加若干个空值
        for(int i = 0; i < 100; i++) data += SEP + NULL;
        String[] nodes = data.split(SEP);
        // 第一个元素就是 root 的值
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));

        // 队列 q 记录父节点，将 root 加入队列
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        for (int i = 1; i < nodes.length; ) {
            // 队列中存的都是父节点
            TreeNode parent = q.poll();
            if(parent == null) break;
            // 父节点对应的左侧子节点的值
            String left = nodes[i++];
            if (!left.equals(NULL)) {
                parent.left = new TreeNode(Integer.parseInt(left));
                q.offer(parent.left);
            } else {
                parent.left = null;
            }
            // 父节点对应的右侧子节点的值
            String right = nodes[i++];
            if (!right.equals(NULL)) {
                parent.right = new TreeNode(Integer.parseInt(right));
                q.offer(parent.right);
            } else {
                parent.right = null;
            }
        }
        return root;
    }

    public String treeToString(TreeNode root) {
        if (root == null) return "[]";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                sb.append("null,");
            } else {
                sb.append(node.val).append(",");
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }

        // 去掉尾部多余的 "null,"
        String result = sb.toString();
        while (result.endsWith("null,")) {
            result = result.substring(0, result.length() - 5); // 去掉 "null,"
        }

        return "[" + result.substring(0, result.length() - 1) + "]"; // 去掉最后一个逗号
    }
}

class Solution {
    public void solveSudoku(char[][] board) {
        solveSudokuHelper(board);
    }

    private boolean solveSudokuHelper(char[][] board){
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if (board[i][j] != '.'){
                    continue;
                }
                for (char k = '1'; k <= '9'; k++){
                    if (isValidSudoku(i, j, k, board)){
                        board[i][j] = k;
                        if (solveSudokuHelper(board)){
                            return true;
                        }
                        board[i][j] = '.';
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean isValidSudoku(int row, int col, char val, char[][] board){
        // 同行是否重复
        for (int i = 0; i < 9; i++){
            if (board[row][i] == val){
                return false;
            }
        }
        // 同列是否重复
        for (int j = 0; j < 9; j++){
            if (board[j][col] == val){
                return false;
            }
        }
        // 9宫格里是否重复
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++){
            for (int j = startCol; j < startCol + 3; j++){
                if (board[i][j] == val){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeUtils treeUtils = new TreeUtils();
        String data = "[1,null,2,2]";
        TreeNode root = treeUtils.buildTree(data);
        Solution solution = new Solution();

    }
}