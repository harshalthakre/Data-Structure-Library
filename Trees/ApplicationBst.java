import java.util.*;
public class ApplicationBst{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		BinarySearchTree bst=new BinarySearchTree();

		int n=sc.nextInt();

		for(int i=0;i<n;i++)
			bst.insert(sc.nextInt());
		System.out.println("BST=============");
		bst.inorder();


		String str=new String();
	}
}