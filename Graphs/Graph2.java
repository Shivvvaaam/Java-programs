package Graphs;
//implementing bfs
import java.util.LinkedList;
import java.util.Scanner;

public class Graph2 {
    LinkedList<Integer> adj[];
    public Graph2(int v){
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<Integer>();
        }

    }
    public void addEdge2(int source , int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter edges and vertices");
        int e = sc.nextInt();
        int v = sc.nextInt();
        Graph2 graph2 = new Graph2(v);
        for (int i = 0; i < e; i++) {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            graph2.addEdge2(source, destination);
        }
    }
}
