import java.util.*;
public class Dark{
	void start()
	{
		Scanner sc=new Scanner(System.in);
		StringBuilder str = new StringBuilder(sc.nextLine());
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)=='D')
			{
				if(str.charAt(i+1)=='a'&&str.charAt(i+2)=='r'&&str.charAt(i+3)=='k')
				{
					System.out.print("helo");
					str=str.replace(i,1,"+");
					i=i+2;
				}
			}
			if(str.charAt(i)=='P')
			{
				if(str.charAt(i+1)=='e'&&str.charAt(i+2)=='a'&&str.charAt(i+3)=='c'&&str.charAt(i+4)=='e')
				{
					str=str.replace(i,1,"-");
					i=i+3;
				}
			}
		}
		System.out.print(str);

	}
	public static void main(String args[])
	{
		Dark obj=new Dark();
		obj.start();
	}
}