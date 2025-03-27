import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Calcolatore c = (a,b) -> a+b;
		int somma = c.calcola(1,2);
		System.out.println("Somma: "+ somma);
		
		VerificatoreParola vp = (p,l) -> p.length()>l;
		boolean verificatore = vp.verifica("Parallelo", 4);
		System.out.println(verificatore);
		
		CalcolatoreArea ca = (r) -> r*r*3.14;
		double area = ca.calcola(2);
		System.out.println("Area cerchio: " + area);
		
		VerificatoreNumero vn = n -> n>0;
		boolean verificatorePositivo = vn.verifica(-10);
		System.out.println(verificatorePositivo);
		
		ConcatenatoreStringhe cs = (a,b) -> a+b;
		String stringa = cs.concatena("ci", "ao");
		System.out.println("Stringa: "+ stringa);
		
		VerificatorePari vpari = n -> n % 2 == 0;
		boolean numero = vpari.verifica(3);
		System.out.println(numero);
		
		 List<Integer> numeri = new ArrayList<>();
	        numeri.add(5);
	        numeri.add(3);
	        numeri.add(8);
	        numeri.add(2);
		Sommatore sum = lista -> {
			int somma1 = 0;
			for(int num:lista) {
				somma1 += num;
			}
			return somma1;
		};
		int sommatore = sum.somma(numeri);
		System.out.println("Somma: "+  sommatore);
		
		
	}

}
