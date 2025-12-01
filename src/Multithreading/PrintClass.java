package Multithreading;

public class PrintClass {
    private boolean hasodd = true;

    // should print odd first
    public synchronized void printOdd() {
        while (!hasodd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println("odd");
            hasodd = false;
            notifyAll();

    }

    public synchronized void printEven() {
        while (hasodd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println("even");
            hasodd = true;
            notifyAll();

    }
}
