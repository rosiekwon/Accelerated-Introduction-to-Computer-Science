package labs.lab4;

public class location {
	
	public static void main(String[] args) {
		GeoLocation location1 = new GeoLocation();// Create new Geolocation using default constructor
		System.out.println("latitute value of default constructor is "+ location1.getLat());
		System.out.println("longitute value of default constructor is "+ location1.getLng());
		
		GeoLocation location2 = new GeoLocation(10,100);
		System.out.println("latitute value of non default constructor is "+ location2.getLat());
		System.out.println("longitute value of non default constructor is "+ location2.getLng());
		
		 	}

}
