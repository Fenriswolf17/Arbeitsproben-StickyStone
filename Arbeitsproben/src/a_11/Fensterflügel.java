package a_11;

import java.util.Vector;
import static a_11.Verglasung.*;

public class Fensterflügel {

	Verglasung verglasung;
	Flügeltyp flügeltyp;
	Flügelbefestigung fb;
	boolean sprossen;

	public Vector<Fensterflügel> f;

	public void push(Fensterflügel ff) {

		f.add(ff);
	}

	public Fensterflügel(Verglasung verglasung, Flügeltyp flügeltyp, Flügelbefestigung fb) {
		super();
		this.verglasung = verglasung;
		this.flügeltyp = flügeltyp;
		this.fb = fb;

		switch (flügeltyp) {
		case DREHKIPPMECHANISMUS:
			break;
		case DREHMECHANISMUS:
			break;
		case FESTVERGLASUNG:
			this.fb = null;
			break;
		default:
			break;

		}
	}

}
