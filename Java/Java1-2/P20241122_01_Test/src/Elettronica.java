
public class Elettronica extends Prodotto {
	
	

	

	public Elettronica(String name, Double price, String categoria) {
		super(name, price, categoria);
	}

	@Override
	public Double calculateDiscount() {
		
		if (getPrice() > 500.0 ) {
			
			return getPrice()*(15.0/100.0);
			
			
		}
		else {
			return 0.0;
		}
		
	}
	
	
	
	

}
