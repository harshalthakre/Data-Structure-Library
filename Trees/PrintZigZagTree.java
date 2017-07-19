import java.util.*;
public class PrintZigZagTree{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		BinaryTree<Integer> btree=new BinaryTree<Integer>();
		for(int i=0;i<n;i++)
		{
			btree.insert(sc.nextInt());
		}

		btree.inorder();
		System.out.println("--------------------------");
		btree.printZigZag();
	}
}