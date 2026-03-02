package org.example.LeetCode75.BinaryTree_BFS;

import java.util.*;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if(root == null) return result;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            result.add(queue.peek().val);

            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();

                if(node.right != null) queue.offer(node.right);
                if(node.left != null) queue.offer(node.left);

            }
        }

        return result;
    }
}
