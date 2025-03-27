import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
			Calcolatore c1 = (a,b) -> a+b;
			double somma = c1.calcola(5,5);
			System.out.println(somma);
			
			//VerificaParola p1 = (parola,lunghezza) -> 
			
			CalcolatoreArea ca1 = (raggio) -> raggio*raggio*3.14;
			double area = ca1.calcola(10);
			System.out.println(area);
			
			VerificatoreNumero vn1 = (numero) -> numero>0;
			boolean numero = vn1.verifica(10);
			System.out.println(numero);
			
			Concatenazione conc = (s1,s2) -> s1+s2;
			String stringhe = conc.concatena("Ciao", "Mondo");
			System.out.println(stringhe);
			
			VerificatorePari vp1 = (numero1) -> numero1%2==0 ;
			boolean pari = vp1.verifica(3);
			System.out.println(pari);
			
			List<Integer> numeri = new ArrayList<>();
			numeri.add(20);
			numeri.add(4);
			numeri.add(8);
			numeri.add(11);
			Sommatore sommatore = lista -> {
				int sum=0;
				for(Integer num : numeri) {
					sum+=num;
				}
				return sum;
			};
			int risultato = sommatore.somma(numeri);
			System.out.println(risultato);
			
			VerificatoreParole verify = parola -> {
				String parolainvertita = "";
				for(int i = parola.length()-1; i>=0; i--) {
					parolainvertita += parola.charAt(i);
				}
				return parola.equalsIgnoreCase(parolainvertita);
			};
			String parola = "radar";

	        boolean isPalindroma = verify.verifica(parola);

	        if (isPalindroma) {
	            System.out.println("La parola "+ parola + " è palindroma.");
	        } else {
	            System.out.println("La parola "+ parola + " non è palindroma.");
	        }
			
	}
}


