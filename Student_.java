public class Student_ {
    private String name;
    private int age;
    private int score;  // 변경됨

    public Student_(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void printInfo() {
        System.out.println("이름: " + name + ", 나이: " + age + ", 성적: " + score);
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
