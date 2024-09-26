package Model;

import java.util.ArrayList;
import java.util.Date;
import Model.TeacherAppointment;

public class Student extends User {
    private String studentID;
    private String course;
    ArrayList<TeacherAppointment> sessionsScheduled = new ArrayList();

    public Student(String id, String name,  String course, String telephone) {
        super(name, id + "@estudiantes.uv.mx", telephone);
        this.studentID = id;
        this.course = course;
    }
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        studentID = studentID;
    }

    public String toString(){
        return "Student ID: " + this.studentID + "\n" + super.toString() + "\nCourse: " + this.course;
    }

    public void addTeacherTutoring(Teacher teacher, Date date, String hour){
        TeacherAppointment teacherAppointment = new TeacherAppointment(teacher, this);
        teacherAppointment.register(date,hour);
        sessionsScheduled.add(new TeacherAppointment(teacher, this));
    }

    public ArrayList<TeacherAppointment> getSessionsScheduled() {
        return sessionsScheduled;
    }
}
