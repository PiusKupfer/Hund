
public class Schaeferhund extends Hund {

	 public Schaeferhund(String name,int alter,double lautstaerkeDB){
		
		 super(name,alter,lautstaerkeDB);
		 this.rasse= "Schaeferhund";
	}
	
	 
	 public @Override double lautstaerkeDB() {
		 return lautstaerkeDB*1.5;
	 }
	 
	 
	 
	 
}
