package OOPs.Static;

public class Block {
    static int staticCounter;
    int objCounter;

    public Block(){
        System.out.println("block constructor is called");
    }
    static {
        staticCounter=100;
        System.out.println("static counter is: "+ staticCounter);
    }
    {
        objCounter=10;
        System.out.println("object counter is: "+ objCounter);
    }
    // main class
       public static void main(String[] args) {
           System.out.println("main started");
           Block obj1 = new Block();
            Block obj2 = new Block();
           System.out.println("main ended");
        }
    }
