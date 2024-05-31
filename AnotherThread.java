public class AnotherThread extends Thread {

    public void run(){
        for(int i = 10; i>=0; i--){
            System.out.println("another thread value :" + i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
     }
}