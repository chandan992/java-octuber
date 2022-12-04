package string;

import java.util.ArrayList;

public class pretty_printing {
public static void main(String[] args) {
    System.out.printf("print %s and %s are printed" ,"chandan","kumar");
    System.out.printf("This is pai value %.3f \n",Math.PI);
    System.out.println("he" +1);
    System.out.println('c'+'r');
    System.out.println("chandan" + new ArrayList<>());
    System.out.println("chandan"+ new Integer(23));
    System.out.println(new Integer(34) +" "+ new ArrayList<>());
    String ans= new Integer(34) + " "+new ArrayList<>();
    System.out.println(ans);
    StringBuilder builder= new StringBuilder();
    for (int i = 0; i < 26; i++) {
        char rr=(char) ('a'+i);
        builder.append(rr);
    }
    System.out.println(builder);
    builder.reverse();
    System.out.println(builder);
}
}
