public class InterruptExample {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread is running: " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted!");
                    return; // Exit the loop and end the thread
                }
            }
        });

        thread.start();

        try {
            Thread.sleep(3000); // Main thread sleeps for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt(); // Interrupt the thread
    }
}


// In Java, the interrupt() method is used to interrupt a thread that is currently running. When a thread is interrupted,