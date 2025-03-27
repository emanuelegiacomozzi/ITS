
public class Esercizio {

	public static void main(String[] args) {
		
		Computer pc1 = new Computer(4500.,4.5,35.,1.5,25.,"archer",2023);
		Computer pc2 = new Computer(4500.,4.5,35.,1.5,25.,"archer",2023);
		
		System.out.println(pc2);
		System.out.println(Computer.GetContatore());
		
		pc1.equals(pc2);
		
		System.out.println("Ciao"=="Ciao");
		
		
	}

}
