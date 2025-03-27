import java.util.ArrayList;
import java.util.List;

public class ProductApp {

	public static void main(String[] args) {
		
		List<Prodotto> products = new ArrayList<Prodotto>();
		
		Prodotto PC = new Elettronica("PC", 850.0, "Elettronica");
		Prodotto sciarpa = new Abbigliamento("Sciarpa", 10.0, "Abbigliamento invernale");
		
		ProductManager pm = new ProductManager(products);
		
		pm.aggiungiProdotto(PC);
		pm.aggiungiProdotto(sciarpa);
		
		System.out.println("Prima dell'ordinamento");
		pm.stampaProduct();
		
		pm.sortByPrice(products);
		
		System.out.println("Dopo l'ordinamento");
		pm.stampaProduct();
	
	}
		
		
		
	

}
