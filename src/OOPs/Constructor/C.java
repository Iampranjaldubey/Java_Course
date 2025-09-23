package OOPs.Constructor;

public class C extends  B{
    public C(){
        System.out.println("calling C constructor");
    }
    public static void main(String[] args) {
        A obj=new C();
        B obj1=new C();
        C obj2=new C();
    }
}
