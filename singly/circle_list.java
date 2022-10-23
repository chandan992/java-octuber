package singly;
import java.util.Scanner;
class circle{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node tail=null;
    
    Node head=null;
    void creation(){
        Scanner sc= new Scanner(System.in);
        int num;
        do{
            System.out.println("enter the data");
            int data=sc.nextInt();
            Node newnode= new Node(data); 
            if (head==null) 
            {
                head=newnode;
                tail=newnode;
                newnode.next=head;
            } 
            else
            {
                
                System.out.println("enter 1 for beginner insert 2 for end insert 3 for postion insert");
             int input=sc.nextInt();
        

        switch (input) {
            case 1:
                newnode.next=head;
                head=newnode;
                tail.next=head;
                
                break;
                case 2:
                tail.next=newnode;
                tail=newnode;
                newnode.next=head;
                break;

                case 3:
                 int pos=2;
                  Node temp=head;
                 for (int i = 0; i < pos; i++) {
                    temp=temp.next;
                 }
                 newnode.next=temp.next;
                 temp.next=newnode;
                break;
            default:
                break;
        }
        
    }
    System.out.println("enter one for continue");
    num=sc.nextInt();
    }while(num == 1);
        
    }
     

    void traverse(){
        Node temp=head;
        do {
            System.out.println(temp.data);
            temp=temp.next;
            
        } while (temp!=head);
    }
}




public class circle_list {
    public static void main(String[] args) {
        circle list=new circle();

        list.creation();
        list.traverse();
    }
}
