import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ContoCorrente extends Thread{
	
	private double saldo = 100.0;
	
	public double getSaldo() {
		return saldo;
	}
	
	
	public void prelievoNonSynch(double somma) throws Exception{
		Thread.sleep(3000);
		 
		BufferedWriter bw = null;
		FileWriter fw = null;
		 
		try {
		double nuovoSaldo = getSaldo() - somma;
		 
		if(nuovoSaldo > 0) {
		fw = new FileWriter(new File(".").getCanonicalPath() + File.separator + "db.txt");
		bw = new BufferedWriter(fw);
		bw.write(nuovoSaldo+"");
		} else
		throw new Exception("Saldo insufficiente!");
		} catch (IOException e) {
		e.printStackTrace();
		} finally {
		try {
		if (bw != null)
		bw.close();
		 
		if (fw != null)
		fw.close();
		} catch (IOException ex) {
		ex.printStackTrace();
		}
		 
		}
	}
	
	public synchronized void prelievo(double somma) throws Exception {
		Thread.sleep(3000);
		 
		BufferedWriter bw = null;
		FileWriter fw = null;
		 
		try {
		double nuovoSaldo = getSaldo() - somma;
		 
		if(nuovoSaldo > 0) {
		fw = new FileWriter(new File(".").getCanonicalPath() + File.separator + "db.txt");
		bw = new BufferedWriter(fw);
		bw.write(nuovoSaldo+"");
		} else
		throw new Exception("Saldo insufficiente!");
		} catch (IOException e) {
		e.printStackTrace();
		} finally {
		try {
		if (bw != null)
		bw.close();
		 
		if (fw != null)
		fw.close();
		} catch (IOException ex) {
		ex.printStackTrace();
		}
		 
		}
		}

}
