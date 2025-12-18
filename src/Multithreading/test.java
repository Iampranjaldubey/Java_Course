package Multithreading;

public class test {
    public static void main(String[] args) {
//        Thread t1= new Thread(new MyRunnable());
//        Thread t2= new Thread(new MyRunnable());
//        t2.start();
//        Thread t3= new Mythread();
//        t3.start();
//        RunnableDemo t4= new RunnableDemo("thread t1");
//        t4.start();
//        Thread t5= new Thread(new RunnableDemo("thread t2"));

        Resource r1=new Resource("joel");
        Resource r2=new Resource("pranjal");
        Task_1 t1=new Task_1(r1,r2);
        Task_2 t2=new Task_2(r1,r2);
        Thread th1=new Thread(t1);
        Thread th2=new Thread(t2);
        th1.start();
        th2.start();



    }
}
