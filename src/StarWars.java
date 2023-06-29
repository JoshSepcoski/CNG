
public class StarWars {
	public static void main(String[] args){
		/*------Instantiate------*/
		/*Places*/
		Planet degobah = new Planet("Degobah", false);
		Planet alderaan = new Planet("Alderaan", true);
		Place somewhere = new Place("somewhere");
		Ship falcon = new Ship("Meillenium Falcon", false, somewhere);
		Ship deathStar = new Ship("Death Star", false, somewhere);
		
		/*Characters*/
		Character hans = new Character("Hans", alderaan,true, true, somewhere);
		Character leah = new Character("leah", alderaan,true,true,falcon);
		Jedi yoda = new Jedi("Yoda", degobah,true,true,degobah);
		Jedi luke = new Jedi("Luke", degobah,true,true,falcon);
		Jedi darthVader = new Jedi("Darth Vader", alderaan,true,false,deathStar);
		StormTrooper storm1 = new StormTrooper("tk001", alderaan,true,deathStar);
		StormTrooper storm2 = new StormTrooper("tk002", alderaan,false,deathStar);
		StormTrooper storm3 = new StormTrooper("tk003", alderaan,false,deathStar);
		StormTrooper storm4 = new StormTrooper("tk004", alderaan,true,deathStar);
		
		String msg = hans.toString() + "\n\n" 
					+ leah.toString()+ "\n\n"
					+ yoda.toString()+ "\n\n" 
					+ luke.toString()+ "\n\n"
				    + darthVader.toString()+ "\n\n"
					+ storm1.toString()+ "\n\n"
					+ storm2.toString()+ "\n\n"
					+ storm3.toString()+ "\n\n"
					+ storm4.toString()+ "\n\n";
		System.out.println(msg);
	}
}
