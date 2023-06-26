import java.util.ArrayList;
import java.util.Date;

/**
 *
 * This class is used to update and store appointment information,
 * and contains unique appointment id, date and description.
 *
 */
public class AppointmentService {

    public static String uniqueId;

    // Data Structure used to store Appointments
    static ArrayList<Appointment> AppointmentList = new ArrayList<Appointment>(0);

    /**
     * This method uses the size of data structure to create an id. Checks if empty,
     * then looks for last used id. Converts string to int adds 1 to id,
     * converts back to string.
     *
     * @return newId String that is used as uniqueId when creating an Appointment.
     */
    public static String generateAppointmentId() {

        String newId;
        if (AppointmentList.isEmpty()) {
            uniqueId = "1";
        } else {
            // Find last used taskId
            int size = AppointmentList.size();
            uniqueId = AppointmentList.get(size - 1).getAppointmentId();
        }
        // Convert last taskId to int and add 1
        int tempInt = Integer.parseInt(uniqueId);
        tempInt += 1;
        newId = Integer.toString(tempInt);

        return newId;
    }

    /**
     *
     * @param asDate
     * @param asDescription
     */
    public static void addNewAppointment(Date asDate, String asDescription) {

        String newId = generateAppointmentId();
        Appointment Appointment0 = new Appointment(newId, asDate, asDescription);

        AppointmentList.add(Appointment0);

    }

    /**
     *
     * @param appointmentId
     * @param newAppoinmentDate
     */
    public static void updateAppointmentDate(String appointmentId, Date newAppoinmentDate) {

        for (int i = 0; i < AppointmentList.size(); i++) {
            if (appointmentId.compareTo(AppointmentList.get(i).getAppointmentId()) == 0) {
                AppointmentList.get(i).setAppointmentDate(newAppoinmentDate);
            }
        }
    }

    /**
     *
     * @param appointmentId
     * @param newAppointmentDescrip
     */
    public static void updateAppointmentDescrip(String appointmentId, String newAppointmentDescrip) {

        for (int i = 0; i < AppointmentList.size(); i++) {
            if (appointmentId.compareTo(AppointmentList.get(i).getAppointmentId()) == 0) {
                AppointmentList.get(i).setAppointmentDescription(newAppointmentDescrip);
            }
        }
    }

    /**
     *
     * @param appointmentId
     */
    public static void deleteAppointment(String appointmentId) {
        for (int i = 0; i < AppointmentList.size(); i++) {
            if (appointmentId.compareTo(AppointmentList.get(i).getAppointmentId()) == 0) {
                AppointmentList.remove(i);
            }
        }
    }
}
