package a2ter.com.tutoreasy;

import java.util.ArrayList;
import java.util.*;

public class Student {
    public static int numberOfStudents= 0;
    private String name;
    private int grade;
    private int age;
    ArrayList<String> days = new ArrayList<>();
    List<Double> payments = new ArrayList<>();

    public Student() {
    }

    public Student(String sName, int sAge, int sGrade) {
        this.name = sName;
        this.grade = sGrade;
        this.age = sAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
