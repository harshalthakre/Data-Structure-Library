import java.util.*;
 class Animal{
	/*void run()
	{
		System.out.println("run Animal");
	}*/
	Animal()
	{
		System.out.println("Animal Constructor");
	}
	Animal(String s)
	{
		System.out.println(s+" Animal");
	}
}
interface Dog {

	void bark() throws RuntimeException;
}

// interface can only implenet 
//nt extend the classes
class Cat extends Animal{
	Cat()
	{
		System.out.println("Cat Constructor");
	}
	Cat(String s)
	{
		super(s);

		System.out.println(s+" Cat");
	}

}
