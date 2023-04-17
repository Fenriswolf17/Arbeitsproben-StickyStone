package a_8;

public class Person{
	
	protected String nachname;
	protected String vorname;
	protected Geschlecht geschlecht;
	protected Anrede anrede;
	
	public Person(String NN, String VN, Geschlecht GS, Anrede AN){
		
		nachname = NN;
		vorname = VN;
		geschlecht = GS;
		anrede = AN;
		
	}
	
	public String ansprache(){
		
		
		switch(anrede)
		{
		case FRAU : return "Frau " + vorname + " " + nachname; 
		
		case HERR : return "Herr " + vorname + " "+ nachname;
		}
		return "Was für eine Anrede wollen Sie benutzen?";
	}
	

}