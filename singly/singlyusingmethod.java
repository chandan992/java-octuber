package singly;
import java.util.Scanner;
class singly{
    Node head=null;
static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
}

        void creation(){
            int data ,n;
            int m=1;
            Scanner sc=new Scanner(System.in);
            System.out.println("etner one for continue");
            n=sc.nextInt();

            while(n==1 && m==1){
            System.out.println("Enter the value of list");
            data=sc.nextInt();
            Node new_node= new Node(data);
            if(head==null){
                head=new_node;
            }
            else{
                new_node.next=head;
                head=new_node;

            }
            System.out.println("for contiune");
            m=sc.nextInt();
        }
        }



// Traverse the link list 

        void traverse(){
            Node temp=head;
            if(head==null){
                System.out.println("list is empty");
            }
            else{
                while(temp!=null){
                    System.out.println(temp.data);
                    temp=temp.next;
                }

            }
        }
        
        // deletion in link list
        
        void deletion()
{
        Node item=head;
        int m;
            Scanner sc= new Scanner(System.in);
            do{
                System.out.println("Enter one for deletion");
            m=sc.nextInt();
            if (m==1) {
                item=item.next;
                head=item;
            }
            else{
                while(item!=null){
                System.out.println(item.data);
                item=item.next;
                }
            
            }
            }while(m==1);
        }
    
    
}
class singlyusingmethod{
    public static void main(String[] args) {
        singly k= new singly();
        k.creation();
        k.traverse();
        k.deletion();
        System.out.println("ths is a  main creation traverse");
        k.traverse();
    }
}