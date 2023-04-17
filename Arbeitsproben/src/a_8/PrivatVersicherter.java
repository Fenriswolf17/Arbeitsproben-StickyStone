package a_8;

public class PrivatVersicherter extends Kunde{
	
	String iban;
	String bic;

	public PrivatVersicherter(String NN, String VN, Geschlecht GS, Anrede AN, Arzt BA, String I, String B) {
		super(NN, VN, GS, AN, BA);
		iban = I;
		bic = B;
	}

}
