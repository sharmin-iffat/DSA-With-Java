package LinkedList;

//InsertAtBeginning method
//Implement a method to insert a node at the start of a linked list.

public class InsertAtBegi {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void inserAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head=temp;
            }else{
                tail.next=temp;
            }
            tail=temp;
        }
        void InsertAtBeginning(int val){
            Node temp = new Node(val);
            if(head==null){
                head=tail=temp;
            }else{
                temp.next=head;
                head = temp;
            }
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            Node temp = head;
            int count=0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.InsertAtBeginning(14);
        ll.inserAtEnd(5);
        ll.inserAtEnd(8);
        ll.inserAtEnd(15);
        ll.inserAtEnd(18);
        ll.display();
        ll.InsertAtBeginning(4);
        ll.display();
        System.out.println(ll.size());
    }
}

