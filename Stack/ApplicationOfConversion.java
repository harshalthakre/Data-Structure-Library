import java.util.*;
public class ApplicationOfConversion{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int itr=0;
        while(itr++<n)
            {
            String str=new String(sc.next());
		Conversion con=new Conversion();
		
		boolean result=con.checkBalancedParenthesis(str);
		String res=result?"YES":"NO";

		
		System.out.println(res);
           // result=false;
			}

		/*String postfix=con.infixToPostfix(str);
		System.out.println(postfix);
		String prefix=con.infixToPrefix(str);
		System.out.println(prefix);

		int res=con.evaluatePostfix(postfix);
		System.out.println("Answer is: "+res);


		int ans=con.evaluatePrefix(prefix);
		System.out.println("Anwer for prefix: "+ans);

		String vapasInfix=con.postfixToinfix(postfix);
		System.out.println("Infix is : "+vapasInfix);

		String vapasDoubleInfix=con.prefixToinfix(prefix);
		System.out.println("Infix Double is : "+vapasDoubleInfix);*/

	}
}