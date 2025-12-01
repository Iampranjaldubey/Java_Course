package Multithreading;

public class ThreadEven extends Thread{
    private PrintClass print;
    //constructor
    public ThreadEven(PrintClass s){
        this.print=s;

    }
    public void run(){
        for(int i=0;i<=10;i++){
            print.printEven();
        }
    }
}
