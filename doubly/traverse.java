package doubly;

import java.util.Scanner;
class doubly{
    class Node{
        int data ;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;
    Node tail=null;

    void creation(){
        Scanner sc= new Scanner(System.in);
        int n;
        do{
            System.out.println("enter the value of doubly link list");
            int data=sc.nextInt();
            Node newnode=new Node(data);
            
            if (head==null) {
                head=newnode;
                tail=newnode;
                
            } 
            
            else {
                System.out.println("1 for beginner 2 for end 3 for postion");
                int input=sc.nextInt();
                switch (input) {
                    case 1:
                    
                newnode.next=head;
                head.prev=newnode;
                head=newnode;
                break;
                case 2:
                //using a tail we gona insert value in the doubly link list
                tail.next=newnode;
                newnode.prev=tail;
                tail=newnode;
                break;
                case 3:
                System.out.println("Enter the postion of insertion");
                int pos=sc.nextInt();
            
                 Node temp=head;
                Node ptr=temp.next;
                for (int i = 0; i < pos-1; i++) {
                    temp=ptr;
                    ptr=ptr.next;
                }
                ptr.prev=newnode;
                newnode.next=ptr;
                newnode.prev=temp;
                temp.next=newnode;
                break;

            }
            

        }
        System.out.println("Enter 1 for continue");
    n=sc.nextInt();
    }while(n==1);
    }

// traverse the doubly linked list  

        void traverse(){
            Node temp=head;
            while (temp!=null) {
                System.out.println(temp.data);
                temp=temp.next;
                
            }

        }

}
public class traverse {
    public static void main(String[] args) {
        System.out.println("hello");
        doubly list=new doubly();
        list.creation();
        list.traverse();

    }
}
