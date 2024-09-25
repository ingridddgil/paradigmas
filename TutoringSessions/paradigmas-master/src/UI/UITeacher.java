package UI;

import Model.Teacher;
import java.util.ArrayList;
import java.util.Scanner;

import static UI.UIMenu.*;

public class UITeacher {
    public static ArrayList<Teacher> availableTeachers = new ArrayList<>();

    public static void teacherMenu(){
        int choice;
        System.out.println("What you want to do today?");
        do {
            System.out.println("Add a new tutoring session (1)\nSee my schedule sessions (2)\nExit(3)");
            Scanner sc = new Scanner(System.in);
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addSession();
                    break;
                    case 2:
                        getSessions();
                        break;
                        case 3:
                            System.exit(0);
                            break;
                            default:
                                System.out.println("Invalid option");
                                break;
            }
        } while(true);
    }

    public static void addSession(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Add a new session");
        boolean isAdded = false;
        do {
            System.out.println("Set the session date and time\nDate: ");
            String date = sc.nextLine();
            System.out.println("Time: ");
            String time = sc.nextLine();

            boolean isIncorrect = false;
            do {
                System.out.println("The session date is " + date + " and time is " + time + "You want to schedule? y/n");
                String answer = sc.nextLine();
                if (answer.equals("y")) {
                    isIncorrect = true;
                    isAdded = true;
                    teacherLogged.addAvailableSession(date, time);
                    getAvailableTeachers(teacherLogged);
                    System.out.println("Schedule correctly added");
                } else if (answer.equals("n")) {
                    isIncorrect = true;
                }
            } while(!isIncorrect);
        }while(!isAdded);
    }
    public static void getSessions(){
        System.out.println("Your schedule tutoring sessions:");
        if(teacherLogged.getAvailableSessions().isEmpty()){
            System.out.println("No tutoring sessions scheduled");
        }
        System.out.println(teacherLogged.getAvailableSessions());
        for(int i = 0; i < teacherLogged.getAvailableSessions().size(); i++){
            System.out.println("[" + i+1 + "]" + teacherLogged.getAvailableSessions().get(i).getAppointmentDate() + teacherLogged.getAvailableSessions().get(i).getAppointmentHour());
        }
    }
    public static void getAvailableTeachers(Teacher teacher){
        if(!availableTeachers.contains(teacher)){
            availableTeachers.add(teacher);
        }
    }
}
