
public class Place {
	
	/*Fields*/
	String name;
	boolean isEmpire;
	
	/*Constructors*/
	public Place(String n,boolean empire){
		this.name=n;
		this.isEmpire=empire;
	}
	public Place(String n) {
		 this.name = n;
	}

	/*Methods*/
	public String toString() {
		return "Name:" + name + ",\nisEmpire: " + isEmpire;
	}
}
