package a_12;

public enum Münzart {
	
	 ZWEIEURO(200, "2 Euro"),
	 EINEURO(100, "1 Euro"),
	 FÜNFZIGCENT(50, "50 Cent"),
	 ZWANZIGCENT(20, "20 Cent"),
	 ZEHNCENT(10, "10 Cent"),
	 FÜNFCENT(5, "5 Cent"),
	 ZWEICENT(2, "2 Cent"),
	 EINCENT(1, "1 Cent");
	 
	private int wert;
	private String bezeichnung;
	
	private Münzart(int wert, String bezeichnung) {
		this.wert = wert;
		this.bezeichnung = bezeichnung;
		
		
	}

	public int getWert() {
		return wert;
	} 
	public String getBezeichnung() {
		return bezeichnung;
	} 
	
	

}
