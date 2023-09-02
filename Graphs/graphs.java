import java.util.*;
import java.util.LinkedList;

public class graphs{
    class Edge{
        int src;
        int dest;
        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public void createGraph(ArrayList<Edge> graph[],int v){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 5));
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(2, 3));
        
        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 2));
        
        graph[5].add(new Edge(5, 1));
        graph[5].add(new Edge(5, 2));

    }
    public void bfs(ArrayList<Edge> graph[] , int v,ArrayList<Integer> al,int start){
        
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[v];
        q.add(start);
        
        while(!q.isEmpty()){
            int currVertex=q.remove();
            if(vis[currVertex]==false){
                // System.out.print(currVertex);
                al.add(currVertex);
                //marking the currentVertex as visited vis[currVertex]=true
                vis[currVertex]=true;
                //getting neighbour's of currentVertex and adding into the queue
                for(int i=0;i<graph[currVertex].size();i++){
                    q.add(graph[currVertex].get(i).dest);
                }
            }
            // System.out.println();
        }
    }
    public void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        System.out.print(curr+"    ");
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dest]==false)
                dfs(graph,e.dest,vis);
        }
    }
    public void printNeighbours(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            if(!graph[i].isEmpty()){
                System.out.println("\nNEIGHBOUR/s OF "+graph[i].get(0).src);
                for(int j=0;j<graph[i].size();j++){
                    System.out.print(graph[i].get(j).dest+"    ");
                }
            }
        }

    }
    public static void main(String[] args){
        int v=6;
        ArrayList<Edge> graph[]=new ArrayList[v];
        graphs g=new graphs();
        boolean vis[]=new boolean[v];
        g.createGraph(graph,v);

        //printing the neighbours of the vertexes
        g.printNeighbours(graph);

        ArrayList<Integer> b=new ArrayList<>();
        System.out.println();

        //pass graph ,number of vertices,arraylist to store the vertexes and starting point of the graph
        g.bfs(graph,v,b,0);
        System.out.println("BFS TRAVERSAL OF THE GRAPH IS " + b);
        System.out.println("DFS TRAVERSAL OF THE GRAPH IS ");
        g.dfs(graph,0,vis);
    }
}

/*
                4-----------2----3-------
              /             |
            0              |
            \             |
             \           |
              1----------5
              */