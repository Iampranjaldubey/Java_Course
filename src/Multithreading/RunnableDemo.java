package Multithreading;

class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;

    RunnableDemo(String name){
        threadName=name;
        System.out.println("running" + threadName);
    }

    public void run(){
        System.out.println("running" + threadName);
        try{
            for (int i=4;i>0;i--){
                System.out.println("running" + threadName + i);
                Thread.sleep(20000);}
            } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }
    public void start(){
        System.out.println("running"+threadName);
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

