

public class Studente {
	
	private String nome;
	private int eta;
	private String corso;
	private int anno_frequenza;
	
	
	public String getNome() {
		return nome;
	}


	public int getEta() {
		return eta;
	}


	public String getCorso() {
		return corso;
	}


	public int getAnno_frequenza() {
		return anno_frequenza;
	}



	public Studente(String nome, int eta, String corso, int anno_frequenza) {
		super();
		this.nome = nome;
		this.eta = eta;
		this.corso = corso;
		this.anno_frequenza = anno_frequenza;
	}


	public String toString() {
		return "Studente [nome=" + nome +", eta=" + eta +", corso=" + corso + ", anno_frequenza=" + anno_frequenza + "]";
	}
	
	

}