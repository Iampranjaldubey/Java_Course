package ErrorAndException;

public class Ehandling {
    public void m1(int a){
        try {
            int p = 10/a;
            System.out.println(p);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("Always executed");
        }
    }

    public static void main(String[] args) {
        Ehandling eh = new Ehandling();
        eh.m1(4);
        eh.m1(0);
    }
}
