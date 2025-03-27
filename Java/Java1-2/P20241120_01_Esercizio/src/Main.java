import java.util.Arrays;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		CoppiaInt<Integer, Double> ci1 = new CoppiaInt<Integer, Double>(1, 2.0);
		CoppiaInt<Integer, Double> ci2 = new CoppiaInt<Integer, Double>(111, 112.0);
		
		//implmentare metodo SwapCoppia che scambia tra loro i contenuti di
		//due coppie di dati (es: in ci2 va 1, 2.0 e in ci1 va 111, 112.0
		
		System.out.println(ci1 + ", " + ci2);

		//SwapCoppia(ci1, ci2);
			
		CoppiaInt<String, String> css1 = new CoppiaInt<String, String>("uno", "due");
		CoppiaInt<String, String> css2 = new CoppiaInt<String, String>("uno", "due");
		
		int a = 10;
		int b = 20;
		//SwapCoppia(a,b);
		//Scrivere metodo swap che scambia valori di a e di b
		//in uscita a deve valere 20 e b deve valere 10
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.addAll(Arrays.asList(new Integer[] {3,4,6,2,3,7,8}));
		System.out.println(li);
		Swap(li, 3,5);
		System.out.println(li);
	}

	private static void Swap(LinkedList<Integer> li, int i, int j) {
		
		
	}

//	//private static void SwapCoppia(int a, int b) {
//		
//		 a = b;
//		 b = a-10;
//		 
//		 System.out.println();
//		
//	}

//	private static void SwapCoppia(CoppiaInt<Integer, Double> ci1, CoppiaInt<Integer, Double> ci2) {
//		
//		CoppiaInt<Integer , Double> appo = new CoppiaInt<Integer, Double>(ci1.getPrimo(), ci1.getSecondo());
//		
//		ci1.setPrimo(ci2.getPrimo());
//		ci1.setSecondo(ci2.getSecondo());
//		
//		ci2.setPrimo(appo.getPrimo());
//		ci2.setSecondo(appo.getSecondo());
//		
//	}
	
//	private static <T1, T2> void SwapCoppia(CoppiaInt<T1, T2> ci1, CoppiaInt<T1, T2> ci2) {
//		
//		CoppiaInt<T1, T2> appo = new CoppiaInt<T1, T2>(ci1.getPrimo(), ci1.getSecondo());
//		
//		ci1.setPrimo(ci2.getPrimo());
//		ci1.setSecondo(ci2.getSecondo());
//		
//		ci2.setPrimo(appo.getPrimo());
//		ci2.setSecondo(appo.getSecondo());
//
//	}
	
	
}
