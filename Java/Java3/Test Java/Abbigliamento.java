
public class Abbigliamento extends Prodotto{
	
	
	

	public Abbigliamento(String name, Double price, String categoria) {
		super(name, price, categoria);
	}

	@Override
	public Double calculateDiscount() {
		
		if (getCategoria() == "Abbigliamento invernale") {
			
			return getPrice()*(15.0/100.0);
			
		}
		else {
			return 0.0;
		}
	}
	
	

}
