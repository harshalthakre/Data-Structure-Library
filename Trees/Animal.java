import java.util.*;

interface A{
	//public void greet();
}

class Zand{
	static int x=10;
	
	{
		System.out.println("isntance block of zand:: "+aba);
	}

	int aba=9;
	public String greet()
	{
		System.out.println("zaand");
		return new String();
	}

	static void eat()
	{
		System.out.println("parent is eating");
	}
}
class Animal extends Zand implements A 
{
	//float f=65.6; possibleloss  of conversion
	
	public String greet()
	{
		return new String();
	}
	public static void main(String[] args) {
	 
	 Animal ana=new Animal();
	 	int a=5;
	 	System.out.println("x is staic x: "+x);
	 	check(a++,++a);
	 	System.out.println(a);
	 }

	 static void check(int x,int y)
	 {
	 	eat(x);
	 	System.out.println("X: "+x+" Y: "+y);
	 } 

	 static void eat(int x)
	{
		System.out.println("child is eating: "+x);
	}
}