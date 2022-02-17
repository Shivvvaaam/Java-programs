package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    public void dfs(int start){
        Stack<Integer> s = new Stack<Integer>();
        s.push(start);
        vis[start] = true;
        while (!s.isEmpty()) {
            Integer node = s.pop();
            System.out.print(" "+node);
            List<Integer> child = list.get(node);
            for(Integer member : child){
            if(!vis[member]){
                s.push(member);
                vis[member] = true;

            }
        }
        }


    // }

}
public static class Dfs {
    public static void main(String[] args) {
        int nodes = 7;
        Graph a = new Graph(nodes);
        a.addEdge(0, 1);
        a.addEdge(1,0);
        a.addEdge(1, 3);
        a.addEdge(2, 4);
        a.addEdge(3, 5);
        a.addEdge(4, 5);
        a.addEdge(4, 6);

        a.dfs(0);
        // Stack<Integer> s = new Stack<>();
        // s.push(0);
    }
}
}
