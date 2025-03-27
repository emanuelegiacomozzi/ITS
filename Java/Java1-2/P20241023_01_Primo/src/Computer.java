
public class Computer {
	 
	private double prezzo;
	private double peso;
	private double larghezza;
	private double altezza;
	private double profondità;
	private String produttore;
	private int anno_produzione;
	
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
	}
	@Override
	public String toString() {
		return String.format("Computer Info:\nPrezzo: %.5g €\nPeso: %.3g kg\nLarghezza: %.3g cm\nAltezza: %.3g cm\nProfondità: %.3g cm\nProduttore: %s\nAnno di Produzione: %d\n",
	            prezzo, peso, larghezza, altezza, profondità, produttore, anno_produzione);
	}
	
	
	
	
}
