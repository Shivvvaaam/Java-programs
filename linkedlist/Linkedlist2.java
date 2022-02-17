package linkedlist; 
class Node{
    int data;
    Node next;
    Node head;
}

public class Linkedlist2 {
    Node head;
    public Node insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head==null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
        return node;
    }
    public void printlist(Node head){
        Node n = head;
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
        }
    }
    public Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
       return prev;
        // return node;
    }
    public static void main(String[] args) {
        Linkedlist2 ll2 = new Linkedlist2();
        // Node node = new Node();
         Node head =    ll2.insert(5);
            ll2.insert(6);
            ll2.insert(9);
            ll2.insert(10);
            ll2.printlist(head);
            head = ll2.reverse(head);
            ll2.printlist(head);

        
    }
}
