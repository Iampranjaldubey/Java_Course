package ErrorAndException;

public class Test {
    public static void main(String[] args) {
        try {
            throw new AgeExeption("age is not valid");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}