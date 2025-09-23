package OOPs.Polymorphism.Overriding;

public class Test extends Animal{
    public static void main(String[] args) {
        Animal ani1=new Animal();
        Animal ani = new Dog();
        ani1.makeSound();
        ani.makeSound();
    }
}
