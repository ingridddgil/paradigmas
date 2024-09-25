package Model;

import java.util.ArrayList;

public class Teacher extends User {
    private String TeacherID;
    private String specialty;

    public Teacher(String tID, String n, String e, String specialty, String telephone) {
        super(n, e, telephone);
        this.TeacherID = tID;
        this.specialty = specialty;
    }
    public String getTeacherID() {
        return TeacherID;
    }

    public void setTeacherID(String teacherID) {
        TeacherID = teacherID;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    ArrayList<AvailableSessions> availableSessions = new ArrayList<AvailableSessions>();

    public void addAvailableSession(String date, String hour) {
        availableSessions.add(new AvailableSessions(date, hour));
    }

    public ArrayList<AvailableSessions> getAvailableSessions() {
        return availableSessions;
    }

    public String toString() {
        return super.toString() + "\nAvailable Tutoring Sessions\n" + availableSessions.toString();
    }

    public static class AvailableSessions extends AppointmentTutoringSession {
        public AvailableSessions(String date, String hour) {
            super(date,hour);
        }
    }

}
