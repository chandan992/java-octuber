package thread2;
class thread1 implements Runnable {
    String n;
     thread1(String name){
        n=name;

    }
    void show(){
        System.out.println("I  you");
    }

    public void run() {
        System.out.println("This is runnable one.."+n);
        
    }
}

class thread2 implements Runnable {
    public void run() {
        System.out.println("This is runnable two...");
    }
}

 class firstthread {
    public static void main(String[] args) {
        thread1 bullet = new thread1("dhjfasd");
        //thread2 bullet1 = new thread2();
        Thread gun = new Thread(bullet);
//Thread run2 = new Thread(bullet1);
        gun.start();
        bullet.show();
       // run2.start();
    }
}