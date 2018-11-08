/**
 * 
 */

/**
 * @author suryatejaparuchuri
 *
 */

class Node {
	int key;
	Node left, right;
	
	public Node(int item) {
		key = item;
		left = right = null;
	}
}

public class BinaryTree {
	Node root;
	
	BinaryTree(int key) {
		root = new Node(key);
	}
	
	BinaryTree() {
		root = null;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		System.out.println("make sure that everything works in this file");
	}

}
