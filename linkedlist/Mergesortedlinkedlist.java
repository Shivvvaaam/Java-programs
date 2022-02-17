package linkedlist;

public class Mergesortedlinkedlist {
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
    public void mergelinkedlist(Node head1 , Node head2){
        Node curr1 = head1;
        Node curr2 = head2;
        Node curr3 = null;
        while(curr1!=null && curr2!=null){
            if(curr1.data<curr2.data){
                

            }
        }


    }
    
}
