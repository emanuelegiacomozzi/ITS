
public class Main {

	public static void main(String[] args) {
		
		/*
		 * for i in range(0,10):
		 * 		print(i)
		 * 
		 * 
		 */
		
		/*
		 * primo elemento: dichiarazione e inizializzazione variabile i
		 * secondo elemento: condizione di permanenza nel ciclo
		 * terzo elemento: alla fine del ciclo incremento della variabile i
		 */
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		

		int i1 = 20;
		for (; i1<25; i1 += 10) {
			System.out.println(i1);
		}
		
		/*
		 * for i in range(2, 21, 2):
		 *     print(i)
		 */
		for (int i=2; i<=20; i+=2) {
			System.out.println(i);
		}
		
		
		for (int i=2; i<=20; i++) {
			System.out.println(i);
			i = i+1;
		}
		
	
		for (int i=0; i<10; i++) {
			
			double d = Math.random();
			System.out.println(d);
			
		}
		
		
        for (int i=0; i<10; i++) {
			
			double d = Math.random();
			System.out.print(d);
			System.out.print(" ");
			
		}
        System.out.println();
        
        
        for (int i=0; i<11; i++) {
			
			double d = Math.random();
			System.out.println(((i<9)?" ":"") + (i+1) + ") " + d);
			
		}
        /*
         * Operatore ternario
         * <espressione logica>?<valore se true>:<valore se false>
         */
        
        for (int i=0; i<10; i++) {
        	double d = Math.random();
        	System.out.printf("%2d)\t%4.3g\n", i+1, d);
        }
        
        int ni = 10;
        System.out.printf("Il numero è: %d\n", ni);
        
        
        
        
		

	}

}
