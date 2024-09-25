package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppointmentTutoringSession {
    private Date appointmentDate;
    private String appointmentHour;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public AppointmentTutoringSession(String appointmentDate, String appointmentHour) {
        try {
            this.appointmentDate = format.parse(appointmentDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        this.appointmentHour = appointmentHour;
    }

    void AvailableSessions(Date date, String hour) {
        this.appointmentDate = date;
        this.appointmentHour = hour;
    }

    public String getAppointmentHour() {
        return appointmentHour;
    }

    public void setAppointmentHour(String appointmentHour) {
        this.appointmentHour = appointmentHour;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String toString() {
        return "Appointment date: " + appointmentDate + " " + appointmentHour + " hrs\n";
    }



}
