
public class Ship extends Place{
	
	/*Fields*/
	Place location;
	
	/*Constructors*/
	public Ship(String n, boolean empire, Place location){
		super( n,  empire);
		this.location=location;
	}
	/*Methods*/
	public String toString() {
		return "Name: " + name + ",\nisEmpire: " + isEmpire + ",\nLocation: "+ location.name;
	}
}
