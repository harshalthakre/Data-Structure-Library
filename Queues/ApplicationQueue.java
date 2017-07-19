import java.util.*;
public class ApplicationQueue{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		//CircularArrayQueue cqueue=new CircularArrayQueue(n);

		//System.out.println(cqueue.dequeue());
		/*cqueue.enqueue(5);
		cqueue.enqueue(4);
		System.out.println(cqueue.dequeue());
		cqueue.enqueue(3);
		cqueue.enqueue(2);*/


		/*Queue<Integer> qba=new Queue<Integer>();
		qba.dequeue();
		System.out.println(qba.dequeue());
		//int kasa=qba.dequeue(); // error as u giving null to int which is primitive
		qba.enqueue(sc.nextInt());
		qba.enqueue(sc.nextInt());
		qba.enqueue(sc.nextInt());
		qba.enqueue(sc.nextInt());
		System.out.println("goo one: "+qba.dequeue());
		int zaba=qba.dequeue();  // outboxing for integer value dequeue returns Integer object which is outboz to primitive then but this doesnt happens to null as ur null refer to object
		System.out.println("zaba: "+zaba);
		qba.enqueue(sc.nextInt());
		qba.enqueue(sc.nextInt());
		qba.enqueue(sc.nextInt());
		System.out.println("goo one: "+qba.dequeue());
		System.out.println("goo one: "+qba.dequeue());*/


		QueueUsingOneStack queue=new QueueUsingOneStack();
		queue.enqueue(sc.nextInt());
		queue.enqueue(sc.nextInt());
		queue.enqueue(sc.nextInt());
		queue.enqueue(sc.nextInt());
		queue.enqueue(sc.nextInt());
		queue.enqueue(sc.nextInt());
		queue.enqueue(sc.nextInt());
		queue.enqueue(sc.nextInt());
		System.out.println("===============================");
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}
}