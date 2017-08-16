import java.util.*;
class LinkedList{
	Node head;
	
	 class Node{
		private int data;
		Node next;

		Node(int d)
		{
			data=d;
			next=null;
		}
	}

// Add new element to the starting of the linked list
// Time complexity of push: o(1) as it does constant amount of work	
	public void push(int new_data)
	{
		Node newNode=new Node(new_data);
		newNode.next=head;
		head=newNode;
		System.out.println("Node inserted Succesfullly");
	}

// Add a  new node after a given node
	public void insertAfter(Node prev_node,int new_data)
	{
		Node newNode=new Node(new_data);
		Node temp=prev_node.next;
		prev_node.next=newNode;
		newNode.next=temp;
		System.out.println("Node inserted Succesfullly");
	}


// Add a new Node to the end of the List
	public void append(int new_data)
	{
		Node newNode=new Node(new_data);
		if(head==null)
		{
			head=newNode;
			System.out.println("Node inserted Succesfullly");
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
		System.out.println("Node inserted Succesfullly");
	}

	public void printList()
	{
		Node temp=head;
		if(temp==null)
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

	public void delete(int key)
	{
		Node temp=head;
		Node prev=null;
		if(temp==null)
		{
			System.out.println("EMPTY LIST||ELEMENT NOT FOUND");
			return;
		}
		while(temp!=null && temp.data!=key)
		{	
				
				prev=temp;
				temp=temp.next;

		}
		if(temp==null)
			System.out.println("ELEMENT NOT FOUND");
		else
		{
			prev.next=temp.next;
			System.out.println("ELEMENT DELETED SUCCESFULLY");
		}
	}

	public void deletePos(int pos)
	{
		Node temp=head;
		Node prev=null;
		if(temp==null)
		{
			System.out.println("||EMPTY 0LIST||");
			return;
		}	
		int cnt=0;
		int itr=0;
		if(pos==0)
		{
			head=temp.next;
			System.out.println("\nDELETED SUCCESFULLY");
			return;
		}
		while(temp!=null&&itr!=pos)
		{
			prev=temp;
			temp=temp.next;
			itr++;
		}
		if(temp==null&&pos>itr)
		{
			System.out.println("INDEX BOUND POSITION");
			return;		
		}
		else
		{
			prev.next=temp.next;
			System.out.println("DELETED SUCCESFULLY");
		}
	}


// get middle of the string 
// Approch is take one pointer iterative(one step ahead) and other pointer which will move tow nodes ahead
// when other fast(two step ahead) pointer will reach at the end then offcourse
	//one step ahead pointer wil be at the middle
	public void getMiddle()
	{
		Node temp=head;
		Node fast=head;

		while(fast!=null&&fast.next!=null)
		{
			temp=temp.next;
			fast=fast.next;
			if(fast!=null)
				fast=fast.next;
		}	

		System.out.println(temp.data);
	}

	public int getCount()
	{
		return getCountRecurssive(head);
	}

	public int getCountRecurssive(Node newNode)
	{
		if(newNode==null)
			return 0;
		else{
			return 1+ getCountRecurssive(newNode.next);
		}
	}

	public void swap(int x,int y)
	{
		Node f=head;
		Node s=head;
		Node fprev=null;
		Node sprev=null;

		if(head==null||head.next==null)
		{
			System.out.println("EMPTY LIST||SINGLE ITEM IN LIST");
			return ;
		}
		else
		{
			while(f!=null&&f.data!=x)
			{
				fprev=f;
				f=f.next;
			}
			if(f==null)
			{
				System.out.println("\n||DATA NOT FOUND");
				return ;
			}
			while(s!=null && s.data!=y)
			{
				sprev=s;
				s=s.next;
			}
			if(s==null)
			{
				System.out.println("\n||DATA NOT FOUND");
				return ;
			}
			System.out.println("f: d: "+f.data+" f: nex: "+f.next);
			System.out.println("s: d: "+s.data+" s: nex: "+s.next);

			if(fprev==null)
				head=s;
			else
				fprev.next=s;
			if(sprev==null)
				head=f;
			else
				sprev.next=f;	
			
			if(f.next==null)
			{
				f.next=s.next;
				s.next=null;
				return;
			}
			 if(s.next==null)
			 {
			 	s.next=f.next;
			 	f.next=null;
			 	return;
			 }
			

			Node temp=f.next;
			f.next=s.next;
			s.next=temp;


			/*Node temp=s;
			fprev.next=s;
			s.next=f.next;		Mistake i have done
			sprev.next=f;
			f.next=temp.next;*/

			System.out.println(temp.data+" *******"+temp.next.data);
			System.out.println("f: d: "+s.data+" f: nex: "+s.next.data);
			System.out.println("s: d: "+f.data+" s: nex: "+f.next.data);
		}

	}


// MY MIDDLE ONE APPROACH
	public void getNEnd(int n)
	{
			Node temp=head;
			int len=getLength();
			int travel=len-n;
			if(travel<0)
			{
				System.out.println("INDEX BOUND");
				return;
			}
			int itr=0;
			while(itr!=travel)
			{
				temp=temp.next;
				itr++;
			}
			System.out.println("YOUR NODE IS: "+temp.data);

	}

// MY APPROACH
	public int getLength()
	{
		Node temp=head;
		Node fast=head;
		int fitr=0;
		int sitr=0;
		int status=1;
		int len=0;
		while(fast!=null&&fast.next!=null)
		{
			fitr++;
			sitr+=2;
			fast=fast.next;
			if(fast.next==null)
				status=0;
			fast=fast.next;
		}
		if(status==1)
		{
			len=2*fitr+1;
			///System.out.println("Length is: "+(2*fitr+1));
		}
		else if(status==0)
		{
			len=2*fitr;
			//System.out.println("Length is: "+(2*fitr));
		}
		return len;

	}

// REVERSE THE LINKED LIST

	public void reverse()
	{
		Node current=head;
		Node temp;
		Node prev=null;

		while(current!=null)
		{
			temp=current.next;
			current.next=prev;
			prev=current;
			current=temp;
		}
		head=prev;
	}

	public void myReverse()
	{
		if(head==null)
			return;
		Node temp=head;
		Node nextNode=temp.next;
		Node prev=null;

		while(nextNode!=null)
		{
			Node mama=nextNode;
			temp.next=prev;
			prev=temp;
			temp=mama;
			nextNode=mama.next;
		}

			Node mama=nextNode;
			temp.next=prev;
			prev=temp;
			temp=mama;
		head=prev;
	}


// PRINT USING RECURSSION

	public void printByRecurssion()
	{
		System.out.println("\nLIST: ");
		printyR(head);	
	}

	public void printyR(Node temp)
	{
		if(temp==null)
			return;
		System.out.print(temp.data+" ");
		printyR(temp.next);
	}

	public void printReverse()
	{
		System.out.println("\nPrinting List REVERSE: ");
		printRev(head);
	}

	public void printRev(Node temp)
	{
		if(temp==null)
			return;
		printRev(temp.next);
		System.out.println(temp.data);
	}

	public void compareList(LinkedList obj)
	{
		Node first=head;
		Node second=obj.head;

		while(first!=null&&second!=null)
		{
			if(first.data!=second.data)
			{
				System.out.println("NOT EQUAL");
				return;
			}
			first=first.next;
			second=second.next;
		}
		if(first==null&&second==null)
		{
			System.out.println("EQUAL");
		}
		else
			System.out.println("NOT EQUAL");
	}


//ADD TWO NUMBERS REPRESENTED BY LINKED LIST
/*
Input:
  First List: 5->6->3  // represents number 365
  Second List: 8->4->2 //  represents number 248
Output
  Resultant list: 3->1->6  // represents number 613
*/
	public LinkedList addFormList(LinkedList obj)
	{
		Node first=head;
		Node second=obj.head;
		LinkedList temp=new LinkedList();
		int sum=0;
		int carry=0;
		while(first!=null||second!=null)
		{
			sum=carry+(first!=null?first.data:0)+(second!=null?second.data:0);
			carry=(sum>10?1:0);
			sum=sum%10;
			temp.append(sum);

			if(first!=null)
				first=first.next;
			if(second!=null)
				second=second.next;
		}

		return temp;
	}


// MERGE TWO SORTE LINKED LIST
//GIVEN:: THE TWO LIST ARE SORTED
	public LinkedList mergeInOrder(LinkedList obj)
	{
		Node first=head;
		Node second=obj.head;
		int f=0;
		int s=0;
			LinkedList list=new LinkedList();
		while(first!=null||second!=null)
		{
			f=(first!=null?first.data:999999);
			s=(second!=null?second.data:9999999);
			if(f<s)
			{
				list.append(f);
				first=first.next;
			}
			else
			{
				list.append(s);
				second=second.next;
			}
		}
		return list;
	}


//ROTATE THE LINKED LIST AFTER K NODES
	public void rotate(int k)
	{
		Node temp=head;
		Node prev=null;
		int cnt=0;
		while(cnt!=k)
		{
			prev=temp;
			temp=temp.next;
			cnt++;
		}
		prev.next=null;
		Node kasa=head;
		head=temp;
		while(temp.next!=null)
			temp=temp.next; 
		
		temp.next=kasa;
	}

//CHECK SINGLE LINKED LIST IS PALINDROME OR NOT
//HERE I USED STACK APPROCH 
// O(N) TIME && O(N) SPACE
	public void checkPalindrome()
	{
		Node temp=head;
		LinkedList stk=new LinkedList();
		
		while(temp!=null)
		{
			stk.push(temp.data);
			temp=temp.next;
		}
		temp=head;
		Node travel=stk.head;
		while(temp!=null&&travel!=null)
		{
			if(temp.data!=travel.data)
			{
				System.out.println("Not PALINDROME");
				return;
			}
			temp=temp.next;
			travel=travel.next;
		}
		System.out.println("PALINDROME");		
	}
// DELETE DUPLICATE FROM SORTED LINKED LIST
	public void removeDuplicates()
	{
		Node temp=head;
		Node prev=null;
		Node next=temp.next;

		while(temp!=null&&next!=null)
		{
			if(temp.data==next.data)
			{
				while(temp.data==next.data &&(temp!=null&&next!=null))
				{
					Node zalla=next.next;
					temp.next=zalla;
					temp=zalla;
					next=zalla.next;
				}

			}
			else
			{
				temp=temp.next;
				next=next.next;
			}
		}
	}

//DETECT LOOP IN LINKED LIST
	public void detectLink()
	{
		Node temp=head;
		Node prev=null;
		ArrayList<Node> arr=new ArrayList<Node>();

		while(temp!=null)
		{	
			if(arr.contains(temp))
			{
				System.out.println("END: "+prev.data);
				System.out.println("START: "+temp.data);
				return;
			}

			arr.add(temp);
			prev=temp;
			temp=temp.next;
		}
	}

//FIND THE MERGE POINT OF THE TWO LINKED LIST

	public void findMergePoint(Node headA,Node headB)
	{
		
		Node first=headA;
		Node second=headB;
		ArrayList<Node>arr=new ArrayList<Node>();

		while(first!=null)
		{
			arr.add(first);
			first=first.next;
		}
		while(second!=null)
		{
			if(arr.contains(second))
			{
				break;
			}
			second=second.next;
		}
		//return second.data;
	}

	/*public void forXOR()
	{
		Node first=head;
		Node second=first.next;

		int sub=first^second;
		System.out.println(sub);
	}*/


	void reverseInPair()
	{
		reverseInPair(head);
	}

	void reverseInPair(Node root)
	{
		if(root==null || root.next==null)
		{
			return;
		}
		Node current=root;
		Node nextNode=current.next;
		head=nextNode;
		Node prev=null;
		while(current!=null&&current.next!=null)
		{
			nextNode=current.next;
			current.next=current.next.next;
			nextNode.next=current;
			if(prev!=null)
			{
				prev.next=nextNode;
			}

			prev=current;
			current=current.next;
		}
	}
}



