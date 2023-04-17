package a_12;

import java.util.Hashtable;
import static a_12.Münzart.*;

public class Münzensammlung {

	private Hashtable<Münzart, Integer> m = new Hashtable<Münzart, Integer>();

	public Münzensammlung() {

		for (Münzart mü : Münzart.values())
			m.put(mü, 0);

	}

	public void setMünze(Münzart mü, int n) {
		m.put(mü, n);

	}

	public int getMünze(Münzart mü) {

		return m.get(mü);

	}

	@Override
	public String toString() {

		StringBuffer sb = new StringBuffer();
		for (Münzart mü : Münzart.values()) {
			if (m.get(mü) != 0) {
				sb.append(mü.getBezeichnung() + " - " + m.get(mü) + " Stück" + "\r\n");
			}
		}
		return sb.toString();

	}

	public int wert() {

		int wert = 0;
		for (Münzart mü : Münzart.values()) {

			wert = wert + m.get(mü) * mü.getWert();

		}

		return wert;

	}

	public Münzensammlung(int i) {

		for (Münzart mü : Münzart.values())
			m.put(mü, 0);

		Münzensammlung ms = new Münzensammlung();

		int wert = i;

		for (Münzart mü : Münzart.values()) {

			int counter = 0;

			while (wert - mü.getWert() >= 0) {

				ms.setMünze(mü, ++counter);
				wert = wert - mü.getWert();

				if (wert == 0)
					break;

			}

		}
		m = ms.m;
	}

	public Münzensammlung(int i, Münzensammlung l) throws Exception {

		for (Münzart mü : Münzart.values())
			m.put(mü, 0);

		Münzensammlung ms = new Münzensammlung();

		int wert = i;

		for (Münzart mü : Münzart.values()) {

			int counter = 0;

			while (wert - mü.getWert() >= 0 && l.getMünze(mü) > -1) {

				l.setMünze(mü, l.getMünze(mü) - 1);
				if (l.getMünze(mü) < 0)
					throw new Exception("Keine Münzen vorhanden");

				ms.setMünze(mü, ++counter);
				wert = wert - mü.getWert();

				if (wert == 0)
					break;

			}

		}
		m = ms.m;

	}

	public void normieren() {

		int wert = 0;

		for (Münzart mü : Münzart.values()) {

			wert = wert + m.get(mü) * mü.getWert();

		}
		Münzensammlung ms = new Münzensammlung(wert);
		this.m = ms.m;
	}

	public static Münzensammlung rückgeld(int preis, Münzensammlung bezahlt, Münzensammlung bestand) throws Exception {

		Münzensammlung ms = new Münzensammlung();

		int wert = preis;
		for (Münzart mü : Münzart.values()) {

			while (wert - mü.getWert() >= 0 && bestand.getMünze(mü) > -1 && bezahlt.getMünze(mü) != 0) {
				bestand.setMünze(mü, bestand.getMünze(mü) - 1);
				if (bestand.getMünze(mü) < 0)
					throw new Exception("Nicht genug Geld");
				bezahlt.setMünze(mü, bezahlt.getMünze(mü) - 1);
				wert = wert - mü.getWert();

				if (wert == 0)
					break;
			}
		}
		ms.m = bezahlt.m;
		if (wert > 0)
			throw new Exception("Keine passenden Münzen vorhanden");

		return ms;

	}
}
