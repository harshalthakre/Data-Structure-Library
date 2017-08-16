import java.util.*;
public class Skyline{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int itr=0;
		while(itr++<t){
			int p=sc.nextInt();
			int q=sc.nextInt();

			int array1[]=new int[p];
			int array2[]=new int[p];

			for(int i=0;i<p;i++)
			{
				array2[i]=0;
				array1[i]=sc.nextInt();
			}

			int max=array1[0];
			int flg=0;
			for(int i=0;i<p;i++)
			{
				if(array1[i]>max){
					max=array1[i];
					flg=i;
				}
			}

			array2[flg]=max;
			int tp=0;
			int diff=0;
			int j=0;
			//System.out.println(array2[flg]);
			for(j=flg-1;j>=0;j--)
			{
				array2[j]=array2[j+1]-1;
				tp=array2[j];

				if(array2[j]>array1[j]){
					array2[j]=tp;
				}
				else{
					array2[j]=array1[j];
                diff=array2[j+1]-array2[j];
                if((diff==-1)||(diff==0)||(diff==1))
                    array2[j+1]=array2[j+1];
                else
                    array2[j+1]=array2[j+1]+1;
				}
			}

			for(j=flg+1;j<p;j++)
        {
            array2[j]=array2[j-1]-1;
            tp=array2[j];
            if(array2[j]>array1[j])
            {
                array2[j]=tp;
            }
            else
            {
                array2[j]=array1[j];
                diff=array2[j]-array2[j-1];
                if((diff==1)||(diff==0)||(diff==-1))
                {
                    array2[j]=array1[j];
                }
                else
                {
                    array2[j-1]=array2[j-1]+1;
                }
            }
        }
        /*System.out.println("series");
        for(j=0;j<m;j++)
        {
        	System.out.println(array2[j]);
        }*/

        System.out.println(array2[q-1]);
		}

	}
}