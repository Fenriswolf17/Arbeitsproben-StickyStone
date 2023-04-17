package a_11;

import java.util.Vector;

public class Fenster {

	double breite;
	double höhe;
	Fensterart fensterart;
	Lasur lasur;
	Farbe farbe;
	boolean sprossen;
	public Vector<Fenster> fens;
	public Vector<Fensterflügel> fensflu;

	public Fenster(double breite, double höhe, Farbe farbe, Vector<Fensterflügel> fensflu, Fensterart fensterart,
			Lasur lasur, boolean sprossen) {
		super();
		
		this.breite = breite;
		this.höhe = höhe;
		this.fensterart = fensterart;
		this.fensflu = fensflu;
		this.lasur = lasur;
		this.sprossen = sprossen;


		switch (fensterart) {
		case ALUFENSTER:

			this.farbe = farbe;
			this.lasur = null;

			break;
		case HOLZALUFENSTER:

			if (lasur != null) {

				this.farbe = null;
			}

			break;
		case HOLZFENSTER:
			if (lasur != null) {

				this.farbe = null;
			}

			break;
		case KUNSTSTOFFFENSTER:

			this.farbe = Farbe.WEIß;
			break;
		default:
			break;

		}

	}



public double preis() {
	double preis = 0;
	double größe = this.breite * this.höhe;
	double umfang = this.breite *2 + this.höhe *2;

	switch(fensterart) {
	
	case ALUFENSTER:
		preis = größe * 110;
		
		break;
	case HOLZALUFENSTER:
		preis = größe * 135;
		break;
	case HOLZFENSTER:
		preis = größe * 110;
		break;
	case KUNSTSTOFFFENSTER:
		
		preis = größe * 95;
		break;
	default:
		break;
	
	}
	
	for (int y = 0; y <= fensflu.size()-1; y++) {
		
		fensflu.elementAt(y);
		
		switch(fensflu.elementAt(y).flügeltyp) {
		case DREHKIPPMECHANISMUS:
			preis = preis + 55;
			break;
		case DREHMECHANISMUS:
			preis = preis + 45;
			break;
		case FESTVERGLASUNG:
			preis = preis + 30;
			break;
		default:
			break;
		
		
		}
		if ((fensterart == fensterart.HOLZALUFENSTER || fensterart == fensterart.HOLZFENSTER) && lasur == lasur.HELL) {
			preis = preis + (umfang*4);
		}
		if(fensflu.elementAt(y).sprossen == true)
			preis = preis + preis*0.15;


		
	}
	
	
	return preis;
	
	
}
}
