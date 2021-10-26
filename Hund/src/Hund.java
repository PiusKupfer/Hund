
public class Hund {
	String rasse;

	String name;

	int alter; 
	int StandardAlter;

	double lautstaerkeDB; 
	double StandardWollmenge;
	
	public static void main(String[] args) {
	Hund h1 = new Hund("Hund1",4,31.4);
		System.out.println(h1.lautstaerkeDB());
		Hund sh1 = new Schaeferhund("Hund2",4,31.4);
		System.out.println(sh1.lautstaerkeDB());
	}
	public Hund(int StandardAlter,double StandardWollmenge) {
	
		this.StandardAlter = 12;
		this.StandardWollmenge = 30;
	}
	
	public Hund(String name,int alter,double lautstaerkeDB) {
			
		this.name=name;
		this.alter=alter;
		this.lautstaerkeDB =lautstaerkeDB;
	}
	
	public Hund(String name) {
		this.name = name;
		int StandardAlter;
		double StandardWollmenge;	
	}
		
	public Hund(){
	
		String StandardName = "1";
		
	}
	public double lautstaerkeDB() { 
	return lautstaerkeDB;
	}
}

