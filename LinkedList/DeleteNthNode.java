package LinkedList;

public class DeleteNthNode {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }  
    }
    public static Node deleteNthFromEnd(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i=1; i<=n; i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast.next != null){
            slow = slow.next;
            fast= fast.next;
        }
        slow.next= slow.next.next;
        return head;
    }


    public static void display(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp= temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(4);
        Node f = new Node(9);
        Node g = new Node(10);
        Node h = new Node(15);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        display(a);
        a = deleteNthFromEnd(h, 3);
        display(a);
       
    }
}