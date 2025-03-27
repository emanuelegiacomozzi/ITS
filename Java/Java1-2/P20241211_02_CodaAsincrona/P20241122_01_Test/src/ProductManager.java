import java.util.Collections;
import java.util.List;

public class ProductManager implements Ordinabile{
	
	public List<Prodotto> products;
	
	
	public ProductManager(List<Prodotto> products) {
		this.products = products;
	}

	public void aggiungiProdotto(Prodotto product) {
		products.add(product);
	}
	
	public void stampaProduct() {
		for (Prodotto product : products) {
			System.out.println(product);
		}
	}
	
	
	public List<Prodotto> sortByPrice(List<Prodotto>products){
		
		Collections.sort( products);
		return products;
	}
	
	



}
