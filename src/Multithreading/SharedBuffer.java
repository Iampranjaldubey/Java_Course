package Multithreading;

import com.sun.jdi.event.MonitorWaitedEvent;

public class SharedBuffer {
    private int data;
    private boolean hasdata;

    synchronized void produce(int value){
        while(hasdata) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            data=value;
            System.out.println("produced data");
            hasdata=true;
            notify();

    }
    synchronized void consume(){
        while(!hasdata) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            System.out.println("consume "+ data);
            hasdata=false;
            notify();

    }
}
