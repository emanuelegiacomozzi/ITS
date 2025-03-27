
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    // Creiamo un oggetto Logger
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    
    static {
		logger.setUseParentHandlers(false);
		logger.setLevel(Level.INFO);
		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(Level.FINEST);
		logger.addHandler(handler);
	}
    
    public static void main(String[] args) {
        
    	
//    	logger.severe("This is a SEVERE error message");
//		logger.warning("This is a WARNING message");
//		logger.info("This is an INFO message");
//		logger.config("This is a CONFIG message");
//		logger.fine("This is a FINE debug message");
//		logger.finer("This is a FINER debug message (more detailed)");
//		logger.finest("This is a FINEST debug message (most detailed)");
//		
//		Main lc = new Main();
//		lc.somma(10, 20);
		
		LogCalcolatrice calcolatrice = new LogCalcolatrice();
		double somma = calcolatrice.somma(20, 4.5);
		logger.info("Risultato della somma: " + somma);
		calcolatrice.sottrazione(10, 9.14);
		double moltiplicazione = calcolatrice.moltiplicazione(40.34, 12.509);
		logger.info("Risultato della moltiplicazione: "+ moltiplicazione);
		try {
			int divisione = calcolatrice.divisione(33,0);
			logger.info("Risultato della divisione: "+ divisione);
        } catch (ArithmeticException e) {
            logger.severe("Errore nella divisione: " + e.getMessage());
        }
		
	}
	
//	public int somma (int a, int b) {
//		logger.info("Somma eseguita");
//	return a+b;
//	}
        
}
