package labs.lab4;

public class phonenumberapplication {

	public static void main(String[] args) {
		PhoneNumber number1 = new PhoneNumber();// Create new phonenumber using default constructor
		System.out.println("countrycode of default constructor is "+ number1.getCountryCode());
		System.out.println("areacode of default constructor is "+ number1.getAreaCode());
		System.out.println("number of default constructor is "+ number1.getNumber());
		
		PhoneNumber number2 = new PhoneNumber("1","432","0234567");// Create new phonenumber using non default constructor
		System.out.println("countrycode of default constructor is "+ number2.getCountryCode());
		System.out.println("areacode of default constructor is "+ number2.getAreaCode());
		System.out.println("number of default constructor is "+ number2.getNumber());

	}
}

