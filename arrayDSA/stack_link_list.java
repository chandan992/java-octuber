package arrayDSA;
import java.util.Scanner;
class stack{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    Node top=null;

// push the element in the linked list

    void push(){
        Scanner sc= new Scanner(System.in);
        int data=sc.nextInt();
        Node newnode=new Node(data);

        if(top==null){
            top=newnode;
        }else{
            newnode.next=top;
            top=newnode;
        }

    }

// traverse the stack

    void traverse(){
        Node temp=top;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
            
        }
    }

}



public class stack_link_list {
    public static void main(String[] args) {
        stack list=new stack();
        list.push();
        list.traverse();
    }
}
