import java.util.*;
public class StockSpanProblem{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int res[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Stack<Integer> stk=new Stack<Integer>();
		stk.push(0);
		
		res[0]=1;
		int temp=0;
		for(int i=1;i<n;i++)
		{	
			if(arr[i]>=arr[stk.getStackTop()])
			{
					res[i]=1;
						while(!stk.isStackEmpty()&&arr[i]>=arr[stk.getStackTop()])
					{
						System.out.print(stk.getStackTop()+" "+arr[i]);
						temp=res[stk.getStackTop()];
						System.out.println(" "+temp);
						res[i]=res[i]+temp;

						int zandu=stk.pop();
						System.out.println(stk.getStackTop());
					}
			}
			
			else{
				res[i]=1;
			}
			stk.push(i);			
		}

		System.out.println("========================================");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println("\n========================================");
		for(int i=0;i<n;i++)
			System.out.print(res[i]+" ");	
	}
}