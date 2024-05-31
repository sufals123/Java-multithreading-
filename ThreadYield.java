public class ThreadYield extends Thread {
    
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
    public static void main(String[] args) {
        ThreadYield t = new ThreadYield();
        t.start();
        Thread.yield();

        for(int i=0; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

// ****************************************************************
/*
 * 
 * When Thread.yield() is called, the current thread suggests to the thread scheduler that it might be a good time to let other threads run.
 * 
 * The thread scheduler is free to ignore this hint, meaning the calling thread could continue running.
 * 
 * Typically, the thread scheduler will look for other threads of the same
 *  priority that are in a runnable state and might switch to one of those threads. However, the exact behavior is platform-dependent
 */

