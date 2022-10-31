package graph;

import java.util.LinkedList;
import java.util.Scanner;

class implementation{
    LinkedList<Integer> ard[];

    implementation(int v){
        ard= new LinkedList[v];
        for (int i = 0; i < v; i++) {
            ard[i]= new LinkedList<Integer>();
        }


    }

    public void  insertion(int s, int d){
            ard[s].add(d);
            ard[d].add(s);

            System.out.print(ard[d]);
            System.out.println(ard[s]);
    }

}



public class graph_implemantaion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the vertix and edge");
        int v=4;
        int e=3;
    implementation g= new implementation(v);
    System.out.println("enter edge");

        for (int i = 0; i <e; i++) {
            int s=sc.nextInt();
            int d=sc.nextInt();
            g.insertion(s, d);
            
            
        }



    }
    
}                                 
