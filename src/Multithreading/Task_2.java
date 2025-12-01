package Multithreading;

public class   Task_2 implements Runnable{
    private Resource r1;
    private Resource r2;

    public Task_2(Resource r1, Resource r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public void run() {
        synchronized (r2) {
            System.out.println("task2 locked r2!");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (r1) {
                System.out.println("task2 locked r1!");
            }
        }
    }
}


