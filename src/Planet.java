
public class Planet extends Place{
	
	Planet(String name,boolean empire){
		super( name, empire);
	}
	public String toString() {
		return "Name:" + name + ",\nisEmpire: " + isEmpire;
	}
}
