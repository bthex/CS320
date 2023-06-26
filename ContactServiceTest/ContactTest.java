import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {

	@Test
	public void testContact() {
		Contact testContact = new Contact("1990", "Bret", "Addams", "5551234567",
											"345 Test Dr. Ashland MT, 59003");
		assertTrue(testContact.getContactId().equals("1990"));
		assertTrue(testContact.getFirstName().equals("Bret"));
		assertTrue(testContact.getLastName().equals("Addams"));
		assertTrue(testContact.getPhoneNumber().equals("5551234567"));
		assertTrue(testContact.getAddress().equals("345 Test Dr. Ashland MT, 59003"));
	}

	@Test
	public void testContactIdLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("012334567891", "Bret", "Addams", "5551234567",
							"345 Test Dr. Ashland MT, 59003");
		});
	}
	
	@Test
	public void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Bret", "Addams", "5551234567",
							"345 Test Dr. Ashland MT, 59003");
		});
	}

	@Test
	public void testFirstNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1990", "Bret1234567", "Addams", "5551234567",
							"345 Test Dr. Ashland MT, 59003");
		});
	}
	
	@Test
	public void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1990", null, "Addams", "5551234567",
							"345 Test Dr. Ashland MT, 59003");
		});
	}

	@Test
	public void testLastNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1990", "Bret", "Addams12345", "5551234567",
							"345 Test Dr. Ashland MT, 59003");
		});
	}
	
	@Test
	public void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1990", "Bret", null, "5551234567",
							"345 Test Dr. Ashland MT, 59003");
			});
	}

	@Test
	public void testPhoneNumberLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1990", "Bret", "Addams", "1234567",
							"345 Test Dr. Ashland MT, 59003");
			});
	}
	
	@Test
	public void testPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1990", "Bret", "Addams", null,
							"345 Test Dr. Ashland MT, 59003");
			});
	}

	@Test
	public void testAddressLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1990", "Bret", "Addams", "5551234567",
							"345 Test Dr. Ashland MT, 59003 123");
			});
	}
	
	@Test
	public void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1990", "Bret", "Addams", "5551234567",
							null);
			});
	}

	@Test
	public void testSetFirstName() {
		Contact testContact = new Contact("1990", "Bret", "Addams", "5551234567",
				"345 Test Dr. Ashland MT, 59003");
		testContact.setFirstName("Bobby");
		assertTrue(testContact.getFirstName().equals("Bobby"));
	}

	@Test
	public void testSetLastName() {
		Contact testContact = new Contact("1990", "Bret", "Addams", "5551234567",
				"345 Test Dr. Ashland MT, 59003");
		testContact.setLastName("Bobby");
		assertTrue(testContact.getLastName().equals("Bobby"));
	}

	@Test
	public void testSetPhoneNumber() {
		Contact testContact = new Contact("1990", "Bret", "Addams", "5551234567",
				"345 Test Dr. Ashland MT, 59003");
		testContact.setPhoneNumber("7654321555");
		assertTrue(testContact.getPhoneNumber().equals("7654321555"));
	}

	@Test
	public void testSetAddress() {
		Contact testContact = new Contact("1990", "Bret", "Addams", "5551234567",
				"3 Test st. Ash AZ, 76234");
		testContact.setLastName("Bobby");
		assertTrue(testContact.getAddress().equals("3 Test st. Ash AZ, 76234"));
	}

}
