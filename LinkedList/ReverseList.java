package LinkedList;

public class ReverseList {
    public class PrintList {
        public static void displayReverse(Node head) {
            if(head == null) return;
            displayReverse(head.next);
            System.out.print(head.data + " ");
        }
        public static class Node {
            int data;
            Node next;
            Node(int data){
                this.data = data;
            }
            
            
        }
        public static void main(String[] args) {
            Node a = new Node(5);
            Node b = new Node(3);
            Node c = new Node(7);
            Node d = new Node(8);
            Node e = new Node(4);
    
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
    
            displayReverse(a);
            // displayReverse(a);
        }
    }
    
}
