package chandan;
interface first{
 public  int z=234;
}

class bca implements first{
   void show(){
      System.out.println("Thils si  :"+z );
   }
}
class bca1 extends bca{
   void show1(){
      System.out.println("This is   :"+z);
   }
}
class bca2 extends bca1{
   void show2(){
      System.out.println(z);
   }
  
}
public class hello {
   public static void main(String[] args) {
      bca k= new bca();
      bca2 m= new bca2();
      m.show2();
      k.show();
      System.out.println("this is a  main class");
   } 

}