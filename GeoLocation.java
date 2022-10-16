package labs.lab4;

public class GeoLocation {
	// Instance Variables 
	protected static double lat;
	protected static double lng;

	// Default Constructor
	public GeoLocation() { 
	setLat(0);
	setLng(0);
	}
	// Non-default Constructor
	public GeoLocation(double lat, double lng) {
	setLat(lat);
	setLng(lng);
	}
	
	//Mutator
	public void setLat(double lat) {
		if (lat >= -90 && lat <= 90) {	// make sure value is valid
		this.lat = lat;}
	}
	public void setLng(double lng) {
		if (lat >= -180 && lat <= 180) {
		this.lng = lng;}
	}
	//Accessors
	public double getLat() {
		return lat;
	}
	public double getLng() {
		return lng;
	}
	// ToString method, Returns the data stored in this instance as a formatted String
	public String toString() {
	String result = "("+ lat+ ","+ lng +")";
	return result;
	}
	public static double calcDistance(double lat2, double long2) {
		return Math.sqrt(Math.pow(lat-lat2,2)+Math.pow(lng-long2,2));
	}
	public double calcDistance(GeoLocation g) {
		return calcDistance(g.getLat(),g.getLng());
	}
		 
}

	

