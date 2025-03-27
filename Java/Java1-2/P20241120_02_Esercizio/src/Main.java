import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		LinkedList<Motociclo> moto = new LinkedList<Motociclo>();
		moto.add(new Motociclo(2, "benzina", 15.0, 20.0 ));
		moto.add(new Motociclo(2, "diesel", 12.0, 18.0 ));
		moto.add(new Motociclo(2, "diesel", 14.0, 19.5 ));
		moto.add(new Motociclo(2, "benzina", 11.0, 17.0 ));
		moto.add(new Motociclo(2, "diesel", 18.0, 25.0 ));
		moto.add(new Motociclo(2, "benzina", 17.0, 24.0 ));
		moto.add(new Motociclo(2, "benzina", 10.0, 16.0 ));
		moto.add(new Motociclo(2, "diesel", 19.0, 26.0 ));
		moto.add(new Motociclo(2, "benzina", 20.0, 28.0 ));
		moto.add(new Motociclo(2, "benzina", 15.0, 20.0 ));
	
		
		Collections.sort(moto);
		for(Motociclo m:moto) {
			
			System.out.println(m);
		}
		System.out.println(".");
		
		LinkedList<Autovettura> auto = new LinkedList<Autovettura>();
		auto.add(new Autovettura(4, "benzina", 100.0, 20.0));
		auto.add(new Autovettura(4, "diesel", 100.0, 22.0));
		auto.add(new Autovettura(4, "benzina", 111.0, 25.0));
		auto.add(new Autovettura(4, "gpl", 112.0, 24.0));
		auto.add(new Autovettura(4, "benzina", 120.0, 23.0));
		auto.add(new Autovettura(4, "gpl", 109.0, 22.0));
		auto.add(new Autovettura(4, "benzina", 101.0, 21.0));
		auto.add(new Autovettura(4, "benzina", 102.0, 25.0));
		auto.add(new Autovettura(4, "diesel", 113.0, 19.0));
		auto.add(new Autovettura(4, "benzina", 104.0, 24.0));
		
		Collections.sort(auto);
		for(Autovettura a:auto) {
			
			System.out.println(a);
		}
		System.out.println(".");
		
		LinkedList<Automezzo> am = new LinkedList<Automezzo>();
		am.addAll(moto);
		am.addAll(auto);
		
		Collections.sort(am);
		for (Automezzo a:am) {
			System.out.println(a);
		}
		
		
		
		
		
		
	}

}
