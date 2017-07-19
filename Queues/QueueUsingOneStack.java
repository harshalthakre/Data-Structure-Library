import java.util.*;
public class QueueUsingOneStack{
	Stack<Integer> stack=new Stack<Integer>();

	public boolean isEmpty()
	{
		return stack.isStackEmpty();
	}
	public void enqueue(int data)
	{
		stack.push(data);
	}

	public int dequeue()
	{
		int res=0;
		int x=0;

		if(stack.isStackEmpty())
		{
			System.out.println("Error");
			return -1;
		}
		else if(stack.getStackLength()==1)
			return stack.pop();
		else{

			res=stack.pop();
			 x=dequeue();
			stack.push(res);
			return x;
		}
	}
}