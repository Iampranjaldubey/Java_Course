package OOPs.Interface;

public interface Animal {

    void eat();
    void travel();

    static void sleep() {
        System.out.println("Animal is not sleeping");
    }

    default void running() {
        System.out.println("animal is running very fast");
        pet();
    }

    private void pet() {
        System.out.println("dog is pet animal");
    }

    default void usePet() {
        pet();
    }
}
