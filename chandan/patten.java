package chandan;

import doubly.traverse;

public class patten {
    public static void main(String[] args) {
        firstpatter7();
    }


    static void firstpatter7(){
        
        for (int i = 1; i<=5; i++){
            for (int j = 1; j <=9 ; j++) {
            
                if(j<=6-i || j>=4+i){
            
                    System.out.print(j);
                
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
        }
 


    static void tryangle(){
        int k;
        for (int i = 1; i<=5; i++){
            k=1;
            for (int j = 1; j <=9 ; j++) {
            
                if(j>=6-i && j<=4+i && k==1){
            
                    System.out.print(j);
                k=0;
                }else{
                    System.out.print(" ");
                    k=1;
                }
            }
            System.out.println();
            
        }
        }
 


    static void firstpatter6(){
        
        for (int i = 1; i<=5; i++){
            for (int j = 1; j <=9 ; j++) {
            
                if(j>=6-i && j<=4+i){
            
                    System.out.print(j);
                
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
        }
    
    

    static void firstpatter5(){
        for (int i = 5; i>=1; i--) {
            for (int k = 1; k <= 5-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i*2-1 ; j++) {
                System.out.print(" "+j);
            }
        System.out.println();
        }
    }


    static void firstpatter4(){
        for (int i = 1; i<=5; i++) {
        
            for (int j = 1; j <= i ; j++) {
                System.out.print(" "+j);
            }
        System.out.println();
        }
    }


    static void firstpatter3(){
        for (int i = 1; i<=5 ; i++) {
            for (int k = 1; k  <=5-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1 ; j++) {
                System.out.print(" "+j);
            }
        System.out.println();
        }
    }


    static void firstpatter2(){
        for (int i = 1; i<=5; i++) {
            for (int j = 1; j <= i*3-1 ; j++) {
                System.out.print(" "+j);
            }
        System.out.println();
        }
    }

    static void firstpatter(){
        for (int i = 5; i>=0; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" "+j);
            }
        System.out.println();
        }
    }
}
