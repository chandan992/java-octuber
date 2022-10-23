package thread2;

class first extends Thread{
    public void run(){
        System.out.println("Tdhf");
    }
}

public class thread_get_set {
    public static void main(String[] args) {
        first t1= new first();
        System.out.println("this is a corrent state"+ t1.getState());
        t1.start();
        t1.setPriority(5);
        System.out.println("this is a  thread id "+ t1.getId());
        System.out.println("this is a corrent state"+ t1.getState());
    }
}
