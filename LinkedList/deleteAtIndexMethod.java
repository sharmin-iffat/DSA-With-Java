package LinkedList;

public class deleteAtIndexMethod {
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
            int size =0; 
            void inserAtEnd(int val){
                Node temp = new Node(val);
                if(head==null){
                    head=temp;
                }else{
                    tail.next=temp;
                }
                tail=temp;
                size++; 
            }
            void InsertAtBeginning(int val){
                Node temp = new Node(val);
                if(head==null){
                    head=tail=temp;
                }else{
                    temp.next=head;
                    head = temp;
                }
                size++;
            }
            void deleteAt(int idx){
                if(idx==0) head = head.next;
                Node temp =head;
                for(int i=1; i<idx; i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
            void display(){
                Node temp = head;
                while(temp != null){
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
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
            ll.deleteAt(0);
            ll.display();
            
        } 
    
}
