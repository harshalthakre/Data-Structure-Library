import java.util.*;
public class ApplicationDoublyLinkedList{
	public static void main(String args[])
	{
		DoublyLinkedList obj=new DoublyLinkedList();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int itr=0;
		while(itr++<n)
		{
			obj.append(sc.nextInt());
		}
		
		//obj.sortedInsert(5);
		//obj.push(2);
		obj.printList();		
		//System.out.println("\nAFTER REVERSIING\n");
		//obj.reverse();
		//System.out.println("\nENTER THE POSITION YOU WANT TO DELEETE");
		//obj.delete(sc.nextInt());
		System.out.println("\nEnter the position you wanted to swap: ");
		obj.swap(sc.nextInt(),sc.nextInt());
		obj.printList();
	}
}