package a_8;


public class Kunde extends Person{
	
	Arzt behandelnderArzt;

	public Kunde(String NN, String VN, Geschlecht GS, Anrede AN, Arzt BA) {
		super(NN, VN, GS, AN);
		behandelnderArzt = BA;
	}
	
	public boolean arztRangHoeherAlsBei (Kunde ku2) {
		
		return this.behandelnderArzt.rang.ordinal() < ku2.behandelnderArzt.rang.ordinal();
	}
	

}
