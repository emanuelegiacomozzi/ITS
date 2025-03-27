
public class ClienteSync extends Thread{
	
	private String nome;
	private Double somma;
	
	
	
	public ClienteSync(String nome, Double somma) {
		super();
		this.nome = nome;
		this.somma = somma;
	}



	public void run() {
		
		ContoCorrente c1 = new ContoCorrente();
		try {
			double saldoOld = c1.getSaldo();
			System.out.println(nome + " ha un saldo iniziale di: " + saldoOld);
			c1.prelievo(somma);
			System.out.println(nome + " preleva: " + somma);
			double saldoNew = c1.getSaldo()-somma;
			System.out.println(nome + " ha un saldo aggiornato pari a: " + saldoNew);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
