class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while(i<100) {
            System.out.println("I am a thread not a threat");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<100) {
            System.out.println("I am thread 2 not a threat 2");
            i++;
        }
    }
}
public class cwh_71_runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}

