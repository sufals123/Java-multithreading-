public class MyThread implements Runnable {

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("value is : " + i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
            }
        }
    }

    public static void main(String[] args) {
 
        MyThread t1 = new MyThread();
        Thread t2 = new Thread(t1);
        t2.start();

        AnotherThread t3 = new AnotherThread();
        t3.start();
    }
}
