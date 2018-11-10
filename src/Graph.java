import java.util.LinkedList;
import java.util.Iterator;
/**
 * 
 */

/**
 * @author suryatejaparuchuri
 *
 */
public class Graph {
	
	private int V;
	private LinkedList<Integer> adj[];
	
	@SuppressWarnings("unchecked")
	Graph(int v) {
		V = v;
		adj = new LinkedList[V];
		
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	void DFSUtil(int v, boolean visited[]) {
		visited[v] = true;
		System.out.println(v + " ");
		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext()) {
			int n = i.next();
			if (!visited[n]) {
				DFSUtil(n, visited);
			}
		}
	}
	
	void BFS(int s) {
		boolean[] visited = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s] = true;
		queue.add(s);
		while (queue.size() != 0) {
			s = queue.poll();
			System.out.println(s+ " ");
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	
	void DFS(int v) {
		boolean visited[] = new boolean[V];
		DFSUtil(v, visited);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(4);
		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);
        System.out.println("Starting the Depth first traversal from 1");
        g.DFS(1);
        
        System.out.println("Starting the Breadth first traveseral from 1");
        g.BFS(1);
	}

}
