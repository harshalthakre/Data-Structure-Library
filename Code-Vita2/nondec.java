import java.util.*;
class nondec
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long n;
		int i,d,x=0,l;
		n=sc.nextLong();
		String str=""+n;
		l=str.length()-1;
		char[]ch=str.toCharArray();
		for(i=l;i>0;i--)
		{
			if(ch[i]<ch[i-1])
			{
				ch[i-1]--;
				x=i-1;
			}
		}
		i=0;
		while(ch[i]=='0')
			i++;
		while(ch[i]<=x)
		{
			System.out.print(ch[i]);
			i++;
		}
		while(i<=l)
		{
			System.out.print("9");
			i++;
		}
		
		System.out.println("");
	}
}

	
	
	
