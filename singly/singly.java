package singly;
import java.util.Scanner;
public class singly {
    Node head=null;
static class Node{
    int data;
    Node next;
       Node(int data){
        this.data=data;
        this.next=null;
    }
}
public void creationS()
{
    int data,n;
    Scanner sc= new Scanner(System.in);
    do{
System.out.println("Enter the list number");
data=sc.nextInt();
    Node new_node= new Node(data);

if (head==null) {
    head=new_node;
}
else{
new_node.next=head;
head=new_node;

}
System.out.println("enter one if you want continue");
n=sc.nextInt();
    }while(n==1);

}
public void triverse(){
Node temp=head;
if(head==null){
    System.out.println("There are not any value in link list");
}
else{
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
}
}

public static void main(String[] args) {
    singly list= new singly();
    list.creationS();
    list.triverse();
}

    
}
