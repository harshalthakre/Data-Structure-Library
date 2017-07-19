import java.util.*;
public class CircularArrayQueue{
	int arr[];
	int size;
	int capacity;
	int front;
	int rear;

	CircularArrayQueue(int size)
	{
		//this.size=size;
		capacity=size;
		//size=0;
		front=0;
		rear=-1;
		arr=new int[size];
	}

	public boolean isEmptyQueue()
	{
		if(size==0) return true;
		else return false;
	}

	public boolean isFullQueue()
	{
		if(size==capacity) return true;
		else return false;
	}


	public void enqueue(int data)
	{
		if(isFullQueue())
		{
			System.out.println("Queue is Full");
			return;
		}
		else{
			int pos=(rear+1)%capacity;
			arr[pos]=data;
			size++;
		}
	}

	public int dequeue()
	{
		int element=-1;
		if(isEmptyQueue())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		else
		{
			element=arr[front];
			size--;
			front=(front+1)%capacity;
		}
		return element;
	}
}