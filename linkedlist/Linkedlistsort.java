package linkedlist; 
class Node{
    int data;
    Node next;
    Node head;
}

public class Linkedlistsort {
    public Node insert(Node head , int data){
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
    public void sortNode(Node head){
        int temp;
        Node curr = head , index = null;
        while(curr.next!=null){
            index = curr.next;
            while(index!=null){
                if(curr.data>index.data){
                    temp = curr.data;
                    curr.data = index.data;
                    index.data = temp;

                }
                index = index.next;
            }
            curr = curr.next;

        }
    }
    public void printlist(Node head){
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
            n = n.next;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        Linkedlistsort lls = new Linkedlistsort();
        Node head = null;
         head = lls.insert(head, 2);
         lls.insert(head, 4);
         lls.insert(head, 1);
         lls.insert(head, 3);
         lls.insert(head, 5);
         lls.insert(head, 8);
         lls.insert(head, 6);
         lls.printlist(head);
         lls.sortNode(head);
         lls.printlist(head);
        
    }
}
