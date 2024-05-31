public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Program starting at " + System.currentTimeMillis() + " seconds");

       Thread thread = Thread.currentThread();
       String tname = thread.getName();
       System.out.println(tname);

       thread.setName("MyMainThread");
       System.out.println(thread.getName());
       

       Thread.sleep(5000);

        System.out.println("Program ending at " + System.currentTimeMillis() + " seconds");
    }
}
