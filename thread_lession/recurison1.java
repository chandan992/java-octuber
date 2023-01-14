package thread_lession;
public class recurison1 {
    static int sum=0;
    static int cout=0;
     public static void main(String[] args) {
           
      substraction(1200003);
            System.out.println(sum);
            System.out.println(cout);
     }
      
     static void substraction(int n ){
    
        if(n==0){
            return;
        }
        int rem= n%10;
        if(rem==0){
            cout++;
        }
        sum=  (sum *10) +rem;
        substraction(n/10);

        
     }
}
