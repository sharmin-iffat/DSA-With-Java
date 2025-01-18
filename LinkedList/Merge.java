package LinkedList;

public class Merge {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }  
    }
    public static Node mergeTwoList(Node h1, Node h2){
        Node t1 = h1;
        Node t2 = h2;
        Node head = new Node(100);
        Node temp = head;

        while(t1 != null && t2 != null){
            if(t1.data < t2.data){
                Node ans = new Node(t1.data);
                temp.next = ans;
                temp = ans;
                t1.next = t1;
            }else{
                Node ans = new Node(t2.data);
                temp.next = ans;
                temp = ans;
                t2.next = t2;
            }
        }
        if(t1==null){
            temp.next= t2;
        }else{
            temp.next = t1;
        }
        return head.next;
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
        Node h1 = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(8);

        Node h2 = new Node(2);
        Node B = new Node(4);
        Node C = new Node(6);
        Node D = new Node(7);

        h1.next = b;
        b.next = c;
        c.next = d;
        // d.next = b;
        h2.next = B;
        B.next = C;
        C.next = D;

        display(h1);
        display(h2);
        System.out.println(mergeTwoList(h1, h2));
    }
}
