import java.util.*;
class graph1{

    // A utility function to add an edge in an undirected graph
    static void addedge(ArrayList<ArrayList<Integer>> adj, int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // A utility function to print the adjacency list
    // representation of graph
    static void printgraph(ArrayList<ArrayList<Integer>> adj)
    {
        for(int i=0;i<adj.size();i++)
        {
            System.out.println("\nAdjacency list of vertex " +i);
            System.out.print("head");
            for(int j=0;j<adj.get(i).size();j++)
            {
                System.out.print(" --> "+adj.get(i).get(j));
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int v = 5;
        ArrayList <ArrayList <Integer>> adj = new ArrayList<ArrayList <Integer>>(v);
        for(int i=0;i<v;i++)
        adj.add(new ArrayList<Integer>());
        addedge(adj, 0, 1);
        addedge(adj,0 , 4);
        addedge(adj,1,2);
        addedge(adj,1,3);
        addedge(adj, 1, 4);
        addedge(adj, 2, 3);
        addedge(adj, 3, 4);
        printgraph(adj);
    }
}