import java.util.*;
// Memory efficient doubluy linked list 
// also called as XOR linked List
public class MemoryEfficientDoubleLinkedList{
	Node head;
	Node tail;

	class Node{
		int data;
		Node ptrdiff;

		Node(int d)
		{
			data=d;
			ptrdiff=null;
		}
	}

	public void insert(int new_data)
	{
		Node newNode=new Node(new_data);
		
	}
}