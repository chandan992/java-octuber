package framework;

import java.util.Scanner;



public class array_framwork {

  static Node create(){
    
    int data;
    Scanner sc= new Scanner(System.in);
    Node root=null;
System.out.println("enter data");
    data=sc.nextInt();

    if(data==-1){
        return null;}
        root= new Node(data);

         System.out.println("enter left"+data);
        root.left=create();
        System.out.println("Enter right"+data);
        root.right=create();
        return root;
        
    
}

static void inorder(Node root){
if (root==null) 
    return;
    
    inorder(root.left);
    System.out.print(root.data +"  ");
    inorder(root.right);

}

static void preorder(Node root){
if (root==null) 
    return;
    
    System.out.print(root.data +"  ");
    preorder(root.left);
    preorder(root.right);

}

static void postorder(Node root){
if (root==null) 
    return;
    
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data +"  ");

}
  
    public static void main(String[] args) {
        
     Node hello=   create();
        inorder(hello);
        System.out.println();
        preorder(hello);
        System.out.println();
        postorder(hello);
}

}




class Node{
    Node right,left;
    int data;
    Node(int data){
        this.data=data;
        right=null;
        left=null;
    }
    }