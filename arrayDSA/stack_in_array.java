package arrayDSA;
import java.util.Scanner;
class stack{
    Scanner input=new Scanner(System.in);
    int top=-1;
    int n;
    int i=5;
    int[] a =new int[i];
    void push()
    {
        do{
        if(top==(i-1)){
            System.out.println("overflow stack");
        }
        else
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter element");
            int in=sc.nextInt();
            top=top+1;
            a[top]=in;
            System.out.println("Element is insert");


        }
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter one for continue");
   n=sc.nextInt();
    }while(n==1);
    }
    void pop(){
        if(top==-1){
            System.out.println("underflow");
        }else{
            top=top-1;
        }


    }

// traverse the stack 

void traverse(){
    for (int i = top; i >=0 ; i--) {
        System.out.println(a[i]);
    }
}
}



public class stack_in_array {
public static void main(String[] args) {

stack output= new stack();
output.push();
output.traverse();
output.pop();
System.out.println("This is traverse after pop ");
output.traverse();

}
}
