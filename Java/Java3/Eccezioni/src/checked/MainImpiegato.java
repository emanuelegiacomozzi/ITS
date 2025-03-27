package checked;

public class MainImpiegato {

	public static void main(String[] args) {
		Impiegato imp = new Impiegato("Mario", 1000);
		System.out.println(imp);
		
		try {
			imp.incrementaSalario(-500);
		} catch (IncrementoNegativoException e) {
			System.out.println("Hai inserito un valore negativo on nullo");
		}
		System.out.println(imp);
	}

}
