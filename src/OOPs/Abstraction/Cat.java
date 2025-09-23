package OOPs.Abstraction;

public class Cat extends Animal {

    public Cat(){
        super();
        System.out.println("this is cat");
    }
    public void makeSound() {

        System.out.println("meow meow");
    }
    public void Walking() {

        System.out.println("cat is running");
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        cat.Walking();
    }
}
