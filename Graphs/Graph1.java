//Adjacenncy list implementation
package Graphs;

import java.util.LinkedList;
import java.util.Scanner;

public class Graph1 {
    LinkedList<Integer> adj[];
    public Graph1(int v){
        adj = new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<Integer>();

        }
    }
    public void addEdge(int source , int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter edges and vertices");
        int e = sc.nextInt();
        int v = sc.nextInt();
        Graph1 graph = new Graph1(v);
        System.out.println("entered list :" +e);
        for(int i=0;i<e;i++){
            int source = sc.nextInt();
            int destination = sc.nextInt();
            graph.addEdge(source, destination);

        }
        

    }
}
