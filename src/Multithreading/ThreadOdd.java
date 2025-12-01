package Multithreading;

public class ThreadOdd extends Thread{
    private PrintClass print;
    // constructor
    public ThreadOdd(PrintClass s){
        this.print=s;

    }

    @Override
    public void run() {
        for(int i=0; i<=10;i++){
            print.printOdd();
        }
    }
}
