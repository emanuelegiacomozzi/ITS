import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//Set,Map,List,Queue,Stack,Array,.....
		
		//1 set
		
		HashSet<Prova> hsp = new HashSet<Prova>();
		TreeSet<Prova> tsp = new TreeSet<Prova>();
		
		//Le mappe
		HashMap<Prova, Integer> hmp = new HashMap<Prova, Integer>();
		TreeMap<Prova, Integer> tmp = new TreeMap<Prova, Integer>();
		
		for (int i=0; i<100; i++) {
			hsp.add(new Prova(i));
			//tsp.add(new Prova(i));
		}
		
		//Per cercare un elemento in un set, mi serve l'elemento stesso, oppure
		System.out.println(hsp.contains(new Prova(10)));
		//non lo trova perché contains cerca esattamente l'oggetto che sto cercando 
		
		//quindi
		Prova p = new Prova(987);
		hsp.add(p);
		System.out.println(hsp.contains(p));
	}

}

class Prova{
	public String uno;
	public Integer due;
	public Prova(int n) {
		uno ="UNO";
		due = n;
	}
	public String toString() {
		return ""+due;
	}
}
