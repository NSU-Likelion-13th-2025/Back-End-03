package Hospital_Appointment;

import java.util.ArrayList;
import java.util.List;

// 제네릭 예약 클래스
class Reservation<T> {
    private T patient;

    public Reservation(T patient) {
        this.patient = patient;
    }

    public T getPatient() {
        return patient;
    }

    public void setPatient(T patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "예약 = " + patient.toString();
    }
}

// 환자 클래스
class Patient {
    private String name;
    private int age;
    private String appointmentDate;

    public Patient(String name, int age, String appointmentDate) {
        this.name = name;
        this.age = age;
        this.appointmentDate = appointmentDate;
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

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String toString() {
        return "환자: " + name + ", 나이 : " + age + ", 예약일 : " + appointmentDate;
    }
}

public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient("아무개", 15, "2025-05-15");
        Reservation<Patient> r1 = new Reservation<>(p1);
        System.out.println(r1);

        Patient p2 = new Patient("김이나", 23, "2025-05-25");
        Reservation<Patient> r2 = new Reservation<>(p2);
        System.out.println(r2);
    }
}