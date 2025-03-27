
public class Esercizio {
	
	public static void main(String[] args) {
		
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
	Computer pc = new Computer(588.50, 2.4, 20.0, 40.0, 5.3, "Acer", 2018); 
	System.out.println("Dettagli computer:\n" + "Prezzo: " + pc.getPrezzo()  + "\nPeso: " + pc.getPeso() + "\nLarghezza: " + pc.getLarghezza() + "\nAltezza: " + pc.getAltezza() + "\nProfondità: " + pc.getProfondità() + "\nProduttore: " + pc.getProduttore() + "\nAnno di produzione: " + pc.getAnno_produzione());
	
	pc.setPrezzo(587.50);
	System.out.println("Dettagli computer:\n" + "Prezzo: " + pc.getPrezzo()  + "\nPeso: " + pc.getPeso() + "\nLarghezza: " + pc.getLarghezza() + "\nAltezza: " + pc.getAltezza() + "\nProfondità: " + pc.getProfondità() + "\nProduttore: " + pc.getProduttore() + "\nAnno di produzione: " + pc.getAnno_produzione());
	
	Computer pc1 = new Computer(570.50, 2.5, 22.0, 41.0, 5.3, "Asus", 2020); 
	System.out.println("Dettagli computer:\n" + "Prezzo: " + pc1.getPrezzo()  + "\nPeso: " + pc1.getPeso() + "\nLarghezza: " + pc1.getLarghezza() + "\nAltezza: " + pc1.getAltezza() + "\nProfondità: " + pc1.getProfondità() + "\nProduttore: " + pc1.getProduttore() + "\nAnno di produzione: " + pc1.getAnno_produzione());
	
	}
			
}
