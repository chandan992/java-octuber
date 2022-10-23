package arrayDSA;
import java.util.Scanner;
class myarray{
    String [] marks=new String[6];
    void input(){
         try (Scanner sc = new Scanner(System.in)) {
            for(int i=0;i<6;i++){

                System.out.println("Enter the number");
                String num = sc.nextLine();
                marks[i]= num;


            
        }
        }
            
        }
    
    void show(){
        for(int i=0;i<6;i++){
            System.out.println("the index of  :"+i+"=="+marks[i]);
        }

    }
}

public class first {
    public static void main(String[] args) {
        myarray k= new myarray();
        k.input();
        k.show();
    }
}
