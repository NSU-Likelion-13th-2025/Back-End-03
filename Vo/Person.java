package Vo;

public class Person {
    protected String name;
    int age;
    double height;
    double weight;

    public Person(){}
    public Person(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "이름: " + name +
                ", 나이: " + age +
                ", 키: " + height +
                ", 몸무게: " + weight ;
    }
}
