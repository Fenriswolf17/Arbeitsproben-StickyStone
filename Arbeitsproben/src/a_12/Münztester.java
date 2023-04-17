package a_12;

public class Münztester {

	public static void main(String[] args) throws Exception {
		
		Münzensammlung ms = new Münzensammlung();
		ms.setMünze(Münzart.FÜNFCENT, 3);
		ms.setMünze(Münzart.ZWEIEURO, 2);
		Münzensammlung msz = new Münzensammlung(60);
		
		Münzensammlung kasse = new Münzensammlung();
		kasse.setMünze(Münzart.FÜNFCENT, 3);
		kasse.setMünze(Münzart.ZWEIEURO, 2);
		kasse.setMünze(Münzart.EINEURO, 2);
		kasse.setMünze(Münzart.ZEHNCENT, 2);
		
		Münzensammlung kunde = new Münzensammlung();
		kunde.setMünze(Münzart.FÜNFZIGCENT, 3);
		kunde.setMünze(Münzart.EINEURO, 3);

		
		//System.out.println(ms.getMünze(Münzart.FÜNFCENT));
		System.out.println(ms.toString());
		//System.out.println(ms.wert());
		//System.out.println(msz);
		try {
			Münzensammlung sammlung = new Münzensammlung(200, ms);
			System.out.println(sammlung);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//System.out.println(ms.toString());
		//System.out.println(kasse.toString());
		//System.out.println(kunde.toString());


		ms.normieren();
		System.out.println(ms.toString());
		try{
			System.out.println(Münzensammlung.rückgeld(200, kunde, kasse).toString());
		}catch (Exception e) {
			System.out.println(e.getMessage());



		


	}

}
}
