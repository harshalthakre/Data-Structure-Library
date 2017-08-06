import java.util.*;
public class UseGraph{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter no of vertices: ");
		int n=sc.nextInt();

		Graph g=new Graph(n);
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is the breadth first traversal of the graph");
        g.breadthFirst(2);
        System.out.println("\nFollowing is the Depth first traversal of the graph");
        g.depthFirst(2);

       // Graph g(5); // 5 vertices numbered from 0 to 4
	  /*  g.addEdge(1, 0);
	    g.addEdge(2, 3);
	    g.addEdge(3, 4);

    	g.findConnected();*/
	}
}