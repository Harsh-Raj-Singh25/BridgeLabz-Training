package CabbyGo;

public class Driver {
	 public  String name;
	 public String licenseNumber;
	 private double rating;
	 
	 Driver(String name,String  licenseNumber,double rating){
		 this.licenseNumber=licenseNumber;
		 this.name=name;
		 this.rating=rating;
	 }
	 public double getRating() {
		 return rating;
	 }

	 public void setRating(double rating) {
		 this.rating = rating;
	 }
	 
}
