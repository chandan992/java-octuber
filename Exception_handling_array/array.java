package Exception_handling_array;

import java.util.Scanner;

class exception {
    int[] marks = new int[3];

    void number() {
        marks[0] = 35;
        marks[1] = 12;
        marks[2] = 21;
        try (Scanner sc = new Scanner(System.in)) {
          
            boolean flage=true;
            while(flage)
    {
            try {
                System.out.println("Welcome to array");
                System.out.println("Enter the array index number");
                int num = sc.nextInt();
    
                System.out.println("Enter the divide number");
                int div = sc.nextInt();
                try {
                    System.out.println("The divide is successful  :" + marks[num]);
                System.out.println("The value of the divide is :" + (marks[num] / div));
                flage=false;

                } catch (Exception e) {
                    
                System.out.println("sorry this index does not exitis  :");
                System.out.println("exception level to 2");
                }
                
            
            } catch (Exception e) {
                System.out.println("This is level 1 ");
            }
        }}

    }
}

public class array {
    public static void main(String[] args) {
        System.out.println("hell");
        exception k = new exception();
        k.number();

    }
}
