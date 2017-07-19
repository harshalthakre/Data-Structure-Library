import java.util.*;
public class BinaryTree<Template>{
	Node root;

	class Node{
		Template data;
		Node right;
		Node left;

		Node(Template data)
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
			Node temp=queue.dequeue();
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
				Node temp=queue.dequeue();
				System.out.print(temp.data+" ");
				if(temp.left!=null)
					queue.enqueue(temp.left);
				if(temp.right!=null)
					queue.enqueue(temp.right);
			}
		}
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


	public void preorder()
	{
		if(root==null)
			return;
		Stack<Node> stack=new Stack<Node>();
		Node temp=root;
		stack.push(temp);
		while(!stack.isStackEmpty())
		{
				while(temp!=null)
			{
				System.out.print(temp.data+" ");
				
				temp=temp.left;
				if(temp!=null)
					stack.push(temp);
			}

			temp=stack.pop();
			temp=temp.right;
			if(temp!=null)
				stack.push(temp);
		}
	}

	public void postorder()
	{
		if(root==null)
			return;
		Stack<Node> stack=new Stack<Node>();
		Node temp=root;
		Node previous=null;
		stack.push(root);

		while(!stack.isStackEmpty())
		{
			while(temp!=null)
			{
				temp=temp.left;
				if(temp!=null)
					stack.push(temp);
			}

			Node top=stack.getStackTop();
			temp=top.right;
			if(temp==null||temp==previous)
				{
					System.out.print(top.data+" ");
					Node zand=stack.pop();
					previous=zand;
				}
			else
				{
					stack.push(temp);
					
				}
		}
	}


	public void morrisTraversal()
	{
		if(root==null)
			return;
		Node current=root;
		Node pre=null;
		while(current!=null)

		{
			if(current.left==null)
			{
				System.out.print(current.data+" ");
				current=current.right;
			}
			else
			{
				pre=current.left;
				while(pre.right!=null && pre.right!=current)
				{
					pre=pre.right;
				}

				if(pre.right==null)
				{
					pre.right=current;
					current=current.left;
				}
				else{
					pre.right=null;
					System.out.print(current.data+" ");
					current=current.right;
				}
			}
		}
	}


//MAXIMUM DEPTH Recurssive Approach
	public int maxDepth()
	{
		return maxDepthOfTree(root);
	}
	public int maxDepthOfTree(Node root)
	{
		if(root==null)	
			return 0;
		int left=maxDepthOfTree(root.left);
		int right=maxDepthOfTree(root.right);

		return left>=right?(left+1):(right+1);
	}

//Size of the Tree

	public int getSize()
	{
		return sizeofTree(root);	
	}

	public int sizeofTree(Node root)
	{
		if(root==null)
			return 0;
		int left=sizeofTree(root.left);
		int right=sizeofTree(root.right);

		return (left+right+1);
	}

//GET MAXIMUM DEPTH WITHOUT RECURSSION

	public int getMaxDepth()
	{
		if(root==null)
			return 0;
		int h=0;
		Node temp=root;
		Queue<Node> queue=new Queue<Node>();
		queue.enqueue(temp);
		queue.enqueue(null); // to encounter both childrens
		while(!queue.isEmpty())
		{
			temp=queue.dequeue();

			if(temp==null)
			{
				if(!queue.isEmpty())
					queue.enqueue(null);
				h++;
			}
			else{

			if(temp.left!=null)
				queue.enqueue(temp.left);
			if(temp.right!=null)
				queue.enqueue(temp.right);
			}

			/*if(temp.left!=null||temp.right!=null)
				h++;*/	
		}

		return h;
	}	

	/*public Node constructByInorderPreorder(String inorder,String preorder,int inorderStart,int inorderEnd)
	{

		
	}*/

	public void printZigZag()
	{
		Node temp=root;
		int status=1; //1==<RL 0==>LR

		Stack<Node> currentLevel=new Stack<Node>();
		Stack<Node> nextLevel=new Stack<Node>();

		currentLevel.push(temp);
		while(!currentLevel.isStackEmpty())
		{
			Node rt=currentLevel.pop();
			System.out.print(rt.data+" ");
			if(status==1)
			{
				if(rt.left!=null)
					nextLevel.push(rt.left);
				if(rt.right!=null)
					nextLevel.push(rt.right);	
			}
			else{
				if(rt.right!=null)
					nextLevel.push(rt.right);
				if(rt.left!=null)
					nextLevel.push(rt.left);
				
			}

			if(currentLevel.isStackEmpty()){
				status=1-status;
				Stack stk=currentLevel;
				currentLevel=nextLevel;
				nextLevel=stk;
			}
		}
	}

}