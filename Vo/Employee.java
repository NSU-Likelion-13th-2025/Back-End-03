package Vo;

public class Employee extends Person{
    int salary;
    String dept;
    Employee(){}
    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return super.toString() + ", 급여: " + salary +
                ", 부서: " + dept;
    }
}

