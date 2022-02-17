package Trees;

import java.util.*;
class Node{
    int data;
    Node left , right;
    public Node(int data){
        this.data = data;

    }
}

public class Binarytree {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node tree = createTree();
        inOrder(tree);
        System.out.println();
        preOrder(tree);
        System.out.println();
        postOrder(tree);
    }
    static Node createTree(){
        Node root = null;
        System.out.println("enter data");
        int data = sc.nextInt();

        if(data==-1){
            return null;
        }
        root = new Node(data);
        System.out.println("enter left for " + data);
        root.left = createTree();
        System.out.println("enter right for "+ data);
        root.right = createTree();
        return root;

    }
    static void inOrder(Node root){
        if(root == null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root == null){
            return ;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }
}
