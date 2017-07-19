import java.util.*;
public class NextGreaterElement{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];  // check again how to declare two d array in java
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Displaying elements\n==========================================");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
		System.out.println("==========================================");
		Stack<Integer> stk=new Stack<Integer>();
		stk.push(0);
		//I pushed index and not the element coz i have toprint it side by side afterwards thast why
		int res[]=new int[n];
		for(int i=1;i<n;i++)
		{	
			
			while(!stk.isStackEmpty()&&arr[i]>=arr[stk.getStackTop()])
			{

				res[stk.getStackTop()]=arr[i];
				stk.pop();
				
			}
			stk.push(i);
		}
		while(!stk.isStackEmpty())
		{
			res[stk.pop()]=-1;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+"-->"+res[i]);
		}
	}
}