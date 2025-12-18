package COLLECTIONS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Students implements Comparable<Students> {
    private String name;
    private int age;
    private double rollno;

    public Students(String name, int age, double rollno) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for rollno
    public double getRollno() {
        return rollno;
    }
    public void setRollno(double rollno) {
        this.rollno = rollno;
    }

    @Override
    public int compareTo(Students s) {
        return this.name.compareTo(s.name);
    }

    public static void main(String[] args) {
        Students s1 = new Students("Pranjal", 53, 26);
        Students s2 = new Students("Aman", 21, 12);
        Students s3 = new Students("Rahul", 22, 45);

        List<Students> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Collections.sort(list);


        for (Students s : list) {
            System.out.println(s.getName());
        }
    }
}
