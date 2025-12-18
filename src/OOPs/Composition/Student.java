package OOPs.Composition;


public class Student {
    private long rollNo;
    private String name;
    private int age;
    private Dept dept; 

    // Constructor
    public Student(long rollNo, String name, int age, Dept dept) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    // Getters & Setters
    public long getRollNo() {
        return rollNo;
    }

    public void setRollNo(long rollNo) {    
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }



    
    public static void main(String[] args) {
        Professor prof1 = new Professor(1, "Dr. Sharma", "Computer Science");

        Dept csDept = new Dept("CSE", 101, prof1);

        Student s1 = new Student(101, "Pranjal", 21, csDept);

        System.out.println("Student: " + s1.getName());
        System.out.println("Department: " + s1.getDept().getName());
        System.out.println("HOD: " + s1.getDept().getHod().getName());
    }
}
