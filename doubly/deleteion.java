package doubly;

import java.util.Scanner; 

class delete{
    
    
    class Node {
        int data;
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
    int n;
    do{
    System.out.println("Enter the value of link list");
    Scanner sc= new Scanner( System.in);
    int data=sc.nextInt();
    Node newnode=new Node(data);
    if(head==null){
        head=newnode;
        tail=newnode;
    }else{
        head.prev=newnode;
        newnode.next=head;
        head=newnode;
    }

    System.out.println("enter one for continue");
    n=sc.nextInt();
}while(n==1);

}

void del(){
    int input;
    System.out.println("Enter one for begginer, 2 for end , 3 for position");
    Scanner sc= new Scanner(System.in);
     input=sc.nextInt();

     switch (input) {
        case 1:
            Node temp=head;
            temp=temp.next;
            head=temp;
            
            head.prev=null;
            break;
        case 2:
        temp=tail;
        temp=temp.prev;
        temp.next=null;
        tail=temp;
        break;

        case 3:
        System.out.println("Enter the positon");
        int pos=sc.nextInt();
        temp=head;
        Node ptr=temp.next;
        for (int i = 0; i < pos-1; i++) {
            temp=ptr;
            ptr=ptr.next;
        }
        temp.next=ptr.next;
        ptr.next.prev=temp;
        break;

        default:
            break;
     }
}




void traverse(){
    Node temp=head;
    while (temp!=null) {
        System.out.println(temp.data);
        temp=temp.next;
    }
}
}



public class deleteion {
    public static void main(String[] args) {
        delete list= new delete();
        list.creation();
        list.traverse();
        list.del();
        list.traverse();
    }
}
