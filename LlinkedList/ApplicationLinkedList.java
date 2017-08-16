import java.util.*;
public class ApplicationLinkedList{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		LinkedList list=new LinkedList();
		int n=sc.nextInt();
		int itr=0;
		while(itr<n)
		{
			list.append(sc.nextInt());
			itr++;
		}
		/*list.append(sc.nextInt());
		list.append(sc.nextInt());
		list.append(sc.nextInt());
		//list.push(sc.nextInt());
		//list.push(sc.nextInt());
		list.append(sc.nextInt());
		list.append(sc.nextInt());
		list.append(sc.nextInt());
		list.append(sc.nextInt());
		list.append(sc.nextInt());
		list.append(sc.nextInt());*/
		//list.insertAfter(list.head.next,sc.nextInt());

		//list.printList();
		//list.delete(0);
		//list.printList();
		//list.deletePos(0);
		//list.printList();
		//list.getMiddle();
		//System.out.println("\nTOTAL COUNT: "+list.getCount());
	//	System.out.println("\n")
	//	int opt=sc.nextInt();
	//	switch()

		//list.swap(sc.nextInt(),sc.nextInt());
		//list.printList();
		//System.out.println("LENGTH OF STRING IS: "+list.getLength());
		//list.getNEnd(sc.nextInt());

		/*list.reverse();
		System.out.println("\nAFTER REVERSING: ");
		list.printList();
		list.printByRecurssion();
		list.printReverse();

		LinkedList l2=new LinkedList();
		System.out.println("\nEnter the LENGTH of linked list 2");
		int len=sc.nextInt();
		itr=0;
		while(itr<len)
		{
			itr++;
			l2.append(sc.nextInt());
		}

		l2.printList();
		l2.printReverse();

		list.compareList(l2);

		LinkedList sumList=new LinkedList();
		sumList=list.addFormList(l2);
		sumList.printList();

		LinkedList majo=new LinkedList();
		majo=list.mergeInOrder(l2);
		majo.printList();*/

		//list.rotate(4);
		//System.out.println();
		//list.checkPalindrome();
		//list.removeDuplicates();
		//System.out.println("AFTER REMOVING DUPLICATES: ");
		//list.detect()
		//list.findMergePoint();
		//list.forXOR();
		list.printList();
		System.out.println();
		/*list.myReverse();
		list.printList();*/
		System.out.println("printin level rev: \n");
		list.reverseInPair();
		list.printList();


	}
}