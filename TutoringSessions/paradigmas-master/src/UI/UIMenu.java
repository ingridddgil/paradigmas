package UI;

import Model.Secretary;
import Model.Student;
import Model.Teacher;
import java.util.ArrayList;
import java.util.Scanner;
import static UI.UIStudent.*;
import static UI.UITeacher.*;

public class UIMenu {
    public static ArrayList<Teacher> teacher = new ArrayList<>();
    public static ArrayList<Student> student = new ArrayList<>();
    public static ArrayList<Secretary> secretary = new ArrayList<>();
    public static Teacher teacherLogged;
    public static Student studentLogged;
    public static Secretary secretaryLogged;

    public static void showMenu(){
        int answer;
        do {
            System.out.println("Hi\nWho are you?\nI'm a student (1)\nI'm a teacher (2)\nI'm a secretary (3)\nExit (0)");
            Scanner sc = new Scanner(System.in);
            answer = Integer.parseInt(sc.nextLine());

            switch(answer){
                case 1:
                    userLogin(1);
                    System.out.println("Student's menu");
                    break;
                    case 2:
                        userLogin(2);
                        System.out.println("Teacher's menu");
                        break;
                        case 3:
                            userLogin(3);
                            System.out.println("Secretary's menu");
                            break;
                            case 0:
                                System.out.println("...::Bye Bye::..");
                                System.exit(0);
                                break;
                                default:
                                    System.out.println("Invalid option");
                                    break;
            }
        }while(answer != 0);
    }
    public static void userLogin(int user) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Enter your email: ");
            String email = sc.nextLine();

            if (user == 1) {
                for (Student st : student) {
                    if (st.getEmail().equals(email)) {
                        flag = false;
                        studentLogged = st;
                        System.out.println("Hi student " + st.getName());
                        studentMenu();
                    }
                }
            }
            if (user == 2) {
                for (Teacher t : teacher) {
                    if (t.getEmail().equals(email)) {
                        flag = false;
                        teacherLogged = t;
                        System.out.println("Hi teacher " + t.getName());
                        teacherMenu();
                    }
                }
            }
            if (user == 3) {
                for (Secretary se : secretary) {
                    if (se.getEmail().equals(email)) {
                        flag = false;
                        secretaryLogged = se;
                        System.out.println("Hi " + se.getName());
                    }
                }
            }
        } while(flag);
    }
}
