package OOPs.Polymorphism.Overloading;

public class Test extends Calculator {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        ScientificCalculator scicalc=new ScientificCalculator();
        System.out.println(calc.add(2,3));
        System.out.println(scicalc.add(2,4,7));
    }
}
