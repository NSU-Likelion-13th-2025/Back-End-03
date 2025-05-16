package homeWork;
/*제네릭 이용하여 클래스 작성
예약 저장 및 조회 기능 (getter/ setter 이용)
클래스 하나에 이름, 나이, 예약 날짜 포함
main() 함수 필수
아래 출력 값 나오도록 코드 구성
Override 활용하기(toString())*/
class Information<T1, T2, T3>{
    private T1 name;
    private T2 age;
    private T3 appointmentDate;
    //이름
    public T1 getName(){
        return name;
    }
    public void setName(T1 name){
        this.name = name;
    }
    //나이
    public T2 getAge(){
        return age;
    }
    public void setAge(T2 age){
        this.age = age;
    }
    //날짜
    public T3 getAppointmentDate(){
        return appointmentDate;
    }
    public void setAppointmentDate(T3 appointmentDate){
        this.appointmentDate = appointmentDate;
    }

    public String toString(){
        return "환자: " + name + ", 나이: " + age + ", 예약일: " + appointmentDate;
    }
}

public class GenericHomework {
    public static void main(String[] args) {
        Information<String, Integer, String> person1 = new Information<String, Integer, String>();
        person1.setName("아무개");
        person1.setAge(15);
        person1.setAppointmentDate("2025-05-15");

        Information<String, Integer, String> person2 = new Information<String, Integer, String>();
        person2.setName("김이나");
        person2.setAge(23);
        person2.setAppointmentDate("2025-05-25");

        System.out.println(person1);
        System.out.println(person2);
    }
}
