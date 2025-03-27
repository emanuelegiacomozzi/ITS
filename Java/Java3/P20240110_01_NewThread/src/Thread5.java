
public class Thread5 extends Thread{
	
	private int par;
	
	
	public Thread5(int par) {
		super();
		this.par = par;
	}



	public void run() {
		int x = 5;
		int y = 6;
		if(par==x) {
			for (int i=1; i<=10; i++) {
				System.out.println(i);
			}
		}
		else if (par==y) {
			for (int i=100; i>=90; i--) {
				System.out.println(i);
			}
		}
		
	}
}
