import java.lang.Thread.State;

public class ThreadExample {
    public static void main(String[] args)
    {
        // create thread object with Thread type
        InnerThreadExample iExample = new InnerThreadExample();

        // start the thread
        iExample.start();

        // create thread with Runnable type
        PrintHelloWorld pWorld = new PrintHelloWorld();
        
        // create a thread that will use the runnable object
        Thread pThread = new Thread(pWorld);

        // start the thread
        pThread.start();

        // get the thread state
        State st = pThread.getState();
        System.out.println(st.name());
        
        // check if the thread is still alive
        System.out.println("thread is alive  ? : " + pThread.isAlive());

        
    }
}

/**
 * InnerThreadExample ==> extend Thread Class
 */
class InnerThreadExample extends Thread{

    // override the run method of Thread
    public void run(){
        System.out.println("Running InnerThreadExample thread...");
    }
    
}

/**
 * PrintHelloWorld ==> implement runnable interface
 */
class PrintHelloWorld implements Runnable{

    // override Runnable run method
    public void run(){
        print();
    }

    private void print(){
        for(int i=0; i<10; i++){
            System.out.println(i + " - Hello, world");
        }
    }

}