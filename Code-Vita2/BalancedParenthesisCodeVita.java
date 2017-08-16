import java.util.*;
//import java.io.*;
public class BalancedParenthesisCodeVita{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<Character> stack=new LinkedList<Character>();
		int n=sc.nextInt();sc.nextLine();
		int itr=0;
		while(itr++<n)
		{
			String str=new String();
			str=sc.nextLine();
			int len=str.length();
			//System.out.println("len is: "+len);
			int status=1;
			int i=0;
			for(;i<len;i++)
			{
				char ch=str.charAt(i);
				//System.out.println("char is: "+ch);
				if((ch=='('||ch=='{'||ch=='['))
				{
					
					stack.push(ch);
				}
				else if(ch=='@'&&str.charAt(i+1)=='*')
				{
					//stack.pop(ch);
					//stack.pop(str.charAt(i+1));
					i++;
					i++;
					//status=0;

					while(i<len-1)
					{
						if(str.charAt(i)=='*'&&str.charAt(i+1)=='@')
							break;
						i++;
					}
					i++;
					//System.out.println("i is: "+i);
				}

				/*else if(ch=='*'&&str.charAt(i+1)=='@'){
					
					status=1;
					i++;
					
				}*/
				else if(ch==')'|| ch=='}'|| ch==']'){
					
					char top;
					if(stack.size()!=0)
					{
						top=stack.getFirst();
					}
					else
					{
						
						break;
					}
					
					if(isMatch(top,ch))
					{
						stack.pop();
					}
					else{
						break;
					}
				}
			}

			if(stack.size()==0&&i==len&&status==1)
				System.out.println("True");
			else
				System.out.println("False");
			stack.clear();
		}
	}

	static boolean isMatch(char ch1,char ch2)
	{
		if(ch1=='('&&ch2==')')
			return true;
		else if(ch1=='{'&&ch2=='}') return true;
		else if(ch1=='['&&ch2==']') return true;
		return false;
	}
}