import java.util.*;
public class FindLargestMultipleOf3{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;

		Queue<Integer> queue1=new Queue<Integer>();
		Queue<Integer> queue2=new Queue<Integer>();
		Queue<Integer> queue3=new Queue<Integer>();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];

			if(arr[i]%3==0)
				queue1.enqueue(arr[i]);
			else if(arr[i]%3==1)
				queue2.enqueue(arr[i]);
			else if(arr[i]%3==2)
				queue3.enqueue(arr[i]);

		}

		if(sum%3==0)
		{
			Arrays.sort(arr);
			for(int i=n-1;i>=0;i--)
				System.out.print(arr[i]);
			return;
		}
		else if(sum%3==1)
		{
			if(!queue2.isEmpty())
			{
				int zand=queue2.dequeue();
			}
			else if(!queue3.isEmpty())
			{
				int zand=queue3.dequeue();
				if(!queue3.isEmpty())
				{
					int doublezand=queue3.dequeue();
				}
				else
				{
					System.out.println("Number is not possible");
					return;
				}
			}
			else
			{
				System.out.println("Number is not possible");
				return;
			}
		}
		else if(sum%2==1)
		{
			if(!queue3.isEmpty())
			{
				int zand=queue3.dequeue();
			}
			else if(!queue2.isEmpty())
			{
				int zand=queue2.dequeue();
				if(!queue2.isEmpty())
				{
					int doublezand=queue2.dequeue();
				}
				else{
					System.out.println("Number is not possible");
					return;
				}
				
			}
			else
				{
					System.out.println("Number is not possible");
					return;
				}
		}

		int i=0;
		
		for(int j=0;j<n;j++)
			arr[j]=0;


		if(queue1.isEmpty()&&queue2.isEmpty()&&queue3.isEmpty())
		{
			System.out.println("Number not possible");
			return;
		}
		while(!queue1.isEmpty())
		{
			arr[i++]=queue1.dequeue();
			
		}
		while(!queue2.isEmpty())
		{
			arr[i++]=queue2.dequeue();
			
		}
		while(!queue3.isEmpty())
		{
			arr[i++]=queue3.dequeue();
			
		}

		int checksum=0;
		for(int j=0;j<n;j++)
			checksum+=arr[j];

		if(checksum%3!=0)
		{
			System.out.println("Number not possible");
			return;
		}
		Arrays.sort(arr);
		for(int j=n-1;j>=(n-i);j--)
			System.out.println(arr[j]);



	}
}