import java.util.*;
public class NewBalancedParentCodeVita{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int itr=0;
		int n=sc.nextInt();
		sc.nextLine();
		while(itr++<n)
		{
			String str=new String();
			str=sc.nextLine();
			int len=str.length();
			//System.out.println("len is: "+len);
			LinkedList<Character> stack=new LinkedList<Character>();
			int status=1;
			int i=0;
			for(;i<len;i++)
			{
				//System.out.println(str.charAt(i));
				//System.out.println("status is: "+status);
				if((str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{'||str.charAt(i)=='<'||str.charAt(i)=='/')&&status==1)
				{
					stack.push(str.charAt(i));
				}
				else if(str.charAt(i)=='@')
				{
					if(i!=len-1&&str.charAt(i+1)=='*')
					{
						stack.push(str.charAt(i));
						stack.push(str.charAt(i+1));
						i++;
						status=0;
					}
				}
				else if(str.charAt(i)=='*')
				{
					if(i!=len-1&&str.charAt(i+1)=='@'&&status==0)
					{
						stack.pop();
						stack.pop();
						status=1;
						i++;
					}
				}

				else if((str.charAt(i)==')'|| str.charAt(i)=='}'|| str.charAt(i)==']'||str.charAt(i)=='>'||str.charAt(i)=='\\')&&status==1)
				{
					//System.out.println("m inc closin ese");
					char top;
					if(stack.size()!=0)
					{
						top=stack.getFirst();
					}
					else break;
					if(isMatch(top,str.charAt(i)))
					{
						stack.pop();
					}
					else break;
				}
			}
			if(status==0)
			{
				stack.pop();
				stack.pop();
			}
			//System.out.println("i is: "+i);
			if(stack.size()==0&&i==len)
				System.out.println("True");
			else
				System.out.println("False");
		}
	}

	static boolean isMatch(char ch1,char ch2)
	{
		if(ch1=='('&&ch2==')')
			return true;
		else if(ch1=='{'&&ch2=='}') return true;
		else if(ch1=='['&&ch2==']') return true;
		else if(ch1=='<'&&ch2=='>') return true;
		else if(ch1=='/'&&ch2=='\\') return true;
		return false;
	}
}