package a_11;

import java.util.Vector;

import static a_11.Farbe.*;
import static a_11.Fensterart.*;
import static a_11.Flügelbefestigung.*;
import static a_11.Flügeltyp.*;
import static a_11.Lasur.*;
import static a_11.Verglasung.*;

@SuppressWarnings("unused")
public class FensterBestellung {

	Vector<Fenster> fenster;
	Vector<Fensterflügel> flügel;
	Kundendatenansatz ka = new Kundendatenansatz(null, null, null, null, null, null);

	public FensterBestellung(Vector<Fenster> fenster, Kundendatenansatz k, Vector<Fensterflügel> flügel) {

		super();

		this.flügel = flügel;
		this.fenster = fenster;
		this.ka = k;

	}

	@Override
	public String toString() {

		String bestellung = "";
		Fenster fe = new Fenster(0, 0, Farbe.BLAU, flügel, Fensterart.ALUFENSTER, Lasur.DUNKEL, false);
		Fensterflügel fl = new Fensterflügel(Verglasung.DOPPELVERGLASUNG, Flügeltyp.DREHKIPPMECHANISMUS,
				Flügelbefestigung.LINKS);

		for (int i = 0; i <= fenster.size() - 1; i++) {

			bestellung = bestellung + "---Fensterdaten---" + "\r\n";
			bestellung = bestellung + "Fenster Nr." + (i + 1) + "\r\n";
			fe = fenster.elementAt(i);

			bestellung = bestellung + "Höhe: " + fe.höhe + "\r\n";
			bestellung = bestellung + "Breite: " + fe.breite + "\r\n";
			bestellung = bestellung + "Farbe: " + fe.farbe + "\r\n";
			bestellung = bestellung + "Fenster Art: " + fe.fensterart + "\r\n";
			bestellung = bestellung + "Lasur: " + fe.lasur + "\r\n";
			bestellung = bestellung + "\r\n";

			for (int j = 0; j <= fe.fensflu.size() - 1; j++) {

				bestellung = bestellung + "--Flügeldaten-- " + "\r\n";
				bestellung = bestellung + "Flügel Nr. " + (j + 1) + "\r\n";
				fl = flügel.elementAt(j);
				bestellung = bestellung + "Flügeltyp: " + fl.flügeltyp + "\r\n";
				bestellung = bestellung + "Verglasung: " + fl.verglasung + "\r\n";
				bestellung = bestellung + "Flügelbefestigung: " + fl.fb + "\r\n";
				bestellung = bestellung + "Sprossen: " + fl.sprossen + "\r\n";
				bestellung = bestellung + "\r\n";

			}

		}
		bestellung = bestellung + "---Kundendaten---" + "\r\n";
		bestellung = bestellung + "Nachname: " + ka.nachname + "\r\n";
		bestellung = bestellung + "Vorname: " + ka.vorname + "\r\n";
		bestellung = bestellung + "Straße: " + ka.straße + "\r\n";
		bestellung = bestellung + "Hausnummer: " + ka.hausnummer + "\r\n";
		bestellung = bestellung + "Plz: " + ka.plz + "\r\n";
		bestellung = bestellung + "Ort: " + ka.ort + "\r\n";

		return bestellung;
	}

	public String fehler() {

		Fenster fe = new Fenster(0, 0, Farbe.BLAU, flügel, Fensterart.ALUFENSTER, Lasur.DUNKEL, false);
		Fensterflügel fl = new Fensterflügel(Verglasung.DOPPELVERGLASUNG, Flügeltyp.DREHKIPPMECHANISMUS,
				Flügelbefestigung.LINKS);
		double Größe = 0;
		fl = fe.fensflu.elementAt(0);

		for (int i = 0; i <= fenster.size() - 1; i++) {

			fe = fenster.elementAt(i);
			Größe = Größe + (fe.breite * fe.höhe);

			if ((fe.breite / fe.fensflu.size()) < 0.8 || (fe.höhe / fe.fensflu.size()) < 0.8) {

				return "Jeder Flügel ist nicht min. 800mm groß oder breit";

			}

			if (fe.höhe > 2 || fe.breite > 5 && fe.fensterart != Fensterart.HOLZFENSTER)
				return "Die Fenster dürfen nur maximal 2 meter hoch oder 5 meter breit sein.";

			if (fe.höhe > 2 || fe.breite > 4 && fe.fensterart == Fensterart.HOLZFENSTER)
				return "Holzfenster dürfen nur maximal 2 meter hoch oder 4 meter breit sein.";

			for (int j = 0; j <= fe.fensflu.size() - 1; j++) {

				fl = fe.fensflu.elementAt(j);
				if (fe.fensterart == Fensterart.ALUFENSTER && fl.verglasung != Verglasung.DREIFACHVERGLASUNG)
					return "Alufenster werden nur mit Dreifachverglasung geliefert";

				if (fe.fensflu.size() == 2) {

					if (j == 0 && fl.flügeltyp != Flügeltyp.FESTVERGLASUNG && fl.fb != Flügelbefestigung.LINKS) {

						return "Für den linken Flügel muss die Flügelbefestigung links sein.";
					} else if (j == 1 && fl.flügeltyp != Flügeltyp.FESTVERGLASUNG
							&& fl.fb != Flügelbefestigung.RECHTS) {

						return "Für den rechten Flügel muss die Flügelbefestigung rechts sein.";

					}

				}
				if (fe.fensflu.size() == 3) {
					if (j == 0 && fl.flügeltyp != Flügeltyp.FESTVERGLASUNG && fl.fb != Flügelbefestigung.LINKS) {

						return "Für den linken Flügel muss die Flügelbefestigung links sein.";
					} else if (j == 3 && fl.flügeltyp != Flügeltyp.FESTVERGLASUNG
							&& fl.fb != Flügelbefestigung.RECHTS) {

						return "Für den rechten Flügel muss die Flügelbefestigung rechts sein.";
					}

				}
			}
			

		}
		if (Größe < 10) {

			return "Die Fensterfläche ist unter 10m^2";
		} else
			return null;

	}
	
	public double preis() {
		
		double preis = 0;
		for(int i =0; i <= fenster.size()-1; i++) {
			
			preis = preis + fenster.elementAt(i).preis();
		}
		
		return preis;
	}
}
