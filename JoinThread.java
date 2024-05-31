public class JoinThread extends Thread {
    
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("child Thread" + ": " + i);

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        JoinThread joinThread = new JoinThread();
        joinThread.start();

        for(int i=0; i<=5; i++){
            System.out.println("Main Thread : " + i);

            try {
                joinThread.join();
                Thread.sleep(1000);
               
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

// The current thread waits indefinitely for the target thread to finish