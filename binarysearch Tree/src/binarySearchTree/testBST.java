package binarySearchTree;

public class testBST {

	public static void main(String[] args) {
		BST tree=new BST();
		
		tree.insert(20, "Twenty");
		tree.insert(10, "ten");
		tree.insert(30, "Thirty");
		
		tree.insert(40, "Forty");
		System.out.println(tree.findMin().key);
		System.out.println(tree.findMax().key);


	}

}
