package Graphs;
import java.util.*;

class Graph{
    ArrayList<ArrayList<Integer>> list;
    boolean[] vis;
    Graph(int nodes){
        list = new ArrayList<>();
        vis = new boolean[nodes];
        for (int i = 0; i < nodes; i++) {
            list.add(i,new ArrayList<>());
        }

    }
    public void addEdge(int a,int b){
        list.get(a).add(b);
        list.get(b).add(a);
    }
    public void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        vis[start] = true;
        while (!queue.isEmpty()) {
            Integer node = queue.poll();
            System.out.println(" "+node);
            ArrayList<Integer> child = list.get(node);
            for(Integer member : child){
                if(!vis[member]){
                    queue.add(member);
                    vis[member] = true;

                }

            }
        }
    }
    

}
public class Bfs {
    public static void main(String[] args) {
        int nodes = 7;
        Graph a = new Graph(nodes);
        a.addEdge(0, 1);
        a.addEdge(0, 2);
        a.addEdge(0, 3);
        a.addEdge(1, 4);
        a.addEdge(2, 4);
        a.addEdge(2, 5);
        a.addEdge(4, 5);
        a.bfs(0);
    }
    
    
}
