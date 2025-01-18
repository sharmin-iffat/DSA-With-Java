package LinkedList;
//Inser at end of the list
//creating a empty linked list and then insert data.
//Also display the length of linked list.

public class Implementation {
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
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
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
        ll.inserAtEnd(4);
        ll.inserAtEnd(5);
        ll.inserAtEnd(8);
        ll.display();
        System.out.println();
        System.out.println(ll.size());
    }
}
