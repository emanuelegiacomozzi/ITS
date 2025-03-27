import java.util.LinkedList;

public class CompagniaAerea {
	
	private LinkedList<Volo> voli;
	private LinkedList<Aereo> aerei;
	
	public CompagniaAerea(LinkedList<Volo> voli, LinkedList<Aereo> aerei) {
		super();
		this.voli = voli;
		this.aerei = aerei;
	}

	public CompagniaAerea() {
		super();
	}
	
	public LinkedList<Volo> getVoli() {
		return voli;
	}

	public void setVoli(LinkedList<Volo> voli) {
		this.voli = voli;
	}

	public LinkedList<Aereo> getAerei() {
		return aerei;
	}

	public void setAerei(LinkedList<Aereo> aerei) {
		this.aerei = aerei;
	}

	public void AddAereo(Aereo a) {
		aerei.add(a);
	}
	
	public void RemoveAereo(Aereo a) {
		aerei.remove(a);
	}
	

}