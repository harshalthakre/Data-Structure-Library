import java.util.*;
public class MultiPlicationVita{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int itr=2;
		boolean status=true;
		while(true)
		{
			long number=n*itr++;
			String str=Long.toHexString(number);
			str=str.toUpperCase();

			//System.out.println(str);
			int len=str.length();
				if(len>7)
				{
					System.out.println("NOTFOUND");
					return;
				}	
			int arr[]=new int[16];
			Arrays.fill(arr,0);
			for(int i=0;i<len;i++)
			{
				int ch=(int)str.charAt(i);
				//System.out.println("ch: "+ch);
				if(ch>=65&&ch<=70)
				{
					int numi=ch-55;
					arr[numi]++;
				}
				else{
					arr[ch-48]++;
				}
			}

			int cnt=0;
			//int maxy=-1;
			for(int i=0;i<16;i++)
			{
				if(arr[i]>0)
					cnt++;
			}

			if(cnt==2)
			{
				//int i=0;
				char top=str.charAt(0);
				int j=0;
				for(int i=1;i<len;i++)
				{
					if(str.charAt(i)!=top)
					{
						j=i;
						break;
					}
				}
				int myass=1;
				for(;j<len;j++)
				{
					if(str.charAt(j)==top)
					{
						myass=0;
						break;
					}
				}

				if(myass==1)
				{
					System.out.println(str);
					break;
				}
			}

		}
	}
}