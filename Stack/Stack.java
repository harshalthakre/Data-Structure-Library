import java.util.*;
public class Stack<T>{
	Node top;

	class Node
	{
		T data;
		Node next;
		

		Node(T data)
		{
			this.data=data;
			next=null;
		}
		
	}


	public void push(T data)
	{
		Node newNode=new Node(data);
		newNode.next=top;
		top=newNode;
		//System.out.println("pushed succesfully");
		
	}

	public T pop()
	{
		if(top==null)
		{
			System.out.println("Stack Underflow");
			return null;
		}
		Node temp=top;
		top=top.next;
		return temp.data;
	}

	/*public void pop()
	{
		if(top==null)
		{
			System.out.println("Stack Underflow");
			return null;
		}
		Node temp=top;
		top=top.next;
	}*/


	public T getStackTop()
	{
		if(top==null){ System.out.println("Empty Stack"); return null;}
		return top.data;
	}

	public boolean isStackEmpty()
	{
		if(top==null)
		{
			return true;
		}
		else
			return false;
	}

	public void display()
	{
		if(isStackEmpty())
		{
			System.out.println("ERROR !! Stack is Empty");

		}
		else{
			Node temp=top;
			while(temp!=null);
			{
				System.out.print(temp.data);
				temp=temp.next;
			}
		}
	}

	public int getStackLength()
	{
		int cnt=0;
		if(top==null)
		{
			return 0;
		}
		else {
			Node temp=top;
			while(temp!=null)
			{
				cnt++;
				temp=temp.next;
			}
		}
		return cnt;
	}
}