import java.util.*;
public class Heap{
	int array[];
	int capacity;
	int count;
	//int type; // consider here we are dealing with max heap

	Heap(){
		array=new int[7];
		capacity=7;
		count=0;
	}

	
	// one by one element insertion starting from a first node
	boolean insert(int data) 
	{
		if(this.capacity==this.count)
			this.resizeHeap();
		this.count++;
		int i=this.count-1;

		while(i>0&&data>this.array[(i-1)/2])
		{
			this.array[i]=this.array[(i-1)/2];
			i=(i-1)/2;
		}
		this.array[i]=data;

		return true;
	}



	void resizeHeap()
	{
		int narr[]=new int[this.capacity*2];

		for(int i=0;i<narr.length;i++)
			narr[i]=-1;
		for(int i=0;i<this.count;i++)
		{
			narr[i]=this.array[i];
		}

		this.array=narr;
		this.capacity=this.capacity*2;
	}

	void resizeHeap(int len)
	{
		int narr[]=new int[len*2];

		for(int i=0;i<narr.length;i++)
			narr[i]=-1;
		for(int i=0;i<this.count;i++)
		{
			narr[i]=this.array[i];
		}

		this.array=narr;
		this.capacity=len*2;
	}

	void print()
	{
		System.out.println("This is the bfs traversal");
		for(int i=0;i<=this.count&&this.array[i]!=-1;i++){
			System.out.print(this.array[i]+" ");
		}
	}


	int deleteMax()
	{
		if(this.count==0)
			return -1;
		else if(this.count==1)
			{
				this.array[0]=-1;
				this.count--;
				return this.array[0];
			}

		int data=this.array[0];
		this.array[0]=this.array[count-1];
		this.array[count-1]=-1;
		this.count--;
		reheapDown(0);
		return data;

	}

	void reheapDown(int i)
	{
		int left=2*i+1;
		int right=2*i+2;
		int data=this.array[i];
		int max=i;
		if(this.array[left]>this.array[right]){
			max=left;
		}
		else {
			max=right;
		}

		if(this.array[max]>this.array[i]){
			this.array[i]=this.array[max];
			this.array[max]=data;
			reheapDown(max);
		}

		return;
	}

	void reheapUp(int i)
	{
		int p=(i-1)/2;
		int data=this.array[i];
		if(data>this.array[p])
		{
			this.array[i]=this.array[p];
			this.array[p]=data;

			reheapUp(p);
		}
	}

	// build complete heap from the array 
	// the approach is different
	boolean buildHeap(int unsorted_array[])
	{
		int len=unsorted_array.length;
		resizeHeap(len*2);
		//Heap(unsorted_array);
		this.array[0]=unsorted_array[0];
		this.count++;
		for(int i=1;i<len;i++)
		{
			this.array[i]=unsorted_array[i];
			this.count++;
			reheapUp(i);
		}

		return true;
	}


}