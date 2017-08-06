import java.util.*;
public class Graph{
	int v; // no of vertices
	LinkedHashSet<Integer> adj[]; // Adjacency


	Graph(int v)
	{
		this.v=v;
		this.adj=new LinkedHashSet[v];
		// here you are not creating object yoou are creating array  hence  LinkedHashSet<Integer>[]; ==> generic array creation   
		for(int i=0;i<v;i++)
		{
			adj[i]=new LinkedHashSet<Integer>();
		}
	}

	void addEdge(int v,int w){
		adj[v].add(w);
		//adj[w].add(v); when the graph is undirected
	}


	// breadth first traversal from given source s
	void breadthFirst(int s){
		boolean visited[]=new boolean[this.v];
		Arrays.fill(visited,false);

		LinkedList<Integer> queue=new LinkedList<Integer>();

		visited[s]=true;
		queue.add(s);

		while(queue.size()!=0)
		{
			s=queue.poll();
			System.out.print(s+" ");

			Iterator<Integer> i=adj[s].iterator();
			while(i.hasNext()){
				int n=i.next();

				if(visited[n]==false){
					visited[n]=true;
					queue.add(n);
				}
			}
		}
	}


	void depthFirst(int s)
	{
		boolean visited[]=new boolean[this.v];
		Arrays.fill(visited,false);

		dfs(s,visited);
	}


	void findConnected()
	{
		boolean visited[]=new boolean[this.v];
		Arrays.fill(visited,false);
		int itr=0;
		while(itr<visited.length)
		{
			if(visited[itr]!=true)
			{
				dfs(itr,visited);
			System.out.println();
			}
			itr++;
		}
	}

	void dfs(int s,boolean visited[])
	{
		visited[s]=true;
		System.out.print(s+" ");

		Iterator<Integer> itr=adj[s].iterator();

		while(itr.hasNext()){
			int n=itr.next();
			if(visited[n]==false)
			{
				dfs(n,visited);
			}
		}
	}

	

}