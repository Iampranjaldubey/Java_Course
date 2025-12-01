package Multithreading;

class MythreadDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(500); // pauses for 0.5 sec
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        MythreadDemo t1 = new MythreadDemo();
        t1.start(); // start() calls run() internally

//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Main thread: " + i);
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//        }
    }
}


