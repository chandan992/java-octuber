package Exception_handling_array;
import java.util.Scanner;


class first extends Exception{
    public String toString(){
        return  "this is a Tostring";
    }
    public String getMessage(){
        return "this is getString";
    }
}

public class excepton_mothod {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            if (num<9){
                try {
                    throw new first();
                } catch (Exception e) {
                    System.out.println("This is a toString  :"+ e.toString());
                    System.out.println("This is a getstring  :"+ e.getMessage());
                    System.out.println("This is a getstring  :"+ e);
                    e.printStackTrace();
                    System.out.println("finish");

                }
            }



        }

        
    }
}
