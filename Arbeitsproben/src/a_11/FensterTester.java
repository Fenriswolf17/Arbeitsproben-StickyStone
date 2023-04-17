package a_11;

import java.util.Vector;

public class FensterTester {

	public static void main(String args[]) {

		Vector<Fensterflügel> f = new Vector<Fensterflügel>();

		Fensterflügel ff = new Fensterflügel(Verglasung.DREIFACHVERGLASUNG, Flügeltyp.DREHKIPPMECHANISMUS,
				Flügelbefestigung.LINKS);
		Fensterflügel fff = new Fensterflügel(Verglasung.DREIFACHVERGLASUNG, Flügeltyp.FESTVERGLASUNG,
				Flügelbefestigung.LINKS);
		f.add(ff);
		f.add(fff);

		Vector<Fenster> fes = new Vector<Fenster>();


		Fenster fenster = new Fenster(3.7, 1.9, Farbe.BLAU, f, Fensterart.HOLZFENSTER, Lasur.DUNKEL, false);
		

		Kundendatenansatz ka = new Kundendatenansatz("Hartmann", "Franziska", "Marktplatz", "80", "78727", "Furtwangen");



		Vector<Fensterflügel> f2 = new Vector<Fensterflügel>();

		Fensterflügel ff2 = new Fensterflügel(Verglasung.DREIFACHVERGLASUNG, Flügeltyp.FESTVERGLASUNG,
				Flügelbefestigung.LINKS);
		Fensterflügel fff2 = new Fensterflügel(Verglasung.DREIFACHVERGLASUNG, Flügeltyp.DREHKIPPMECHANISMUS,
				Flügelbefestigung.LINKS);

		f2.add(fff2);
		f2.add(ff2);

		Fenster fenster2 = new Fenster(4.0, 1.9, Farbe.GELB, f2, Fensterart.ALUFENSTER, Lasur.DUNKEL, false);

		fes.add(fenster);
		fes.add(fenster2);
		

		FensterBestellung bes = new FensterBestellung(fes, ka, f);

		System.out.println(bes.toString());
		System.out.println(bes.fehler());
		System.out.println("Der Preis beträgt:" + fenster.preis() + " €");

		

	}

}
