package a_8;



public class Krankenpfleger extends Mitarbeiter {

	Krankenpfleger(String NN, String VN, Geschlecht GS, Anrede AN, int PN, int Gehalt) {
		super(NN, VN, GS, AN, PN, Gehalt);
		
	}
	
	@Override
	public String ansprache(){
			
			
			switch(anrede)
			{
			case FRAU : return "Krankenpflegerin "+ vorname + " "+ nachname;

			
			case HERR :  return "Krankenpfleger "+ vorname + " "+ nachname;

			}
			return "Was für eine Anrede wollen Sie benutzen?";
		}
	public String formloseAnsprache() {
		
		return super.ansprache();
		
	}
}

	


