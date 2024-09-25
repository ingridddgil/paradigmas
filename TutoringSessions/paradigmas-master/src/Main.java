import Model.Student;
import Model.Teacher;
import UI.UITeacher;

import java.util.Date;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("8956", "Luis Morales", "lmorales@uv.mx","Software Engineering", "9215698745");
        teacher.add(t1);
        t1.addAvailableSession("25/09/2024", "14:30");
        t1.addAvailableSession("25/09/2024", "15:30");
        t1.addAvailableSession("25/09/2024", "16:30");

        Teacher t2 = new Teacher("2205", "Irwing Ibañez", "ibanez@uv.mx","Software Engineering", "9215896352");
        teacher.add(t2);
        t2.addAvailableSession("25/09/2024", "11:30");
        t2.addAvailableSession("25/09/2024", "12:30");
        t2.addAvailableSession("25/09/2024", "13:30");

        Teacher t3 = new Teacher("8759", "Magdiel Mercado", "mamercado@uv.mx","Software Engineering", "9225698785");
        teacher.add(t3);

        UITeacher.availableTeachers.add(t1);
        UITeacher.availableTeachers.add(t2);

//        for(Teacher.AvailableSessions available : t1.getAvailableSessions()){
//            System.out.println(available.getAppointmentDate() + " " + available.getAppointmentHour());
//        }

//        System.out.println(t1.toString());
        Student s1 = new Student("S22017036", "Ingrid Sarahi Gil Hernandez", "Fifth semester", "9211925038");
//        System.out.println(s1.toString());
        student.add(s1);
        Student s2 = new Student("S22017037", "Julio Gutierrez Mendoza", "Fifth semester", "9215896458");
//        System.out.println(s2.toString());
        student.add(s2);

        showMenu();
    }
}