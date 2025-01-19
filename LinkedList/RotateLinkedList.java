package LinkedList;

public class RotateLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    static Node rotateAList(Node head, int k){
        if(head == null || k==0) return head;

        Node tail = head;
        Node temp = head;
        Node newhead = head;
        
        int size=1;
        while(tail.next!=null){
            size++;
            tail= tail.next;
        }
        k=k%size;
        if(k==0) return head;
        for(int i=0; i<k; i++){
            newhead= newhead.next;
        }

        tail.next = temp;
        for(int i=0; i<k-1; i++){
            temp = temp.next;
        }
        temp.next=null;
        
       
        
        return newhead;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        // Node c = new Node(3);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        int k=7;
        Node ans=rotateAList(a, k);
        
        Node temp = ans;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
}
