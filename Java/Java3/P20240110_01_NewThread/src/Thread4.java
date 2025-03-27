public class Thread4 extends Thread{
	public void run() {
	
    for (int number=0; number<=5; number++) {
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	System.out.println(number);
    }
    
	}
}
