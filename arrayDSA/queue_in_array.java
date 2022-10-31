package arrayDSA;
import java.util.Scanner;



class queue{
    
    int n=5;int m;int f;
    int[] marks= new int[n];
    int front=-1,rare=-1;

    void insertion(){
    
           Scanner sc=new Scanner(System.in);
           do{
               if (front==(rare+1)%n) {
                   System.out.println("overflow");
                } 
                else{
               System.out.println("enter the value of queue");
               int value=sc.nextInt();
            if (rare==-1 && front==-1) 
            {
                front=0;
                rare=0;
                marks[rare]=value;
            } else {
                rare=(rare+1)% n;
                marks[rare]=value;
            }
           }
           System.out.println("Enter one for continue");
           m=sc.nextInt();
        }while(m==1);
    }

    void delete(){
        
        System.out.println("Enter for deletion");
        Scanner sc= new Scanner(System.in);
        f=sc.nextInt();
        for (int i = 0; i <= f; i++) {
            
        
        if(rare==-1 && front==-1){
            System.out.println("underflow");
        }else if(front==rare){
            System.out.println("underflow");
            front=-1;
        }
        else{
            front=(front+1)%n;
        }
    }
    }
    

    void traverse(){

        System.out.println("After traverse ");
        for (int i = front; i <rare; i++) {
        
            System.out.println(marks[i]);            
        }
    }
}
public class queue_in_array {
    public static void main(String[] args) {

        queue list= new queue();
        list.insertion();
        list.traverse();
        list.delete();
        list.traverse();
        list.insertion();
        list.traverse();



    }
}
