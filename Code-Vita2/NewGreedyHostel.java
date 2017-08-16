import java.util.*;
public class NewGreedyHostel{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int itr=0;
		int sum=0;
		while(itr++<n){

			String str=new String(sc.next());
			int nf=0;
			int i=0;
			nf=0;
			for(;i<5;i++)
			{
				if(str.charAt(i)=='J'&&str.charAt(i+1)=='A')
				{
					nf=nf*10+0;
				}

				else if(str.charAt(i)=='I'&&str.charAt(i+1)=='B')
				{
					nf=nf*10+1;
				}

				else if(str.charAt(i)=='H'&&str.charAt(i+1)=='C')
				{
					nf=nf*10+2;
				}

				else if(str.charAt(i)=='G'&&str.charAt(i+1)=='D')
				{
					nf=nf*10+3;
				}

				else if(str.charAt(i)=='F'&&str.charAt(i+1)=='E')
				{
					nf=nf*10+4;
				}
				else{
					nf=nf*10+((int)str.charAt(i)-65);
				}
			}

			nf=nf*10+((int)str.charAt(i)-65);	
			//System.out.println(nf);
			sum+=nf;
		}

		int actual=sc.nextInt();
		if(sum>actual)
		{
			System.out.println("GREEDY");
			System.out.println(sum-actual);
		}
		else
			System.out.println("INNOCENT");
	}
}