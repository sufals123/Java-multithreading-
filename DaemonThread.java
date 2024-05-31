public class DaemonThread implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("Daemon thread running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread daemonThread = new Thread(new DaemonThread());
        daemonThread.setDaemon(true);  // Set the thread as a daemon thread
        daemonThread.start();

        try {
            Thread.sleep(9000);  // Main thread sleeps for 9 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread ending...");
        // When the main thread ends, the JVM will exit and the daemon thread will be terminated.
    }
}

//"daemon thread" refers to a type of thread that runs in the background and does not prevent the JVM from 
//exiting when all user threads (non-daemon threads) have finished execution. 
