package Vo;

public class Student extends Person{
    int grade;
    String major;

    Student(){}
    public Student(String name, int age, double height, double weight, int grade, String major) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + ", 학년: " + grade +
                ", 전공: " + major;
    }
}
