import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * This class is used for appointment information, and contains
 * unique appointment id, date and description.
 */
public class Appointment {


    private  String appointmentId;
    private Date appointmentDate;
    private String appointmentDescription;

    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");

    /**
     * This constructor accepts data for appointments id, date,
     * and description and sets appointment data equal to inputs
     *
     * @param newAppointmentId String value for appointment id.
     * @param newAppointmentDate Date value for appointment date.
     * @param newDescription String Value for appointment description.
     */
    public Appointment(String newAppointmentId, Date newAppointmentDate, String newDescription) {

        Date currentDate = new Date();

        if (newAppointmentId == null || newAppointmentId.length() > 10) {
            throw new IllegalArgumentException("Invalid Entry for Appointment Id");
        }
        if (newAppointmentDate == null || newAppointmentDate.before(currentDate)) {
            throw new IllegalArgumentException("Appointment cannot be before today's date.");
        }
        if (newDescription == null || newDescription.length() > 50) {
            throw new IllegalArgumentException("Invalid entry for Appointment Description.");
        }

        this.appointmentId = newAppointmentId;
        this.appointmentDate = newAppointmentDate;
        this.appointmentDescription = newDescription;

    }

    //Getter Methods
    /**
     * This method returns the current value of the appointments
     * current id.
     *
     * @return String
     */
    public String getAppointmentId() {
        return appointmentId;
    }

    /**
     * This method returns the current value of the appointments
     * current date.
     *
     * @return Date
     */
    public Date getAppointmentDate() {
        return appointmentDate;
    }

    /**
     * This method returns the current value of the appointments
     * current description.
     *
     * @return String
     */
    public String getAppointmentDescription() {
        return appointmentDescription;
    }

    //  Setter Methods

    /**
     * This method will set the date for the appointment. If the date
     * entered is null or before current date method will fail.
     *
     * @param appointDate Date value to set appointmentDate.
     */
    public void setAppointmentDate(Date appointDate) {
        if (appointDate == null || appointDate.before(new Date())) {
            throw new IllegalArgumentException("Appointment cannot be before today's date.");
        }
        else {
            this.appointmentDate = appointDate;
        }
    }

    /**
     * This method will set the description for the appointment. If the
     * description is null or longer than 50 chars method will fail.
     *
     * @param appointDescription
     */
    public void setAppointmentDescription(String appointDescription){
        if (appointDescription == null || appointDescription.length() > 50) {
            throw new IllegalArgumentException("Invalid entry for appointment description.");
        }
        else {
            this.appointmentDescription = appointDescription;
        }
    }
}
