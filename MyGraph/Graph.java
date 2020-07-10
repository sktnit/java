package MyGraph;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Iterator;
import java.util.Vector;
import java.util.List;
import java.util.ArrayList;
class MyGraph{
	private int numofVertices;
	private LinkedList<Integer> adjLists[];
	
	void addEdge(int src, int dest)
    {
        adjLists[src].add(dest);
    }
	
	void initialize(int[][] adjacencyMatrix) {
		this.numofVertices = adjacencyMatrix.length;
		adjLists = new LinkedList[numofVertices];
		for (int i = 0; i < numofVertices; i++)
			adjLists[i] = new LinkedList();
		for(int i = 0; i < numofVertices;i++) {
			for(int j = 0; j < numofVertices; j++) {
				if(adjacencyMatrix[i][j] == 1)
					addEdge(i, j);
			}
		}
	}
	
	String DFS(int id) 
    { 
		String result= new String();
        // Initially all vertices as not visited 
        Vector<Boolean> visited = new Vector<Boolean>(numofVertices); 
        for (int i = 0; i < numofVertices; i++) 
            visited.add(false); 
  
        // Create a stack
        Stack<Integer> stack = new Stack<>(); 
          
        // Push the current source node 
        stack.push(id); 
          
        while(stack.empty() == false) 
        { 
            // Pop a vertex from stack and print it 
            id = stack.peek(); 
            stack.pop(); 
              
            // we need to add the popped item only if it is not visited. 
            if(visited.get(id) == false) 
            { 
                result = result + String.valueOf(id) + " "; 
                visited.set(id, true); 
            } 
              
            // Get all adjacent vertices of the popped vertex id If a adjacent has not been visited, then push it to the stack. 
            Iterator<Integer> i = adjLists[id].iterator(); 
              
            while (i.hasNext())  
            { 
                int v = i.next(); 
                if(!visited.get(v)) 
                    stack.push(v); 
            }    
        } 
        return result;
    } 
	
	String BFS(int id) 
    { 
        // Initially all the vertices as not visited
		String result=new String();
        boolean visited[] = new boolean[numofVertices]; 
  
        // Create a queue
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
  
        // Mark the current node as visited and enqueue it 
        visited[id]=true; 
        queue.add(id); 
  
        while (queue.size() != 0) 
        { 
            // Dequeue a vertex from queue and add
            id = queue.poll(); 
            result = result + String.valueOf(id) + " ";
  
            // Get all adjacent vertices of the dequeued vertex id If a adjacent has not been visited, then mark it visited and enqueue it 
            Iterator<Integer> i = adjLists[id].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        }
        return result;
    }
	
	int outDegree(int id) 
    {       
		int count=0;
		for(Integer i: adjLists[id]){ 
			count++;
		}  
		return count;
    }
	
	List<Integer> pathList(Integer id1, Integer id2, boolean[] Visited, List<Integer> pathlist) 
	{ 
		// Mark the current node 
		Visited[id1] = true;
		if (id1.equals(id2))  
		{ 
			Visited[id1]= false;
			return pathlist;
		} 

		// call function for all the vertices adjacent to current vertex 
		for (Integer i : adjLists[id1])  
		{ 
			if (!Visited[i]) 
			{ 
				// store current node in pathList
				pathlist.add(i); 
				pathList(i, id2, Visited, pathlist); 
				
				// remove current node in pathList 
				pathlist.remove(i); 
				} 
		} 

		// Mark the current node 
		Visited[id1] = false; 
	} 
	
	int hops(int id1, int id2) {
		boolean[] Visited = new boolean[numofVertices]; 
        List<Integer> pathlist = new ArrayList<>(); 
          
        //add source to path 
        pathlist.add(id1); 
          
        //Call recursive utility 
       pathlist = pathList(id1, id2, Visited, pathlist); 
	}
}
public class Graph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] adjacencyMatrix = new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				Scanner sc = new Scanner(System.in);
				adjacencyMatrix[i][j] = sc.nextInt();
			}
		}
		MyGraph graph = new MyGraph();
		graph.initialize(adjacencyMatrix);
		System.out.print(graph.DFS(0));
	}

}
