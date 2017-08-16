import java.util.*;
public class FiboRightAngle{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int first=2;
		int second=3;
		int res=0;
		int count=0;
		while(true){
			count++;
			res=first+second;
			first=second;
			second=res;

			if(count%2!=0)
			{
				//System.out.println(res);
				if(res>n)
				{
					if(res%2!=0)
					break;
				}
			}
			
		}
		double faco=(2.0/(Math.sqrt(5)))*res;
		long fnal=Math.round(faco);
		
			//System.out.println(fnal);
		int factors=2;
		for(int i=2;i<fnal;i++)
		{
			if(fnal%i==0)
				factors++;
		}
		System.out.println(factors);
	}
}