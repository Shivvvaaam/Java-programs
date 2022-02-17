package linkedlist;
class Node{
    int data;
    Node next;
}
public class Linkedlist1 {
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head==null){
            head = node;
        }else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
        
        
    }
    public void insertat(int data , int index){
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n = head;
        for(int i=0;i<index-1;i++){
             n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }
    public void insertatStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
        
    }
    public  void printlist(){
        Node n = head;
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
        }

    }
    public static void main(String[] args) {
        Linkedlist1 ll = new Linkedlist1();
        ll.insert(2);
        ll.insert(3);
        ll.insert(45);
        ll.insert(8);
        ll.insert(50);
        ll.insertatStart(5);
        ll.insertat(9, 3);
        ll.printlist();
}
    
   
     }

