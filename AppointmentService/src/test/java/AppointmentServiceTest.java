import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(OrderAnnotation.class)
class AppointmentServiceTest {

    @Test
    @Order(1)
    void addNewAppointment() {
        @Deprecated
        Date testDate = new Date(2023 - 1900, 5, 14);

        AppointmentService.addNewAppointment(testDate, "This is the description.");
        int size = AppointmentService.AppointmentList.size();

        //System.out.println(AppointmentService.AppointmentList.get(size - 1).getAppointmentId()); // Used for testing
        assertEquals("2", AppointmentService.AppointmentList.get(size - 1).getAppointmentId());
        assertEquals("Wed Jun 14 00:00:00 CDT 2023",
                AppointmentService.AppointmentList.get(size - 1).getAppointmentDate().toString());
        assertEquals("This is the description.", AppointmentService.AppointmentList.get(size - 1).getAppointmentDescription());
    }

    @Test
    @Order(3)
    void updateAppointmentDate() {

        int size = AppointmentService.AppointmentList.size();
        Date newDate = new Date(2023 - 1900, 5, 15);

        AppointmentService.updateAppointmentDate("2", newDate);

        //System.out.println(AppointmentService.AppointmentList.get(size - 1).getAppointmentId()); // Used for testing
        assertEquals("2", AppointmentService.AppointmentList.get(size - 1).getAppointmentId());
        assertEquals("Thu Jun 15 00:00:00 CDT 2023",
                AppointmentService.AppointmentList.get(size - 1).getAppointmentDate().toString());
        assertEquals("New Description.", AppointmentService.AppointmentList.get(size - 1).getAppointmentDescription());
    }

    @Test
    @Order(2)
    void updateAppointmentDescrip() {


        int size = AppointmentService.AppointmentList.size();

        AppointmentService.updateAppointmentDescrip("2", "New Description.");

        //System.out.println(AppointmentService.AppointmentList.get(size - 1).getAppointmentId()); // Used for testing
        assertEquals("2", AppointmentService.AppointmentList.get(size - 1).getAppointmentId());
        assertEquals("Wed Jun 14 00:00:00 CDT 2023",
                AppointmentService.AppointmentList.get(size - 1).getAppointmentDate().toString());
        assertEquals("New Description.", AppointmentService.AppointmentList.get(size - 1).getAppointmentDescription());
    }

    @Test
    @Order(4)
    void deleteAppointment() {
        int size = AppointmentService.AppointmentList.size();

        AppointmentService.deleteAppointment(AppointmentService.AppointmentList.get(size - 1).getAppointmentId());
        int sizeAfterDelete = AppointmentService.AppointmentList.size();

        assertEquals(0, sizeAfterDelete);
    }
}