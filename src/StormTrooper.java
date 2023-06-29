
public class StormTrooper extends Character{
	StormTrooper(String name, Planet homeplanet, boolean isAlive, Place location){
		super( name,  homeplanet,  isAlive,  false,  location);
	}
	public String toString() {
		return "\nName:" + name 
				+ ",\nHome Planet: " + homeplanet.name
				+ ",\nAlive: " + isAlive
				+ ",\nGood: " + isGood
				+ ",\nLocation: " + location.name
				+ "\nRole: StormTrooper";
	}
}
