package thread2;

class first extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("goodmorning");
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
             
                e.printStackTrace();
            }
        }
    }
}
public class thread_using_sleep {
    public static void main(String[] args) {
        first t1= new first();
        t1.start();
    }
}
