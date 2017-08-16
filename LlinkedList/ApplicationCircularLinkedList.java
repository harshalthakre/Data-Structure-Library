import java.util.*;
public class ApplicationCircularLinkedList{
	public static void main(String args[])
	{
		CircularLinkedList clist=new  CircularLinkedList();
		Scanner sc=new Scanner(System.in);
		System.out.println("\nENter length of linked list: ");
		int itr=0;
		int n=sc.nextInt();

		while(itr++<n)
		{
			clist.append(sc.nextInt());

		}
		clist.printList();

		CircularLinkedList l1=new CircularLinkedList();
		CircularLinkedList l2=new CircularLinkedList();

		clist.splitHalf(l1,l2);
		System.out.println();
		l1.printList();
		System.out.println();
		l2.printList();
	}
}