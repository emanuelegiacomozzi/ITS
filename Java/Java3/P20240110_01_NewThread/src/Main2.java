
public class Main2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		ClienteSync c1 = new ClienteSync("Mario", 20.0);
		ClienteSync c2 = new ClienteSync("Lucia", 50.0);
		ClienteNonSync cn1= new ClienteNonSync("Carlo", 10.0);
		// Avvio i Threads
		c1.start();
		c2.start();
		cn1.start();
		// Attendo il completamento
		c1.join();
		c2.join();
		cn1.join();

	}

}
