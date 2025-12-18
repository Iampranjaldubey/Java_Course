package ErrorAndException;

public class ThrowsExeption {
    public void validateAge(int age) throws Exception{
        if (age<18){
            System.out.println("not eligiblw");
            throw new AgeExeption("hdihf");
        }
    }

    public static void main(String[] args) throws Exception{
        ThrowsExeption th= new ThrowsExeption();
        th.validateAge(17);
    }
}
