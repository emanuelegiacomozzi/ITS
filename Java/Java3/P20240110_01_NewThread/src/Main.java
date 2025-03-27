
public class Main {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		Thread1 thread1 = new Thread1();
		//thread1.start();
		
		Thread thread2 = new Thread(new Thread2());
		//thread2.start();
		
		Thread thread3a = new Thread(new Thread3());
		Thread thread3b = new Thread(new Thread3());
		//thread3a.start();
		//thread3b.start();
		
		Thread4 thread4a = new Thread4();
		Thread4 thread4b = new Thread4();
		//thread4a.start();
		//thread4b.start();
		
		Thread5 thread5a = new Thread5(5);
		Thread5 thread5b = new Thread5(6);
		//thread5a.start();
		//thread5b.start();
		
		Thread6 thread6a = new Thread6("pippo");
		Thread6 thread6b = new Thread6("paperino");
		//System.out.println("Nome e stato del thread 1 prima dello start: " + thread6a.getNome() + " " + thread6a.getState());
		//System.out.println("Nome e stato del thread 2 prima dello start: " + thread6b.getNome() + " " + thread6b.getState());
		//thread6a.start();
		//thread6b.start();
		//thread6a.setNome("topolino");
		//thread6b.setNome("paperina");
		//System.out.println("Nome e stato del thread 1 dopo lo start: " +  thread6a.getNome() + " " + thread6a.getState());
		//System.out.println("Nome e stato del thread 2 dopo lo start: " + thread6b.getNome() + " " + thread6b.getState());
		
		Thread7 thread7 = new Thread7();
		System.out.println("Stato del thread dopo della creazione: " + thread7.getState());
		thread7.start();
		System.out.println("Stato del thread dopo l'avvio: " + thread7.getState());
		try {
			thread7.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Stato del thread dopo la terminazione: " + thread7.getState());
		

	}

}
