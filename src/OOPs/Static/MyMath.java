package OOPs.Static;

public class MyMath {

    public static int add(int a, int b){
        return a+b;
    }
    public static int subs(int a, int b){
        return a-b;
    }


    public static void main(String[] args) {
        MyMath m1 = new MyMath();
        System.out.println(MyMath.add(2,4));
        System.out.println(MyMath.subs(3,2));
        System.out.println(m1.add(2,3));
    }
}
