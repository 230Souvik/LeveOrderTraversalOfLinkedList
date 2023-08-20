
package ex35;
import java.util.Queue;
import java.util.LinkedList;

public class Ex35 {
static class TreeNode {
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode sibling;

    	TreeNode(int val) {
        	this.val = val;
    	}

    
    	public String toString() {
        	return Integer.toString(val);
    	}
	}

	static void connectSiblings(TreeNode root) {
    	if (root == null) {
        	return;
    	}

    	Queue < TreeNode > queue = new LinkedList < > ();
    	queue.offer(root);

    	while (!queue.isEmpty()) {
        	int size = queue.size();
        	TreeNode prev = null;
        	for (int i = 0; i < size; i++) {
            	TreeNode node = queue.poll();
            	if (prev != null) {
                	prev.sibling = node;
                	System.out.println(prev + " - > " + node);
            	}
            	prev = node;
            	if (node.left != null) {
                	queue.offer(node.left);
            	}
            	if (node.right != null) {
                	queue.offer(node.right);
            	}
        	}
        	if (prev != null) {
            	prev.sibling = null;
            	System.out.println(prev + " - > null");
        	}
    	}
	}
    
    public static void main(String[] args) {
        // TODO code application logic here
        TreeNode root = new TreeNode(1);
    	root.left = new TreeNode(2);
    	root.right = new TreeNode(3);
    	root.left.left = new TreeNode(4);
    	root.left.right = new TreeNode(5);
    	root.right.right = new TreeNode(7);

    	connectSiblings(root);
    }
    
}
