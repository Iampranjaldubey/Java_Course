package Multithreading;

public class ConsumerThread implements Runnable {
    SharedBuffer buffer;

    ConsumerThread(SharedBuffer buffer){
        this.buffer=buffer;

    }
    public void run() {
        for(int i=1; i<=10;i++){
            buffer.consume();
        }
    }

}
