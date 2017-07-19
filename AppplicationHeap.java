import java.util.*;
public class AppplicationHeap{
	public static void main(String args[]){
		Heap h=new Heap();
		Scanner  sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
			h.insert(sc.nextInt());
		h.print();
		//System.out.println("\nHey m maxy: "+h.deleteMax());

		//h.print();

		//System.out.println("\nHey m maxy: "+h.deleteMax());
		System.out.println("hey m mini "+h.findMin());
		//h.print();
		System.out.println("delete "+h.deleteArbitary(sc.nextInt()));

		h.print();

	/*	System.out.println("GO FOR YOUR ARRAY AND MAKE IT HEAP\nEnter length: ");

		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<len;i++)
			arr[i]=sc.nextInt();

		Heap t=new Heap();
		System.out.println("Heap Build succesfully: "+t.buildHeap(arr));
		t.print();
*/

	}


}