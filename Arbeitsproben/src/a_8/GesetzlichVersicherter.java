package a_8;

public class GesetzlichVersicherter extends Kunde {
	
	String krankenkasse;

	public GesetzlichVersicherter(String NN, String VN, Geschlecht GS, Anrede AN, Arzt BA, String KK) {
		super(NN, VN, GS, AN, BA);
		krankenkasse = KK;

	}

}
