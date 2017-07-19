import java.util.*;
public class BinaryTree<Template>{
	Node root;

	class Node{
		Template data;
		Node right;
		Node left;

		Node(int data)
		{
			this.data=data;
			right=null;
			left=null;
		}
	}

	public void insert(Template data)
	{
		Node newNode=new Node(data);
		if(root==null)
		{
			root=newNode;
			return;
		}
		Queue<Node> queue=new Queue<Node>();
		queue.enqueue(root);

		while(!queue.isEmpty())
		{
			temp=queue.dequeue();
			if(temp.left==null)
			{
				temp.left=newNode;
				return;
			}
			else if(temp.right==null)
			{
				temp.right=newNode;
				return;
			}
			queue.enqueue(temp.left);
			queue.enqueue(temp.right);
		}
	}

	public void levelOrder()
	{
		if(root==null)
		{
			System.out.println("Tree is Empty");
			return;
		}
		else{
			Queue<Node> queue=new Queue<Node>();
			queue.enqueue(root);

			while(!queue.isEmpty())
			{
				temp=queue.dequeue();
				System.out.print(temp+" ");
				if(temp.left!=null)
					queue.enqueue(temp.left);
				if(temp.right!=null)
					queue.enqueue(temp.right);
			}
		}
	}
}