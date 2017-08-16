import java.util.*;
public class CircularLinkedList{
	Node head;

	class Node{
		int data;
		Node next;

			Node()
		{
			data=0;
			next=head;
		}
		Node(int newData)
		{
			data=newData;
			next=head;
		}
	}

	

	public void append(int newData)
	{
		Node temp=head;
		Node newNode=new Node(newData);
		if(head==null)
		{
			head=newNode;
			newNode.next=head;
		}
		else
		{
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.next=head;
		}
	}

	public void printList()
	{
		
		Node current=head;
		if(head==null)
		{
			System.out.println("\nEmpty List");
			return;
		}
		else
		{		
			while(current.next!=head)
			{
				System.out.print(current.data+" ");
				current=current.next;
			}
			System.out.print(current.data+" ");
		}
	}

	public void splitHalf(CircularLinkedList list1,CircularLinkedList list2)
	{
		Node fast=head;
		Node slow=head;

		if(head==null||head.next==head)
		{

			System.out.println("Cannot be Splitted DUDE");
			//list1.head=new Node(100);
			//list1.head.next=list1.head;
			//list2.head=new Node(100);
			//list2.head.next=list2.head;
			//list1.printList();
			//list2.printList();
			return;
		}
		else
		{
			//System.out.println(" be Splitted DUDE");
			fast=fast.next;
				fast=fast.next;
				slow=slow.next;
			while(fast.next!=head&&fast!=head)
			{
				//System.out.println("w1");
				fast=fast.next;
				fast=fast.next;
				slow=slow.next;
			}

			Node temp=head;
			while(temp!=slow)
			{
				//System.out.println("w2");
				list1.append(temp.data);
				temp=temp.next;
			}
			if(fast!=head)
			{
				list1.append(temp.data);
			 temp=slow.next;
			}
			else{
					temp=slow;
			}
			while(temp!=head)
			{
				//System.out.println("w3");
				list2.append(temp.data);
				temp=temp.next;
			}
		}

	}

}