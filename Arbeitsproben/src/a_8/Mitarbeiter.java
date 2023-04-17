package a_8;

public class Mitarbeiter extends Person {
	int personalnummer;
	int gehalt;
	
	Mitarbeiter(String NN, String VN, Geschlecht GS, Anrede AN, int PN, int Gehalt) {
		super(NN, VN, GS, AN);	
		personalnummer = PN;
		gehalt = Gehalt;
	}

	
	

}
