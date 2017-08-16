import java.util.*;
class NewNonDec
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
		x=l;
		for(i=l;i>0;i--)
		{
			if(ch[i]<ch[i-1])
			{
				ch[i-1]--;
				x=i-1;
			}
		}
		i=1;
		if(ch[0]=='0'){
			for (i=1; i<x; i++)
				System.out.print(ch[i]);
			for (i=x+1; i<=l; i++)
				System.out.print("9");}
		else{
			for (i=0; i<=x; i++)
				System.out.print(ch[i]);
			for (i=x+1; i<=l; i++)
				System.out.print("9");
		}
		System.out.println("");
	}
}

	
	
	
