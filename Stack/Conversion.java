import java.util.*;
public class Conversion{
	
	public boolean checkBalancedParenthesis(String str)
	{
		Stack<Character> stk=new Stack<Character>();
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if(isOpeningParenthesis(str.charAt(i)))
			{
				stk.push(str.charAt(i));
			}
			else if(isClosingParenthesis(str.charAt(i))){
				char top=stk.getStackTop();
				if(!sameTypeParenthesis(str.charAt(i),top)){
					return false;
				}
				else{
					char zand=stk.pop();
				}
			}	
		}
		return stk.isStackEmpty()?true:false;

	}

	public  boolean isOpeningParenthesis(char ch)
	{
		if(ch=='('||ch=='['||ch=='{'){
			return true;
		}
		else
			return false;
	}

	public boolean isClosingParenthesis(char ch){
		if(ch==')'||ch==']'||ch=='}'){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean sameTypeParenthesis(char close,char open){
		if(open=='('&&close==')') return true;
		else if(open=='[' && close==']') return true;
		else if(open=='{' && close=='}') return true;
		else return false;
	}	

	public String infixToPostfix(String str)
	{
		String result="";
		Stack<Character> stk=new Stack<Character>();
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if(isOperand(str.charAt(i)))
			{
				result=result+str.charAt(i); // character can be append to the string in java;
			}
			else if(isOperator(str.charAt(i)))
			{

				while(!stk.isStackEmpty()&&stk.getStackTop()!='(' && hasHigherPrecedence(stk.getStackTop(),str.charAt(i))){
					result=result+stk.getStackTop();
					char zand=stk.pop();
					//System.out.println("inside while");
				}
				stk.push(str.charAt(i));
			}
			else if(str.charAt(i)=='('){
				stk.push(str.charAt(i));
			}
			else if(str.charAt(i)==')'){
				
				while(!stk.isStackEmpty()&&stk.getStackTop()!='('){
					result=result+stk.getStackTop();
					char zand=stk.pop();
				}
				stk.pop();
			}
		}
		while(!stk.isStackEmpty()){
			result=result+stk.pop();
		}

		return result;	
	}
	public boolean isOperand(char ch){
		if(ch>='0'&&ch<='9') return true;
		else if(ch>='a'&&ch<='z') return true;
		else if(ch>='A'&&ch>='Z') return true;
		else return false;
	}

	public boolean hasHigherPrecedence(char stktop,char operator)
	{
		int top=getWeight(stktop);
		int op=getWeight(operator);

		if(top>op){
			return true;
		}
		else if(top==op)
		{
			return isLeftAssociative(stktop)?true:false;
		}
		else return false;
	}

	public int getWeight(char operator){

		int weight=0;
		switch(operator)
		{
			case '$' : weight=3; break;
			case '^' : weight=3; break;
			case '/' : 
			case '*' : weight=2;
						break;
			case '+' :
			case '-' : weight=1;
						break;

		}
	//	System.out.println("operator is "+operator+" weight is: "+weight);
		return weight;
	}

	public boolean isLeftAssociative(char operator){
		if(operator=='^'||operator=='$'){
			return false;
		}
		else
			return true;
	}

	public boolean isOperator(char ch){
		if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='$'||ch=='^') return true;
		else return false;
	}

	public String infixToPrefix(String str)
	{
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		String readyForPost=changeBrackets(rev);
		String fromPost=infixToPostfix(readyForPost); // discard the associativity rule here
		len=fromPost.length();
		String prefix=""; 
		for(int i=len-1;i>=0;i--){
			prefix=prefix+fromPost.charAt(i);
		}
		return prefix;

	}

	public String changeBrackets(String str){
		int len=str.length();
		String result="";
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)=='('){ result=result+')';}
			else if(str.charAt(i)==')'){result=result+'(';}
			else{
				result=result+str.charAt(i);
			} 
		}
		return result;	
	}


	public int evaluatePostfix(String str){
		Stack<Integer> stk=new Stack<Integer>();
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if(isOperand(str.charAt(i)))
			{
				int temp=Character.getNumericValue(str.charAt(i)); // get integer value correspoding to the character
				stk.push(temp);
			}
			else if(isOperator(str.charAt(i))){
				int op2=stk.pop();
				int op1=stk.pop();
				int result=performOperation(op1,op2,str.charAt(i));
				stk.push(result);
			}
		}

		return stk.getStackTop();	
	}

	public int performOperation(int op1,int op2,char op){

		if(op=='+') return op1+op2;
		else if(op=='-') return op1-op2;
		else if(op=='*') return op1*op2;
		else if(op=='/') return op1/op2;
		else
		return 0; 
	}


	public int evaluatePrefix(String str){
		Stack<Integer> stk=new Stack<Integer>();
		int len=str.length();
		StringBuffer buffer=new StringBuffer(str);  // just for checking fun type activity
		// hehe i could have travelled from end f string hehe
		buffer.reverse();     
		str=new String(buffer);
		for(int i=0;i<len;i++)
		{
			if(isOperand(str.charAt(i))){
				int temp=Character.getNumericValue(str.charAt(i));
				stk.push(temp);
			}
			else if(isOperator(str.charAt(i))){
				int op1=stk.pop();
				int op2=stk.pop();
				int result=performOperation(op1,op2,str.charAt(i));
				stk.push(result);
			}
		}
		return stk.getStackTop();
	}

	public String postfixToinfix(String str)
	{
		Stack<String> stk=new Stack<String>();
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if(isOperand(str.charAt(i))){
				String kabra=Character.toString(str.charAt(i));
				stk.push(kabra);
			}
			else if(isOperator(str.charAt(i))){

				if(stk.getStackLength()<2){
					return "INVALID EXPRESSIONS";
				}
				else{
						String op2=stk.pop();
						String op1=stk.pop();
						String result="("+op1+""+str.charAt(i)+""+op2+")";

						stk.push(result);

				}
			}
		}

		if(stk.getStackLength()==1)
		{
			return stk.getStackTop();
		}
		else
		{
			return "Invalid no Error Expression";
		}
	}

	public String prefixToinfix(String str)
	{
		Stack<String> stk=new Stack<String>();
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			if(isOperand(str.charAt(i))){
				String jabra=Character.toString(str.charAt(i));
				stk.push(jabra);
			}
			else if(isOperator(str.charAt(i))){
				if(stk.getStackLength()<2){
					return "INVALID EXPRESSIONS";
				}
				else{
					String op1=stk.pop();
					String op2=stk.pop();
					String result="("+op1+""+str.charAt(i)+""+op2+")";
					stk.push(result);
				}
			}
		}

		if(stk.getStackLength()==1)
		{
			return stk.getStackTop();
		}
		else
		{
			return "Invalid no Error Expression";
		}
	}
	


}
