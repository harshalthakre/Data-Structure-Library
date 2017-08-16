import java.util.*;
public class ApplicationStack{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO STACK WORLD");
		System.out.print("1.PUSH\n2.POP\n3.DISPLAY\n4.exit\nYOUR OPTION: ");
		int opt=sc.nextInt();
		Stack stk=new Stack();
		while(opt<4)
		{

					switch(opt)
				{
					case 1: System.out.print("\nEnter element: ");
							stk.push(sc.nextInt());
							break;

					case 2:
							System.out.println("pooping");
							int x=stk.pop();
							System.out.println("POPPED : "+x);
							break;

					case 3:System.out.println("STACK: \n");
							stk.display();
							System.out.println("******");
							break;
				}

				//System.out.print("1.PUSH\n2.POP\n3.DISPLAY\n4.exit\nYOUR OPTION: ");
				System.out.print("YOUR OPT: ");
				opt=sc.nextInt();
		}
	}
}