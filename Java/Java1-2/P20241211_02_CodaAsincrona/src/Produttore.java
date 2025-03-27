
public class Produttore  extends Thread{
	
	public void run() {
		Random rng = new Random();
		while(true) {
			Integer num = rng.nextInt(0, 1000);
			Main.PushCoda(num);
		}
	}
}
