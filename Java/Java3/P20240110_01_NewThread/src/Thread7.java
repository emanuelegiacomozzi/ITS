
public class Thread7 extends Thread{
	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Thread interrotto");
		}
	}

}
