package singly;

import java.util.Scanner;

class deletion{
    Node head=null;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        void creation(){
        
            int data,n;
            Scanner sc= new Scanner(System.in);
            do{
            System.out.println("Enter the numbe");
            data=sc.nextInt();

            Node new_node= new Node(data);
            if (head==null) {
                head=new_node;
                
            } else {
                new_node.next=head;
                head=new_node;
            }
            System.out.println("Enter one for continue");
            n=sc.nextInt();
        }while(n==1);

        }

        void traverse(){
            Node item=head;
            if (head==null) {
                System.out.println("The list is empty");
            } else {
               while(item!=null){
                System.out.println(item.data);
                item=item.next;

               } 
            }
        }

        void deletionend(){
            Node temp=head;
            Node ptr= temp.next;
            int p=2;
            for (int i=0;temp!=null && i<p;i++) {
                temp=ptr;
                ptr=ptr.next;
            }
            temp.next=ptr.next;
        }

    }




public class delete_pos {
    public static void main(String[] args) {
        
        deletion list= new deletion();
    
        list.creation();
        System.out.println("This is a before deletion");
        list.deletionend();
        System.out.println("this is a after deletion");
        list.traverse();
        
    }
}
