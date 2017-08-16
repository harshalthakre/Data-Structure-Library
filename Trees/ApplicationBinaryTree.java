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
		//bintree.insert(sc.nextInt());
		//bintree.insert(sc.nextInt());
		System.out.println("\nLEVEL ORDER");
		bintree.levelOrder();
		
		/*System.out.println("\nINORDER");
		bintree.inorder();
		System.out.println("\nPREORDER");
		bintree.preorder();
		System.out.println("\nPOSTORDER");
		bintree.postorder();
		System.out.println("\nMORRIS TRAVERSAL");
		bintree.morrisTraversal();
		System.out.println("\nMaximum Depth of Tree: "+bintree.maxDepth());
		System.out.println("\nSize of the tree: "+bintree.getSize());
		System.out.println("\nMaximum Depth of Tree without using Recurssion: "+bintree.getMaxDepth());*/

		/*System.out.println("\nLEVEL ORDER Reverse: \n");
		bintree.levelOrderReverse();
		System.out.println("\nMaximum Depth of Tree without using Recurssion: "+bintree.getMaxDepth());

		System.out.println("\nMaximum level sum is: "+bintree.maxLevelSum());

		System.out.println("lca is: "+bintree.lca(sc.nextInt(),sc.nextInt()));

		/*System.out.println("making miroor");
		bintree.makeMirror();

		System.out.println("\nLEVEL ORDER");
		bintree.levelOrder();*/

		/*System.out.println("getting path from root to leafs: ");
		bintree.printPathtoLeaf();*/

		System.out.println("\ngettig ancsestors");
		bintree.printAncestor(sc.nextInt());

		System.out.println("\nVertical sum: is: ");
		bintree.printVerticalSum();

	}
}