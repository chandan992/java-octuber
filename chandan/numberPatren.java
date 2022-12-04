package chandan;
public class numberPatren {
    public static void main(String[] args) {
        starpattern3();
    }

    static void starpattern3(){
        for (int i = 3; i >= 1; i--) {
            for (int j =3; j >=1; j--) {
                for (int k = 1; k <=i; k++) {
                    
                    System.out.print(j);
                }
                System.out.println();
            }
            System.out.println();

        }
    }

static void starpattern2(){
    int k=0;
    for (int i = 1; i <=7 ; i++) {
        int sum = i<=4?k++:k--;
        for (int j = 1; j <= 4 ; j++) {
            if (j<=k) {
                System.out.print(j);
            } else {
                System.out.print(" ");
            }
            
        }
        System.out.println();
    }
}




    static void starpattern(){
        int k=0;
        for (int i = 1; i <= 7; i++) {
            int sum= i<=4?k++:k--;
            for (int j = 1; j <= 7; j++) {
                if (j>=5-k && j<= 3+k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void numberpattern(){
        char k;
        int j;
        int i;
        for (i = 1; i <= 5; i++) {
            k='A';
        
            for (j = 1; j <= 9; j++) {
            
                if (j<=6-i || j>=4+i ) {
                    System.out.print(k);
                int sum= j < 5 ?k++:k--;
                        

                } else {
                    System.out.print(" ");
                    if(j==4){

                        k--;
                    }
                }
            
            }
            System.out.println();
        }
    }
}
