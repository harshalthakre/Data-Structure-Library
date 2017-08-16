import java.util.*;
public class DoublyLinkedList{
	Node head;


	class Node{
			int data;
			Node next;
			Node prev;

		Node()
		{
			data=0;
			next=null;
			prev=null;
		}
		Node(int data)
		{
			this.data=data;
			next=null;
			prev=null;
		}
		Node(int data,Node a,Node b)
		{
			this.data=data;
			 prev=a;
			next=b; 
		}
	}

	public void append(int new_data)
	{
		
		Node newNode=new Node(new_data);
		Node temp=head;
		if(head==null)
		{
			head=newNode;
			System.out.println("NODE INSERTED SUCCESFULLY");
			return;
		}
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.prev=temp;
		System.out.println("NODE INSERTED SUCCESFULLY");

	}
	public void push(int new_data)
	{
		Node newNode=new Node(new_data);
		Node temp=head;
		head=newNode;
		newNode.next=temp;
		temp.prev=newNode;
	}

	public void printList()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("EMPTY LIST");
			return;
		}
		while(temp!=null)
		{
			System.out.print(temp.data+" ");

			temp=temp.next;

		}
	}

	public void sortedInsert(int data)
	{
		Node temp=head;
		Node newNode=new Node(data);
		if(head.data>data)
		{
			Node tpo=temp;
			Node piv=null;
			newNode.next=tpo;
			newNode.prev=null;
			head=newNode;
			temp.prev=newNode;
			return;
		}
		while(temp.data<=data&&temp.next!=null)
		{
			temp=temp.next;
		}	
		Node tpo=temp;
		Node piv=temp.prev;
		newNode.next=tpo;
		newNode.prev=piv;
		piv.next=newNode;
		temp.prev=newNode;
	}
	public void reverse()
	{
		Node current=head;
		Node next=null;
		Node prev=null;
		Node temp=null;
		if(head==null)
		{
			System.out.println("EMPTY LIST");
			return;
		}
		else if(current.next==null)
		{

			System.out.println("ONLY ONE NODE, LIST REVERSED ");
			return;
		}
		else
		{
			while(current!=null)
			{
				next=current.next;
				prev=current.prev;
				temp=current;

				current.next=prev;
				current.prev=next;
				
				current=next;
			}
			head=temp;
		}
		return;
	}

	public void delete(int pos)
	{
		Node current=head;
		int len=0;
		if(current==null)
		{
			System.out.println("EMPTY LIST");
			return;
		}
		else if(pos==0)
		{
			Node next=current.next;
			next.prev=null;
			head=next;
		}
		else{

			while(current!=null&&len<pos)
			{
				current=current.next;
				len++;
			}
			if(current==null)
			{
				System.out.println("LIMIT OF POSITION EXCEDDED");
				return;
			}
			Node prev=current.prev;
			Node next=current.next;

			prev.next=next;
		}
	}

	public void swap(int start,int end)
	{
		Node temp=head;
		Node first=null;
		Node second=null;
		if(temp==null)
		{
			System.out.println("\nEMPTY LIST");
			return;
		}
		else if(start>=end)
		{
			System.out.println("INVALID CONDITION");
			return;
		}
		else
		{
			int len=0;
			while(temp!=null&&len!=start-1)
			{
				temp=temp.next;
				len++;
			}
			first=temp;
			while(temp!=null&&len!=end-1)
			{
				temp=temp.next;
				len++;
			}
			second=temp;

			Node prev_first=first.prev;
			Node prev_second=second.prev;
			Node next_first=first.next;
			Node next_second=second.next;

			prev_first.next=second;
			second.prev=prev_first;
			second.next=first.next;
			next_first.prev=second;


			prev_second.next=first;
			first.prev=prev_second;
			first.next=next_second;
			next_second.prev=first;
		}
	}
}