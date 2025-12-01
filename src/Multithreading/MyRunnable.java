package Multithreading;

import java.util.ArrayList;

public  class MyRunnable implements Runnable {
    ArrayList<String>list=new ArrayList<>();
    public void run(){
        System.out.println("thread is running");
    }
}
