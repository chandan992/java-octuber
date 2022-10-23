package singly;
import java.util.Scanner;

class delete{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;
// insertion in circle linked list 

     void creation(){
         Scanner sc= new Scanner(System.in);
         int n;
         do{
        System.out.println("Enter the value of list");
        int data = sc.nextInt();
        Node newnode=new Node(data);
        if (head==null) {
            head=newnode;
            tail=newnode;
            newnode.next=head;
        } else {
            newnode.next=head;
            head=newnode;
            tail.next=head;
        }
        System.out.println("Enter one for continue");
        n=sc.nextInt();
    }while(n==1);
}

    void deletion(){
        Scanner sc=new Scanner(System.in);
        System.out.println("one for deletion at beggning 2 for the end and 3 for any positon");
        int input=sc.nextInt();
            switch (input) {
                case 1:
                    Node temp=head;
                    temp=temp.next;
                    head=temp;
                    tail.next=head;
                    break;
                case 2:
                 temp=head;
                Node ptr=temp.next;
                while (ptr.next!=head) {
                    temp=ptr;
                    ptr= ptr.next;
                    
                }
                temp.next=head;
                tail=temp;
                break;
                case 3:
                temp=head;
                System.out.println("Enter the positon value you want to delete");
                int n=sc.nextInt();
                for (int i = 0; i < n; i++) {
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                break;
                default:
                    break;
            }




        }   
    
    
    
    
    
    
//deletion in circle link list

     void traverse(){
          Node temp=head;
        if (head==null) {
            System.out.println("there is not even one value in the list");
        } else {
            System.out.println("This is the list");
            do{
              System.out.println(temp.data);
              temp=temp.next;
            }while(temp!=head);
        }
     }

}


public class circle_delele {
public static void main(String[] args) {
        delete  list=new delete();
        list.creation();
        list.traverse();
        list.deletion();
        list.traverse();
}
}
