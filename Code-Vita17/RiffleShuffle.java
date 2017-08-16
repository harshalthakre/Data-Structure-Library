import java.util.*;
public class RiffleShuffle{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();

		int first[]=new int[n/2];
		int second[]=new int[n/2];


		for(int i=0;i<n/2;i++)
		{
			first[i]=i+1;
			second[i]=(n/2)+i+1;
		}
		int combined[]=new int[n];
		combined=combo(first,second);
		
		int shuffle=1;

		while(shuffle<8)
		{
			if(combined[1]==arr[1])
				break;
			else
			{
				for(int i=0;i<n/2;i++)
				{
					first[i]=combined[i];
					second[i]=combined[(n/2)+i];	
				}

				combined=combo(first,second);
				shuffle++;
			}
		}

		/*for(int i=0;i<n;i++)
		{
			System.out.print(combined[i]+" ");
		}*/

		for(int i=0;i<n;i++)
		{
			//if(arr[i]!=combined[i])
		}
		
	}

	static int[] combo(int first[],int second[]){

		int combined[]=new int[first.length*2];
		
		/*for(int i=0;i<first.length;i++)
			System.out.println(first[i]);

		for(int i=0;i<second.length;i++)
			System.out.println(second[i]);*/
		int j=0;
		for(int i=0;i<first.length&&i<second.length;i++)
		{
			//System.out.println(first[i]+"  "+second[i]);
			combined[j++]=first[i];
			combined[j++]=second[i];

		}


	/*	for(int i=0;i<combined.length;i++)
			System.out.println(combined[i]);*/

		return combined;
	}
}	