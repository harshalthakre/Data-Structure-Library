import java.util.*;
public class LearningGraphCodeMonk{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();

		int arr[]=new int[n];
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		TreeSet<Integer> tm[]=new TreeSet[n];
		for(int i=0;i<n;i++){
			tm[i]=new TreeSet<Integer>(new MyCompa());
		}

		for(int i=0;i<m;i++)
		{
			int edge1=sc.nextInt();
			int edge2=sc.nextInt();

			
			tm[edge2-1].add(arr[edge1-1]);
			tm[edge1-1].add(arr[edge2-1]);
		}

		//System.out.println();
		for(int i=0;i<n;i++)
		{
			Iterator itr=tm[i].iterator();
			int j=0;
			Integer value=-1;
			//j++;
			int status=0;
			if(k>tm[i].size()){
				value=-1;
				status=1;
			}

			else{
				while(j<k&&j<tm[i].size())
			{
				value=(Integer)itr.next();
				j++;
			}
				value=(Integer)itr.next();
			}


			//System.out.println("value: "+value);
		
			int x=0;
			if(status==0)
			{
				while(arr[x++]!=value){
			}
			System.out.println(x);
			}
			else{
				System.out.println(value);
			}
		}

	}
}

class MyCompa implements Comparator{

	public int compare(Object ob1,Object ob2){
		Integer i1=(Integer)ob1;
		Integer i2=(Integer)ob2;
		return -i1.compareTo(i2);
	}
}