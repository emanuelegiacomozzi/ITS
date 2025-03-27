
public class Main {

	public static void main(String[] args) {
		
//		MyThread th1 = new MyThread(1000);
//		th1.start();
//		
//		MyThread th2 = new MyThread(1000);
//		th2.start();//programma sequenziale
		//oppure th2.start(); programma parallelo
		//System.exit(0);
		
		GenID id1 = new GenID();
		id1.start();
		
		GenID id2 = new GenID();
		id2.start();
		
		GenID id3 = new GenID();
		id3.start();
		
		GenID id4 = new GenID();
		id4.start();
	}

}
