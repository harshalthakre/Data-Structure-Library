import java.util.*;
class  BinarySearchTree{
	Node root;
	class Node{
		int data;
		Node left;
		Node right;

		Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}

	}
	BinarySearchTree()
	{
		root=null;
	}

	public void insert(int data)
	{
		root=insertRec(root,data);
	}


	public Node insertRec(Node root,int key)
	{
		if(root==null)
		{
			Node temp=new Node(key);
			root=temp;
		}

		else if(root.data>key)
			root.left=insertRec(root.left,key);
		else
			root.right=insertRec(root.right,key);
		return root;
	}


	public void inorder()
	{
		inorderCall(root);
		return;
	}
	public void inorderCall(Node root)
	{
		if(root==null)
			return;
		inorderCall(root.left);
		System.out.print(root.data+" ");
		inorderCall(root.right);
	}
}