import java.util.*;
public class ApplicationBinaryTree{
	public static void main(String args[])
	{
		Scanner  sc=new Scanner(System.in);
		BinaryTree<Integer> bintree=new BinaryTree<Integer>();
		bintree.insert(sc.nextInt());
		bintree.insert(sc.nextInt());
		bintree.insert(sc.nextInt());
		bintree.insert(sc.nextInt());
		bintree.insert(sc.nextInt());
		bintree.insert(sc.nextInt());
		bintree.insert(sc.nextInt());
		bintree.insert(sc.nextInt());
		bintree.insert(sc.nextInt());
		System.out.println("\nLEVEL ORDER");
		bintree.levelOrder();
		System.out.println("\nINORDER");
		bintree.inorder();
		System.out.println("\nPREORDER");
		bintree.preorder();
		System.out.println("\nPOSTORDER");
		bintree.postorder();
		System.out.println("\nMORRIS TRAVERSAL");
		bintree.morrisTraversal();
		System.out.println("\nMaximum Depth of Tree: "+bintree.maxDepth());
		System.out.println("\nSize of the tree: "+bintree.getSize());
		System.out.println("\nMaximum Depth of Tree without using Recurssion: "+bintree.getMaxDepth());
	}
}