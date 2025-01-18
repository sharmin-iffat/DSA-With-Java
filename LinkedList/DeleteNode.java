package LinkedList;

public class DeleteNode {
    static void deleteNode(Node node){
        node.data = node.next.data;
        node.next = node.next.next;
    }



    public static void display(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp= temp.next;
        }
        System.out.println();
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

        display(a);

        deleteNode(c);
        display(a);
        
    }
}
