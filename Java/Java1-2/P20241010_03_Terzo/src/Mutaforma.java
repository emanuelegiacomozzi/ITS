
public class Mutaforma {

	public static void main(String[] args) {
		int a = Somma(10, 20);
		System.out.println(a);
		
		double b = Somma(10.1, 20.0);
		String s = Somma("buona", "sera");

	}
	
	private static String Somma(String string, String string2) {
		// TODO Auto-generated method stub
		return string+string2;
	}

	private static double Somma(double d, double e) {
		// TODO Auto-generated method stub
		return d+e;
	}

	private static int Somma(int i, int j) {
		return i+j;
	}

}
