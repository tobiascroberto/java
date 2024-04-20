import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    // attributes
    static int id = 0;
    String name;
    String speciality;

    Doctor(String name, String speciality){
    this.name = name;
    this.speciality = speciality;
    id++;
    }

    public void showName(){
        System.out.println("El nombre del doctor es: "+name);
    }

    ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();
    public void AvailableAppointment(Date date, String time){
    availableAppointment.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointment (){
        return availableAppointment;
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
