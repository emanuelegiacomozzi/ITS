
public class Computer {
	
	/*
	 * Realizzare una classe computer con attributi:
	 * Prezzo
	 * Peso
	 * DImensioni(larghezza, altezza ,profondità)
	 * Produttore
	 * Anno di produzione
	 * 
	 * Nel main creare degli oggetti di tipo computer e stampare il contenuto
	 * 
	 * NB: ricordare di utilizzare getter, setter e costruttore
	 * generati da eclipse
	 */
	private double prezzo;
	private double peso;
	private double larghezza;
	private double altezza;
	private double profondità;
	private String produttore;
	private int anno_produzione;
	private static int contatore=0;
	
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getLarghezza() {
		return larghezza;
	}
	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	public double getProfondità() {
		return profondità;
	}
	public void setProfondità(double profondità) {
		this.profondità = profondità;
	}
	public String getProduttore() {
		return produttore;
	}
	public void setProduttore(String produttore) {
		this.produttore = produttore;
	}
	public int getAnno_produzione() {
		return anno_produzione;
	}
	public void setAnno_produzione(int anno_produzione) {
		this.anno_produzione = anno_produzione;
	}
	
	public Computer(double prezzo, double peso, double larghezza, double altezza, double profondità, String produttore,
			int anno_produzione) {
		super();
		this.prezzo = prezzo;
		this.peso = peso;
		this.larghezza = larghezza;
		this.altezza = altezza;
		this.profondità = profondità;
		this.produttore = produttore;
		this.anno_produzione = anno_produzione;
		contatore++;
	}
	
	public Computer() {
		contatore++;
	
	}
	@Override
	public String toString() {
		return "Computer [prezzo=" + prezzo + ", peso=" + peso + ", larghezza=" + larghezza + ", altezza=" + altezza
				+ ", profondità=" + profondità + ", produttore=" + produttore + ", anno_produzione=" + anno_produzione
				+ "]";
	}
	static public int GetContatore() {
		return contatore;
	}
	
	
	
}
