package thread_lession;
import java.util.Scanner;

class thread1 extends Thread{
    Scanner sc = new Scanner(System.in);
    @Override
   public void run(){
    System.out.println("Enter the number of i  ..");
    int i = sc.nextInt();
    int n=0;
        while (n<i)
         {
        System.out.println("This is a first thread ...");
            i--;
        }
    }
}

class thread2 extends Thread{
    Scanner sc=new Scanner(System.in);
    public  void run(){
        System.out.println("Enter second i.");
      int i =sc.nextInt();
        int n =0;
        while (n<i) {
            System.out.println("This is a second thread..");
            i--;
        }
    }
}

class first_thread {
    public static void main(String[] args) {
        thread1 k1= new thread1();
        thread2 m1= new thread2();
        k1.start();
        m1.start();
    }
}