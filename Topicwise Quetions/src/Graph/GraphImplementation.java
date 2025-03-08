package Graph;

import java.util.ArrayList;

//Adjacency List
public class GraphImplementation {

    static class Edge{
        int src;        //source
        int dest;       //destination
        int wt;

        public Edge(int s, int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){        //after creating graph array, it contains all null values in each array, we can't store value in null array in java
        for(int i=0;i<graph.length; i++){                           //so we have to create empty arrayList
            graph[i]= new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));

        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));

    }

    public static void main(String[] args) {
        int V =4;
        ArrayList<Edge> graph [] = new ArrayList[V];
        createGraph(graph);

        //printing 2's neighbours
        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest+" , "+e.wt);
        }
    }
}
