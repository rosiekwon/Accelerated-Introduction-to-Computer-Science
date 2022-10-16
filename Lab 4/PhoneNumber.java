package labs.lab4;

public class PhoneNumber {
	/*1.Create three instance variables, countryCode, areaCode and number, all of which should be Strings.
2.Write the default constructor.
3.Write the non-default constructor.
4.Write 3 accessor methods, one for each instance variable.
5.Write 3 mutator methods, one for each instance variable.
6.Write a method that will return the entire phone number as a single string (the toString method).
7.Write a method that will return true if the areaCode is 3 characters long.
8.Write a method that will return true if the number is 7 characters long.
9.Optional: 7 and 8 return true if the areaCode is 3 digit characters long and the number is 7 digit characters long.
10.Now write an application class that instantiates two instances of PhoneNumber. One instance should use the default constructor and the other should use the non-default constructor. Display the values of each object by calling the toString method.
*/
	// Instance Variables 
		private String countryCode;
		private String areaCode;
		private String number;

		// Default Constructor
		public PhoneNumber() { 
		setCountryCode("0");
		setAreaCode("123");
		setNumber("1234567");
		}
		// Non-default Constructor
		public PhoneNumber(String countryCode, String areaCode, String number) {
		setCountryCode(countryCode);
		setAreaCode(areaCode);
		setNumber(number);
		}
		
		//Mutator
		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;}
		public void setAreaCode(String areaCode) {
			if (areaCode.length() == 3) { // make sure value is valid
			this.areaCode = areaCode;}
		}
		public void setNumber(String number) {
			if (number.length() == 7) { // make sure value is valid
			this.number = number;}
		}
		//Accessors
		public String getCountryCode() {
			return countryCode;
		}
		public String getAreaCode() {
			return areaCode;
		}
		public String getNumber() {
			return number;
		}
		// ToString method, Returns the data stored in this instance as a formatted String
		public String toString() {
		String result = (countryCode + areaCode + number);
		return result;
		}
		
	}
