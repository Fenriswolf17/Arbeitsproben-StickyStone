package a_8;
import static a_8.Rang.*;

public class Arzt extends Mitarbeiter {

	int bueronummerzimmer;
	Rang rang;
	
	Arzt(String NN, String VN, Geschlecht GS, Anrede AN, int PN, int Gehalt, int BNZ, Rang R ) {
		super(NN, VN, GS, AN, PN, Gehalt);	
		bueronummerzimmer = BNZ;
		rang = R;

	}
	@Override
public String ansprache(){
		
		
		switch(anrede)
		{
		case FRAU : if(rang == DIREKTOR) return "Direktorin "+ vorname + " " + nachname;
					else if(rang == ASSISTENZARZT) return "Assistenzärztin "+ vorname + " " + nachname;
					else if(rang == FACHARZT) return "Fachärztin "+ vorname + " " + nachname;
					else if(rang == OBERARZT) return "Oberärztin "+ vorname + " " + nachname;
					else if(rang == LEITENDER_OBERARZT) return "Leitende Oberärztin "+ vorname + " " + nachname;
					else if(rang == CHEFARZT) return "Chefärztin "+ vorname + " " + nachname;

		
		case HERR : if(rang == DIREKTOR) return "Direktor "+ vorname + " " + nachname;
					else if(rang == ASSISTENZARZT) return "Assistenzarzt "+ vorname + " " + nachname;
					else if(rang == FACHARZT) return "Facharzt "+ vorname + " " + nachname;
					else if(rang == OBERARZT) return "Oberarzt "+ vorname + " " + nachname;
					else if(rang == LEITENDER_OBERARZT) return "Leitender Oberarzt "+ vorname + " " + nachname;
					else if(rang == CHEFARZT) return "Chefarzt "+ vorname + " " + nachname;

		}
		return "Was für eine Anrede wollen Sie benutzen?";
	}
	
	public boolean rangHoeherAls(Arzt a) {
		
		return rang.ordinal() > a.rang.ordinal();
		
	}

}
