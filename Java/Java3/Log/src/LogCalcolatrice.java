import java.util.logging.Logger;

public class LogCalcolatrice {
	
	Logger logger = Logger.getLogger(LogSuFile.class.getName());
	
	public double somma(double a , double b) {
		return a+b;
	}
	
	public double sottrazione(double a, double b) {
		logger.info("Risultato della sottrazione "+ (a-b));
		return a-b;
	}
	
	public double moltiplicazione(double a, double b) {
		return a*b;
	}
	
	public int divisione(int a, int b) {
		return a/b;
	}
}
