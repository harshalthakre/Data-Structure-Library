import java.util.*;
class GreedyHostel{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int sum[]=new int[n];

		for(int itr=0;itr<n;itr++)
		{
			String str=new String(sc.next());
			//int len=str.length();
			//System.out.println("eln is: "+len);
			int indisum=0;
			for(int i=0;i<6;i++)
			{
				if(i!=5)
				{
							if(str.charAt(i)=='J'&&str.charAt(i+1)=='A')
				{

					indisum=indisum*10+0;
					i++;
				}
					else if(str.charAt(i)=='I'&&str.charAt(i+1)=='B'){
					indisum=indisum*10+1;
					i++;
				}
				else if(str.charAt(i)=='H'&&str.charAt(i+1)=='C'){
					indisum=indisum*10+2;
					i++;
				}
				else if(str.charAt(i)=='G'&&str.charAt(i+1)=='D'){
					indisum=indisum*10+3;
					i++;
				}
				else if(str.charAt(i)=='F'&&str.charAt(i+1)=='E'){
					indisum=indisum*10+4;
					i++;
				}
				else{
					indisum=indisum*10+((int)str.charAt(i)-65);
					//System.out.println("indisum ELE 1:"+indisum);
				}
				}
				else{
					indisum=indisum*10+((int)str.charAt(i)-65);	
					//	System.out.println("indisum EL 2:"+indisum);
				}

			}
			sum[itr]=indisum;
		//	System.out.println("indi : "+indisum);
		}
		int actual=sc.nextInt();
		int maxa=0;
		for(int i=0;i<n;i++)
			maxa+=sum[i];
		//System.out.println(maxa);


		if(maxa>actual)
			{
				System.out.println("GREEDY");
				System.out.println(maxa-actual);
			}
		else
			System.out.println("INNOCENT");
	}
}