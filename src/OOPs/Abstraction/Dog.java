package OOPs.Abstraction;

public class Dog extends Animal {

    public Dog() {
        super();
        System.out.println("hello this is Dog");
    }
    public void makeSound() {

        System.out.println("woof..");
    }
    public void Walking() {

        System.out.println("Dog is not walking");
    }
    public static void main(String[] args) {
        // Animal dog = new Dog();
        Dog dog = new Dog();
        dog.makeSound();
        dog.Walking();
    }
}
