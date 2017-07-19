import java.util.*;
public class LargestRectangularHistogramMyWayN{
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
			int area=0;
			for(int i=0;i<n;i++)
			{
				int minima=arr[i];
				for(int j=i;j<n;j++)
				{
					if(i==j)
					{
						area=arr[i]*1;
					}
					else if(minima>arr[j])
					{
						area=arr[j]*1;
						area=area*(j-i+1);
						minima=arr[j];
					}
					else if(minima<=arr[j])
					{
						area=minima*1;
						area=area*(j-i+1);

					}

					if(area>maxy)
						maxy=area;
					area=0;
				}
			}
			System.out.println(maxy);

	}
}