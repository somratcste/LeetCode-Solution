package practise;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class BranchSums {

    private static List<Integer> calculateBranchSums(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        calculateBranchSumsHelper(root, 0, result);
        return result;
    }

    private static void calculateBranchSumsHelper(TreeNode node, int runningSum, List<Integer> result) {
        if (node == null) return;

        int currentSum = runningSum + node.val;
        if (node.left == null && node.right == null) {
            result.add(currentSum);
            return;
        }

        calculateBranchSumsHelper(node.left, currentSum, result);
        calculateBranchSumsHelper(node.right, currentSum, result);
    }

    public static void main(String[] args) {
        // Example usage:
        // Construct a binary tree:
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> branchSums = calculateBranchSums(root);

        System.out.println("Branch Sums: " + branchSums);
    }

}
