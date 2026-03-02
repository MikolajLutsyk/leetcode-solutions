package org.example.LeetCode75.BinaryTree_BFS;


import java.util.ArrayDeque;
import java.util.Queue;

public class MaximumLevelSumOfABinaryTree {
    public int maxLevelSum(TreeNode root) {
        int resultLevel = 1;
        int currentLevel = 1;
        int currentLevelSum = 0;
        int maxLevelSum = Integer.MIN_VALUE;

        if(root == null) return 0;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        currentLevelSum = root.val;

        while(!queue.isEmpty()){
            if(currentLevelSum > maxLevelSum){
                resultLevel = currentLevel;
                maxLevelSum = currentLevelSum;
            }
            currentLevelSum = 0;

            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();

                if(node.right != null){
                    queue.offer(node.right);
                    currentLevelSum += node.right.val;
                }
                if(node.left != null){
                    queue.offer(node.left);
                    currentLevelSum += node.left.val;
                }
            }
            currentLevel++;
        }
        return resultLevel;
    }
}
