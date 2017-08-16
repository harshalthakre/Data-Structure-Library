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


	public void levelOrderReverse()
	{
		if(root==null)
			return;
		LinkedList<Node> queue=new LinkedList<Node>();
		LinkedList<Node> stack=new LinkedList<Node>();
		
		Node temp=null;

		queue.add(root);
		while(queue.size()!=0)
		{
			temp=queue.pop();

			if(temp.right!=null)
				queue.add(temp.right);
			if(temp.left!=null)
				queue.add(temp.left);
			stack.push(temp);
		}

		while(stack.size()!=0)
			System.out.print(stack.pop().data+" ");
	}


	int maxLevelSum(){
		if(root==null)
			return 0;
		LinkedList<Node> queue=new LinkedList<Node>();
		queue.add(root);
		queue.add(null);
		Node temp;
		int sum=0;
		int max=Integer.MIN_VALUE;
		while(queue.size()!=0)
		{
			temp=queue.pop();
			if(temp!=null)
				{
					Object o=temp.data;
					sum+=(Integer)o;

					if(temp.left!=null)
				queue.add(temp.left);

			if(temp.right!=null)
				queue.add(temp.right);

				}
			else{
				if(queue.size()!=0)
				{
					queue.add(null);
				}
				if(sum>max)
				{
					max=sum;
					sum=0;
				}
			}

			

		}

		return max;
	}

	Template lca(int n1,int n2)
	{
		Node temp=lca(root,n1,n2);
		return temp.data;
	}

	Node lca(Node root,int n1,int n2)
	{
		if(root==null)
			return null;
		Integer data=(Integer)root.data;
		if(data==n1||data==n2)
		{
			return root;
		}

		Node left=lca(root.left,n1,n2);
		Node right=lca(root.right,n1,n2);

		// if both are non null the thier root parent will be lca
		if(left!=null&&right!=null)
			return root;

		// if any one is non null check whether left or right whatever is present whetehr it is lca or not
		return (left!=null)?left:right;
	}


	void makeMirror()
	{
		Node temp=makeMirror(root);
	}

	Node makeMirror(Node root)
	{
		if(root!=null){
			makeMirror(root.left);
			makeMirror(root.right);

			//swap left and right subtree

			Node temp=root.left;
			root.left=root.right;
			root.right=temp;
		}
		return root;
	}

	void printPathtoLeaf()
	{
		int path[]=new int[100];
		int pathlen=0;
		printPathtoLeaf(root,path,pathlen);
	}

	void printPathtoLeaf(Node root,int[] path,int pathlen){
		if(root==null)
			return;
		// append this path to array

		path[pathlen]=(Integer)root.data;
		pathlen++;
		if(root.left==null&&root.right==null)
		{
			printArray(path,pathlen);
		}

		else{
			printPathtoLeaf(root.left,path,pathlen);
			printPathtoLeaf(root.right,path,pathlen);
		}
	}

	void printArray(int[] path,int pathlen){
		for(int i=0;i<pathlen;i++)
		{
			System.out.print(path[i]+" ");
		}
		System.out.println();
	}


	void printAncestor(int findi)
	{
		printAncestor(root,findi);	
	}
	boolean printAncestor(Node root,int findi)
	{
		if(root==null) return false;

		if((Integer)root.data==findi||(Integer)root.data==findi||printAncestor(root.left,findi)||printAncestor(root.right,findi))
		{
			System.out.print(root.data+" ");
			return true;
		}
		return false;
	}


	void printVerticalSum()
	{
		printVerticalSum(root,0);

		Set<Map.Entry<Integer,Integer>> hs=hm.entrySet();

		// yeah u r right set is an interface
		// and we are not creating object of set here, the internal object is implemented child of Set only.
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{

			// ir.next() also returns object
			// now u will say how come then child Map.Entry is holding parent object 
			// its not because internal object returned by itr.next() the internal object it contains is Map.Entry only
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.print(m1.getValue()+" ");
		}
	}
	LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<Integer,Integer>();
	void printVerticalSum(Node root,int column)
	{
		if(root==null) return;

		printVerticalSum(root.left,column-1);

		if(hm.get(column-1)!=null)
		{
			int no=hm.get(column-1);
			hm.put(column-1,no+(Integer)root.data);
		}
		else hm.put(column-1,(Integer)root.data);

		printVerticalSum(root.right,column+1);
	}
}
