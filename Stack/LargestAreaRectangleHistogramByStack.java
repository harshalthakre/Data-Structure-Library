import java.util.*;
public class LargestAreaRectangleHistogramByStack{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Stack<Integer> stk=new Stack<Integer>();
		Stack<Integer> pos=new Stack<Integer>();

		stk.push(arr[0]);
		pos.push(0);
		int area=0;
		int maxy=0;
		int h=0;
		int p=0;
		int i=1;
		for(i=1;i<n;i++)
		{
			//System.out.println("arr[i]: "+arr[i]+" "+"stktop: "+stk.getStackTop());
			if(arr[i]<stk.getStackTop())
			{
				while(!stk.isStackEmpty()&&arr[i]<stk.getStackTop())
				{


				h=stk.pop();
				p=pos.pop();
				area=h*(i-p);
				//System.out.println("area: "+area+" h: "+h+" p: "+p);
				

				if(area>maxy)
					maxy=area;

				}
				stk.push(arr[i]);
				pos.push(p);
			}
			else if(arr[i]>stk.getStackTop())
			{
				stk.push(arr[i]);
				pos.push(i);
			}
			if(area>maxy)
				maxy=area;
			area=0;
		}
		if(!stk.isStackEmpty())
		{
			area=stk.pop()*(i-pos.pop());
		}
		if(area>maxy)
			maxy=area;

		System.out.println(maxy);

	}
}