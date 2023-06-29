
public class Character {
	/*Fields*/
	String name;
	Planet homeplanet;
	boolean isAlive;
	boolean isGood;
	Place location;
	
	
	/*Constructors*/
	public Character(String name, Planet homeplanet, boolean isAlive, boolean isGood, Place location){
		this.name=name;
		this.homeplanet=homeplanet;
		this.isAlive=isAlive;
		this.isGood = isGood;
		this.location=location;
	}

	/*Methods*/
	public String toString() {
		return "Name:" + name 
				+ ",\nHome Planet: " + homeplanet.name
				+ ",\nAlive: " + isAlive
				+ ",\nGood: " + isGood
				+ ",\nLocation: " + location.name;
	}
}
