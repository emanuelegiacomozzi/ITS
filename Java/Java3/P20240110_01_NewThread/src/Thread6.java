
public class Thread6 extends Thread{
	
	private String nome;
	
	
	
	public Thread6(String nome) {
		super();
		this.nome = nome;
	}
	
	



	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
