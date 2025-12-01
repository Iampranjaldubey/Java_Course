package Multithreading;

public class TestEvenOdd {
    public static void main(String[] args) {

        PrintClass p = new PrintClass();

        ThreadOdd O = new ThreadOdd(p);
        ThreadEven E = new ThreadEven(p);

        O.start();
        E.start();
    }

}
