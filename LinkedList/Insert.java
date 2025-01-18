package LinkedList;

//Insert method
//Implement a method to insert a node at any given index.


public class Insert {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;   //constructor
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        //Easy way to calculate size 
        //size function take time and no need to create size function
        int size =0; 
        void inserAtEnd(int val){ //Time complexity of this method is O(1).
            Node temp = new Node(val);
            if(head==null){
                head=temp;
            }else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        void InsertAtBeginning(int val){ //Time complexity of this method is O(1).
            Node temp = new Node(val);
            if(head==null){
                head=tail=temp;
            }else{
                temp.next=head;
                head = temp;
            }
            size++;
        }
        void inserAt(int idx , int val){ //Time complexity of this method is O(n).
            Node t = new Node(val); //Space Complexity is O(1)
            Node temp = head;
            if(idx==size()){  //If you want to insert data at the end of list(or out of bound)
                inserAtEnd(val);   //Help to preserve tail value
                return;
            }
            else if(idx==0){
                InsertAtBeginning(val);
                return;
            }
            else if(idx<0 || idx>size()){
                System.out.println("Wrong index");
                return;
            }
            for(int i=1; i<=idx-1; i++){
                temp= temp.next;
            }
            t.next=temp.next;
            temp.next =t;
            size++;
        }
        int getAt(int idx){ //Time complexity of this method is O(n).
            Node temp = head; //head at index 0.
            for(int i=1; i<=idx; i++){
                temp= temp.next;
            }
            return temp.data;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){ //Time complexity of this method is O(n).
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
        // ll.InsertAtBeginning(14);
        ll.inserAtEnd(5);
        ll.inserAtEnd(8);
        ll.inserAtEnd(15);
        ll.inserAtEnd(18);
        ll.display();
        // ll.InsertAtBeginning(4);
        // ll.inserAt(2, 6);
        // ll.inserAt(0, 16);
        // ll.display();
        // System.out.println(ll.tail.data);
        // System.out.println(ll.head.data);
        System.out.println(ll.getAt(0));
        System.out.println(ll.size);
        
    }
}
