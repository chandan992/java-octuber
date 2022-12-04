package string;

import java.util.Arrays;

public class performance {
    public static void main(String[] args) {
        String name= "chndan kumar";
        System.out.println(Arrays.toString(name.toCharArray()));

        if (name.charAt(3)=='n') {
            System.out.println("yes");
        }else{System.out.println("no");}
    }
}
