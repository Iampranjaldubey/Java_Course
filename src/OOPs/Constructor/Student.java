package OOPs.Constructor;
//Student class with private variables promoting encapsulation.
public class Student{
    private long rollNo;
    private String name;
    private int age;
    // No argument constructor
    public Student() {
        rollNo=96;
        name="Ompal Yadav";
        age=20;
    }

    public Student(long rollNo) {
        this.rollNo=rollNo;
    }

    public Student(long rollNo,String name) {
        this.rollNo=rollNo;
        this.name=name;
    }
    //	Constructor of Student class.
    public Student(long rollNo,String name,int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age ;
    }
    // Getter and setter
    public void SetRollNo(long rollNo) {
        this.rollNo=rollNo;
    }
    public long GetRollNo() {
        return rollNo;
    }
    public void SetName(String name) {
        this.name=name;
    }
    public String GetName() {
        return name;
    }
    public void SetAge(int age) {
        this.age=age;
    }
    public int GetAge() {
        return age;
    }
    public static void main(String[] args) {
        Student s4=new Student();
        System.out.println(s4.rollNo);
        Student s3=new Student(96,"Pranjal Dubey");
        System.out.println(s3.name);
        System.out.println(s3.rollNo);
        Student s2=new Student(96);
        System.out.println(s2.rollNo);
        Student s1=new Student();
        System.out.println(s1.name);
        Student s=new Student(96,"ompal yadav",20);

//		s.SetName("Ompal Yadav");
        System.out.println(s.name);
//		s.SetAge(20);
        System.out.println(s.age);
//		s.SetRollNo(88);
        System.out.println(s.rollNo);
    }

}