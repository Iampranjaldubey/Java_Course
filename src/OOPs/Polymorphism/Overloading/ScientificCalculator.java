package OOPs.Polymorphism.Overloading;

public class ScientificCalculator extends Calculator {
    public int add(int a, int b, int c){
        System.out.println("using ScientificCalculator");
        return a+b+c;
    }

}
