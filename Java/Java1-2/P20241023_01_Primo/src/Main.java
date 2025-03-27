
public class Main {

	public static void main(String[] args) {
		
		Computer[] pc = new Computer[10];
		
		for(int i=0; i<10; i++) {
			
			pc[i].setPrezzo(Math.random()*(2000.-800.)+800.);
			pc[i].setPeso(Math.random()*(20.-15.5)+15.5);
		    pc[i].setLarghezza(Math.random()*(2.5-1.)+1.);
		    pc[i].setAltezza(Math.random()*(30.-20.)+20);
		    pc[i].setProfondità(Math.random()*(18.-13.3)+13.3);
		    pc[i].setProduttore("Acer");
		    pc[i].setAnno_produzione((int)(Math.random() * (2024 - 2016)) + 2016);
		    
			System.out.println(pc[i].toString());
		}
		
		
	}

}
