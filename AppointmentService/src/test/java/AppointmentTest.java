import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(OrderAnnotation.class)
class AppointmentTest {

    @Test
    @Order(1)
    void testAppointment() {

        @Deprecated
        Date testDate = new Date(2023 - 1900, 5, 14);
        Appointment testAppointment = new Appointment("123", testDate,
                "This is the description.");

        //System.out.println(testDate); //Used for testing purposes
        assertEquals("123", testAppointment.getAppointmentId());
        assertEquals("Wed Jun 14 00:00:00 CDT 2023", testDate.toString());
        assertEquals("This is the description.", testAppointment.getAppointmentDescription());
    }

    @Test
    void appointmentIdNull() {

        @Deprecated
        Date testDate = new Date(2023 - 1900, 5, 14);

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Appointment(null, testDate, "This is the description."));
    }

    @Test
    void appointmentIdLength() {

        @Deprecated
        Date testDate = new Date(2023 - 1900, 5, 14);

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Appointment("12345678900", testDate,
                        "This is the description."));
    }

    @Test
    void setAppointmentDate() {

        @Deprecated
        Date testDate = new Date(2023 - 1900, 5, 14);
        Date newDate = new Date(2023 - 1900, 5, 17);

        Appointment testAppointment = new Appointment("123", testDate,
                "This is the description.");

        testAppointment.setAppointmentDate(newDate);
        //System.out.println(testDate); //Used for testing purposes
        assertEquals("123", testAppointment.getAppointmentId());
        assertEquals("Sat Jun 17 00:00:00 CDT 2023", newDate.toString());
        assertEquals("This is the description.", testAppointment.getAppointmentDescription());
    }

    @Test
    void appointmentDateNull() {
        @Deprecated
        Date testDate = new Date(2023 - 1900, 5, 14);

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Appointment("123", null,
                "This is the description."));
    }

    @Test
    void appointmentDateEarly() {
        @Deprecated
        Date testDate = new Date(2022 - 1900, 5, 14);

        Assertions.assertThrows(IllegalArgumentException.class, () ->
        new Appointment("123", testDate,
                "This is the description."));
    }

    @Test
    void setAppointmentDescription() {

        @Deprecated
        Date testDate = new Date(2023 - 1900, 5, 14);
        Appointment testAppointment = new Appointment("123", testDate,
                "This is the description.");

        testAppointment.setAppointmentDescription("This is the new description.");
        //System.out.println(testDate); //Used for testing purposes
        assertEquals("123", testAppointment.getAppointmentId());
        assertEquals("Wed Jun 14 00:00:00 CDT 2023", testDate.toString());
        assertEquals("This is the new description.", testAppointment.getAppointmentDescription());
    }

    @Test
    void appointmentDescriptionNull() {
        @Deprecated
        Date testDate = new Date(2023 - 1900, 5, 14);

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Appointment("123", testDate,
                        null));
    }

    @Test
    void appointmentDescriptionLength() {
        @Deprecated
        Date testDate = new Date(2023 - 1900, 5, 14);

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Appointment("123", testDate,
                        "This is the description.This is the description.12345"));
    }
}