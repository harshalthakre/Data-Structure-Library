import java.util.*;
public class Queue<Template>{
	Node front;
	Node rear;
	int size;

	Queue()
	{
		front=null;
		rear=null;
		size=0;
	}
	class Node
	{
		Template data;
		Node next;

		Node(Template data)
		{
			this.data=data;
			next=null;
		}
	}

	public boolean isEmpty()
	{
		if(front==null) return true;
		else return false;
	}

	public void enqueue(Template data)
	{
		Node newNode=new Node(data);
		if(isEmpty())
		{
			front=rear=newNode;
		}
		else{
			rear.next=newNode;
			rear=newNode;
		}
		size++;
	}

	public Template dequeue()
	{

		if(isEmpty())
		{
			System.out.println("Empty Queue");
			return null;
		}
		else{

				Node temp=front;
				front=front.next;
				return temp.data;
		}
	}

	public Template getFront()
	{
		if(isEmpty()) return null;
		else return front.data;
	}

}