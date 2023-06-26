import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testContactService() {
		ContactService.addNewContact("Bret", "Addams", "5551234567", "345 Test Dr. Ashland MT,59003");
		int size = ContactService.ContactList.size();
		System.out.println("ContactId : " + ContactService.ContactList.get(size - 1).getContactId());
		System.out.println();
		
		assertTrue(ContactService.ContactList.get(size - 1).getContactId().equals("5"));
		assertTrue(ContactService.ContactList.get(size - 1).getFirstName().equals("Bret"));
		assertTrue(ContactService.ContactList.get(size - 1).getLastName().equals("Addams"));
		//assertTrue(ContactService.ContactList.get(size - 1).getPhoneNumber().equals("7654321555")); 
		assertTrue(ContactService.ContactList.get(size - 1).getPhoneNumber().equals("5551234567"));
		assertTrue(ContactService.ContactList.get(size - 1).getAddress().equals("345 Test Dr. Ashland MT,59003"));
		//assertTrue(ContactService.ContactList.get(size - 1).getAddress().equals("Fast Ln Race Track, 12345"));
	}

	@Test
	void testUpdateFirstName() {
		ContactService.addNewContact("Bret", "Addams", "5551234567", "345 Test Dr. Ashland MT,59003");
		int size = ContactService.ContactList.size();
		
		System.out.println("testUpdateFirstName");
		System.out.println("ContactId : " + ContactService.ContactList.get(size - 1).getContactId());
		System.out.println("First Name : " + ContactService.ContactList.get(size - 1).getFirstName());
		
		ContactService.updateFirstName(ContactService.ContactList.get(size - 1).getContactId(), "Ricky");
		System.out.println("Updated Name : " + ContactService.ContactList.get(size - 1).getFirstName());
		System.out.println();
		assertTrue(ContactService.ContactList.get(size - 1).getFirstName().equals("Ricky"));
	}

	@Test
	void testUpdateLastName() {
		ContactService.addNewContact("Bret", "Addams", "5551234567", "345 Test Dr. Ashland MT,59003");
		int size = ContactService.ContactList.size();
		
		System.out.println("testUpdateLastName");
		System.out.println("ContactId : " + ContactService.ContactList.get(size - 1).getContactId());
		System.out.println("Last Name : " + ContactService.ContactList.get(size - 1).getLastName());
		
		ContactService.updateLastName(ContactService.ContactList.get(size - 1).getContactId(), "Bobby");
		System.out.println("Updated Name : " + ContactService.ContactList.get(size - 1).getLastName());
		System.out.println();
		assertTrue(ContactService.ContactList.get(size - 1).getLastName().equals("Bobby"));
	}

	@Test
	void testUpdatePhoneNumber() {
		ContactService.addNewContact("Bret", "Addams", "5551234567", "345 Test Dr. Ashland MT,59003");
		int size = ContactService.ContactList.size();
		
		System.out.println("testUpdatePhoneNumber");
		System.out.println("ContactId : " + ContactService.ContactList.get(size - 1).getContactId());
		System.out.println("Phone Number : " + ContactService.ContactList.get(size - 1).getPhoneNumber());
		
		ContactService.updatePhoneNumber(ContactService.ContactList.get(size - 1).getContactId(), "7654321555");
		System.out.println("Updated Number : " + ContactService.ContactList.get(size - 1).getPhoneNumber());
		System.out.println();
		assertTrue(ContactService.ContactList.get(size - 1).getPhoneNumber().equals("7654321555"));
	}

	@Test
	void testUpdateAddress() {
		ContactService.addNewContact("Bret", "Addams", "5551234567", "345 Test Dr. Ashland MT,59003");
		int size = ContactService.ContactList.size();
		
		System.out.println("testUpdateAddress");
		System.out.println("ContactId : " + ContactService.ContactList.get(size - 1).getContactId());
		System.out.println("Address : " + ContactService.ContactList.get(size - 1).getFirstName());
		
		ContactService.updateAddress(ContactService.ContactList.get(size - 1).getContactId(), "Fast Ln Race Track, 12345");
		System.out.println("Updated Name : " + ContactService.ContactList.get(size - 1).getFirstName());
		System.out.println();
		assertTrue(ContactService.ContactList.get(size - 1).getAddress().equals("Fast Ln Race Track, 12345"));
	
	}

	@Test
	void testDeleteContact() {
		ContactService.addNewContact("Bret", "Addams", "5551234567", "345 Test Dr. Ashland MT,59003");
		
		int size = ContactService.ContactList.size();
		System.out.println("testDeleteContact");
		
		
		System.out.println("Size After ADD : " + ContactService.ContactList.size());
		System.out.println("ContactId : " + 
							ContactService.ContactList.get(size - 1).getContactId());
		
		System.out.println(ContactService.ContactList.get(size - 1).getContactId());
		System.out.println(ContactService.ContactList.get(size - 2).getContactId());
		ContactService.deleteContact(ContactService.ContactList.get(size - 1).getContactId());
		System.out.println("Size After Delete : " + ContactService.ContactList.size());
		System.out.println();
		int testsize = ContactService.ContactList.size();
		assertTrue(size > testsize);
	}

}
