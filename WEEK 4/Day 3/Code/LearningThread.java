// public class LearningThread extends Thread {
//     public static void main(String[] args) {
//         LearningThread thread = new LearningThread();
//         thread.start();
//         System.out.println("This code is outside the thread");
//     }

//     public void run(){
//         System.out.println("This code is running on thread");
//     }
// }

public class LearningThread extends  Thread{
    public static int amount = 0;
    public static void main(String[] args) {
        LearningThread obj = new LearningThread();
        // Thread thread = new Thread(obj);
        // thread.start();
        // System.out.println("This code is outside of the thread");
        obj.start();
        while(obj.isAlive()){
            System.out.println("Waiting...");
        }
        System.out.println("Main: "+amount);
        amount++;
        System.out.println("Main: "+ amount);

    }

    public void run(){
        // System.out.println("This code is running on a thread");

        amount++;
    }
}
