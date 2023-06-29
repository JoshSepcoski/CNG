
public class Jedi extends Character{
	Jedi(String name, Planet homeplanet, boolean isAlive, boolean isGood, Place location){
		super( name,  homeplanet,  isAlive,  isGood,  location);
	}
	public String toString() {
		return "Name:" + name 
				+ ",\nHome Planet: " + homeplanet.name
				+ ",\nAlive: " + isAlive
				+ ",\nGood: " + isGood
				+ ",\nLocation: " + location.name
				+ "\nRole: Jedi";
	}
}
