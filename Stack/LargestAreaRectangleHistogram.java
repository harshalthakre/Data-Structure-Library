import java.util.*;
public class LargestAreaRectangleHistogram{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int maxy=0;
		int w=1;
		int h=0;
		int area=0;
		for(int i=0;i<n;i++)
		{
			int jabjo=arr[i];
			for(int j=i;j<n;j++)
			{
				//System.out.println("jabjo: "+jabjo+" "+" arr[i] "+" "+arr[i]+" arr[j] "+arr[j]);
				if(i==j)
				{
					area=jabjo*1;
					//System.out.println("**"+area);
				}
				else if(jabjo>arr[j]){

						area=arr[j]*(j+1-i);
						//System.out.println("**"+area+"  "+j);
						jabjo=arr[j];
				}	
				else if(jabjo<=arr[j])
				{
						area=jabjo*(j+1-i);
						//System.out.println("**"+area);
				}
				if(area>maxy)
					maxy=area;
				area=0;
			}
		}
		System.out.println("Maximum area: "+maxy);
	}
}