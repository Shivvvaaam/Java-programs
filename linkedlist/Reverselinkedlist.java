package arrays.linkedlist;

public class Reverselinkedlist {
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
    public Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node temp = curr.next;
            curr.next= prev;
            prev = curr;
            curr = temp;

        }
        return prev;

    }
    public static void main(String[] args) {
        
    }
}
