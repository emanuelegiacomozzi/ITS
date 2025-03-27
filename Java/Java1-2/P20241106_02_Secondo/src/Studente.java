
public class Studente extends Persona {
	private String corso;
	private String annoDiFrequenza;
	public Studente(String nome, int eta, String corso, String annoDiFrequenza) {
		super(nome, eta);
		this.corso = corso;
		this.annoDiFrequenza = annoDiFrequenza;
	}
	public String getCorso() {
		return corso;
	}
	public void setCorso(String corso) {
		this.corso = corso;
	}
	public String getAnnoDiFrequenza() {
		return annoDiFrequenza;
	}
	public void setAnnoDiFrequenza(String annoDiFrequenza) {
		this.annoDiFrequenza = annoDiFrequenza;
	}
	public String toString() {
		return "Studente [corso=" + corso + ", annoDiFrequenza=" + annoDiFrequenza + "]";
	}
	
	
	
	
	

	
}
