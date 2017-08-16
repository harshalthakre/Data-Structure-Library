import java.util.*;
public class Stack{
	Node top;

	class Node{
		int data;
		Node next;

		Node()
		{
			data=0;
			next=null;
		}
		Node(int data)
		{
			this.data=data;
		}
	}

	public void push(int newData)
	{
		Node newNode=new Node(newData);
		
		newNode.next=top;
		top=newNode;
		
	}

	public void display()
	{
		Node current=top;
		if(top==null)
		{
			System.out.println("STACK I EMPTY");
			return;
		}
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}

	public int pop()
	{		
		if(top==null)
		{
			System.out.println("\nSTACK UNDERFLOW");
			return 0;
		}
		Node temp=top;
		top=top.next;
		return temp.data;

	}
}