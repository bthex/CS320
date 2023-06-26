import java.util.ArrayList;

public class ContactService {
	
	// Variables
	public static String newContactId;
	public String newFirstName;
	public String newLastNAme;
	public String newPhoneNumber;
	public String newAddress;
	
	// Structure to store contact data
	static ArrayList<Contact> ContactList = new ArrayList<Contact>(0);
	
	// Used to Generate unique contactId
	public static String generateContactId() {
		
		String tempContactId = null;
		
		if (ContactList.isEmpty()) {
			newContactId = "1";
		}
		else {
			// Check last value used and set Contact Id to next
			int arraySize = ContactList.size();
			newContactId = ContactList.get(arraySize - 1).getContactId();
		}
		// Convert last Contact Id to int and add 1 
		int tempInt = Integer.valueOf(newContactId);
		tempInt += 1;
		tempContactId = Integer.toString(tempInt);
		return tempContactId;
	}
	
	// Create Contact and add to ContactList
	public static void addNewContact(String fName, String lName, String pNumber, String address) {
		String contactID = generateContactId();
		Contact Contact0 = new Contact(contactID, fName, lName, pNumber, address);
		ContactList.add(Contact0);
	}

	//Setter Methods for Updating Contact Information
	public static void updateFirstName(String contactId, String newFName) {
		for (int i = 0; i < ContactList.size(); i++) {
			if (contactId.compareTo(ContactList.get(i).getContactId()) == 0) {
				ContactList.get(i).setFirstName(newFName);
			}
		}
	}
	
	public static void updateLastName(String contactId, String newLName) {
		for (int i = 0; i < ContactList.size(); i++) {
			if (contactId.compareTo(ContactList.get(i).getContactId()) == 0) {
				ContactList.get(i).setLastName(newLName);
			}
		}
	}
	
	public static void updatePhoneNumber(String contactId, String newPhoneNumber) {
		for (int i = 0; i < ContactList.size(); i++) {
			if (contactId.compareTo(ContactList.get(i).getContactId()) == 0) {
				ContactList.get(i).setPhoneNumber(newPhoneNumber);
			}
		}
	}
	
	public static void updateAddress(String contactId, String newAddress) {
		for (int i = 0; i < ContactList.size(); i++) {
			if (contactId.compareTo(ContactList.get(i).getContactId()) == 0) {
				ContactList.get(i).setAddress(newAddress);
			}
		}
	}
	
	public static void deleteContact(String contactId) {
		for (int i = 0; i < ContactList.size(); i++) {
			if (contactId.compareTo(ContactList.get(i).getContactId()) == 0) {
				ContactList.remove(i);
			}
		}
	}
}
