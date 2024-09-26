package UI;

import Model.Teacher;

import java.util.Scanner;
import static UI.UIMenu.*;
import Model.TeacherAppointment;
import java.util.ArrayList;

public class UIStudent {
    public final static String [] MONTH = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto"
            ,"Septiembre","Octubre","Noviembre","Diciembre"};

    public static void studentMenu(){
        int choice = 0;

        do {
            System.out.println("What do you want to do today?");
            System.out.println("Schedule a tutoring session (1)\nSee my schedule sessions (2)\nExit(3)");
            Scanner sc = new Scanner(System.in);
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    scheduleSession();
                    break;
                    case 2:
                        getSessions();
                        break;
                        case 3:
                            System.out.println("Exiting...");
                            System.exit(0);
                            break;
                            default:
                                System.out.println("Invalid option");
                                break;
            }
        } while(choice != 0);
    }
    private static void scheduleSession(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Schedule a tutoring session");
        int confirmation = 0;

        do {
            System.out.println("Select a teacher");
            for (Teacher teacher : UITeacher.availableTeachers){
                int i = UITeacher.availableTeachers.indexOf(teacher) + 1;
                System.out.println(i + "- " + teacher.getName());
            }
            int answerTeacher = sc.nextInt();

            System.out.println("Select a session");
            Teacher teacherSelected = UITeacher.availableTeachers.get(answerTeacher - 1);
            System.out.println("Teacher's available sessions");

            for (Teacher.AvailableSessions as : teacherSelected.getAvailableSessions()){
                System.out.println((teacherSelected.getAvailableSessions().indexOf(as) + 1) + "- " + as.getAppointmentDate() + " - " + as.getAppointmentHour());
            }

            int sessionSelected = sc.nextInt();

            do {
                System.out.println("Teacher: " + teacherSelected.getName() + "\n" + teacherSelected.getAvailableSessions().get(sessionSelected - 1));
                System.out.println("You want to schedule? \nyes (1) no (2)");
                confirmation = sc.nextInt();
            }while (confirmation < 1 || confirmation > 2 );

            if (confirmation == 1) {
                Teacher.AvailableSessions as  = teacherSelected.getAvailableSessions().get(sessionSelected - 1);
                studentLogged.addTeacherTutoring(teacherSelected, as.getAppointmentDate(), as.getAppointmentHour());
            }
        } while(confirmation != 1);
    }

    private static void getSessions(){
        System.out.println();

        ArrayList<TeacherAppointment> mySessions = studentLogged.getSessionsScheduled();
        if(mySessions.isEmpty()){
            System.out.println("No sessions scheduled");
        }
        int i = 0;
        for(TeacherAppointment ta : mySessions){
            System.out.println(i + "- " + ta);
            i++;
        }
        System.out.println();
    }

}
