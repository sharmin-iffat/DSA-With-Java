package LinkedList;

public class Cycle {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }  
    }
    public static boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;
        if(head == null || head.next == null){
            return false;
        }
        while(fast != null){
            if(slow == null) return false;
            slow = slow.next;
            if(fast.next == null) return false;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
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
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(4);
        // Node e = new Node(4);
        // Node f = new Node(9);
        // Node g = new Node(10);
        // Node h = new Node(15);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;
        // e.next = f;
        // f.next = g;
        // g.next = h;

        // display(a);
        
        System.out.println(hasCycle(a));
       
    }
    
}
