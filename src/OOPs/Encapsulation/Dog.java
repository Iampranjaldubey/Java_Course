package OOPs.Encapsulation;

public class Dog {
    private String name;
    private final String species;
    private int age;

    // Constructor
    public Dog(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        }
    }

    public void makeSound() {
        System.out.println(this.name + " says: woof, woof...");
    }

    public void eat() {
        System.out.println(this.name + " is eating...");
    }


    public static void main(String[] args) {
        Dog d1 = new Dog("Tommy", "Labrador", 12);

        d1.makeSound();
        d1.eat();

        System.out.println(d1.getName() + "'s species is: " + d1.getSpecies());
    }
}