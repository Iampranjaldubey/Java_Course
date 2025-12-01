package Multithreading;

public class Producerthread implements Runnable{
    SharedBuffer buffer;
    Producerthread(SharedBuffer buffer){
        this.buffer=buffer;

    }

    @Override
    public void run() {
        for(int i=1; i<=10;i++){
            buffer.produce(i);
        }
    }
}
