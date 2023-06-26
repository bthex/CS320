
public class Contact {
	
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	/*
	 * Contact Requirements
	 * 
	 * All inputs cannot be null
	 *
	 * contactId, firstName, lastName max length 10 chars
	 * phoneNumbr must be exactly 10 chars
	 * address max length 30 chars
	 */
	public Contact(String contactId, String fName, String lName, String number, String address) {
		// Check if contactId meets requirements for entry
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid entry for Contact Id");
		}
		// Check if First Name meets requirements for entry
		if (fName == null || fName.length() > 10) {
			throw new IllegalArgumentException("Invalid Entry for First Name");
		}
		// Check if Last Name meets requirements for entry
		if (lName == null || lName.length() > 10) {
			throw new IllegalArgumentException("Invalid Entry for Last Name");
		}
		// Check if Phone Number meets requirements for entry
		if (number == null || number.length() != 10) {
			throw new IllegalArgumentException("Invalid Entry for Phone Number");
		}
		// Check if Address meets requirements for entry
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Entry for Address");
		}
		
		this.contactId = contactId;
		this.firstName = fName;
		this.lastName = lName;
		this.phoneNumber = number;
		this.address = address;
	}
	
	//Getter Methods
	public String getContactId() {
		return contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	// Setter Methods used by Contact Service
	public void setFirstName(String fName) {
		// Check if First Name meets requirements for entry
		if (fName == null || fName.length() > 10) {
			throw new IllegalArgumentException("Invalid Entry for First Name");
		}
		this.firstName = fName;
	}
	
	public void setLastName(String lName) {
		// Check if Last Name meets requirements for entry
		if (lName == null || lName.length() > 10) {
			throw new IllegalArgumentException("Invalid Entry for Last Name");
		}
		this.lastName = lName;
	}
	
	public void setPhoneNumber(String pNumber) {
		// Check if Phone Number meets requirements for entry
		if (pNumber == null || pNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid Entry for Phone Number");
		}
		this.phoneNumber = pNumber;
	}
	
	public void setAddress(String address) {
		// Check if Address meets requirements for entry
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Entry for Address");
		}
		this.address = address;
	}
}
