package a_8;

public class KrankenhausTester {
	
public static void main (String[] args) {
	Person p1 = new Person("Müller", "Helene", Geschlecht.DIVERS, Anrede.FRAU);
	Person m1 = new Mitarbeiter("Müller", "Helene", Geschlecht.DIVERS, Anrede.FRAU, 78727, 4000);
	Arzt a1 = new Arzt("Müller", "Helene", Geschlecht.DIVERS, Anrede.FRAU, 78727, 4000, 78, Rang.FACHARZT );
	Arzt a2 = new Arzt("Müller", "Hermine", Geschlecht.WEIBLICH, Anrede.FRAU, 78727, 4000, 78, Rang.ASSISTENZARZT );
Krankenpfleger k1 = new Krankenpfleger("Müller", "Helene", Geschlecht.DIVERS, Anrede.FRAU, 78727, 4000);
	Kunde ku1 = new Kunde("Mayer", "Robert", Geschlecht.MAENNLICH, Anrede.HERR, a1);	
	Kunde ku2 = new Kunde("Mayer", "Stefen", Geschlecht.MAENNLICH, Anrede.HERR, a2);
	System.out.println(p1.ansprache());
	System.out.println(a1.ansprache());
	System.out.println(k1.ansprache());
	System.out.println(ku1.arztRangHoeherAlsBei(ku2));
	System.out.println(ku1.ansprache());





		
	}

}
