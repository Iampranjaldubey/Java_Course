    package OOPs.Interface;

    public class Mammal implements Animal{
        public void eat(){
            System.out.println("Animal eating...");

        }
        public void travel(){
            System.out.println("Animal running....");

        }
        public static void main(String[] args) {
            Mammal obj = new Mammal();
            obj.eat();
            obj.travel();
            Animal.sleep();
            obj.usePet();
            obj.running();

        }

    }
