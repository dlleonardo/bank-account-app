package bankAccount;

public class Person {
	protected String first_name;
	protected String last_name;
	protected String nationality;
	protected String city;
	protected String address;
	protected Integer phone_number;
	
	Person(String cFirstName, String cLastName, String cNationality, String cCity, String cAddress, 
		   Integer cPhoneNumber){
		this.first_name = cFirstName;
		this.last_name = cLastName;
		this.nationality = cNationality;
		this.city = cCity;
		this.address = cAddress;
		this.phone_number = cPhoneNumber;
	}
}
