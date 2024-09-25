package Model;

import java.util.Date;

public class TeacherAppointment implements IAgendable{
    private int id;
    private Teacher teacher;
    private Student student;
    private Date date;
    private String hour;

    public TeacherAppointment(Teacher teacher, Student student) {
        this.teacher = teacher;
        this.student = student;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    @Override
    public void register(Date date, String hour) {
        this.date = date;
        this.hour = hour;
    }

}
