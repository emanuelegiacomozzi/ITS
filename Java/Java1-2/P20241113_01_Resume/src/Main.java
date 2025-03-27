import java.util.*;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		/*
		 * non ha accesso diretto, per accedere ad elemento 10 accedere a quelli prima
		 * si usa quando dobbiamo effettuare un operazione su tutti gli elementi di una
		 * lista
		 */
		li.add(7);
		li.add(5);
		li.add(9);
		li.add(2);
		li.addFirst(11);
		li.addLast(37);

		li.add(3, 99);
		li.add(li.size(), 3);

		System.out.println(li);

		Collections.max(li);
		Collections.sort(li);
		System.out.println(li);
		/*
		 * ha un metodo compareTo che confronta due elementi della lista e capisce quale
		 * è il più grande
		 */
		Collections.shuffle(li);
		System.out.println(li);

		Ghepardo g1 = new Ghepardo(15, 60, 90.0);
		Ghepardo g2 = new Ghepardo(13, 66, 80.0);
		Ghepardo g3 = new Ghepardo(16, 50, 100.0);
		Ghepardo g4 = new Ghepardo(14, 55, 85.0);

		LinkedList<Ghepardo> lg = new LinkedList<Ghepardo>();
		lg.add(g1);
		lg.add(g2);
		lg.add(g3);
		lg.add(g4);
		System.out.println(lg);
		/*
		 * stampa perché ci sta il metodo to string
		 */
		for (Ghepardo g : lg) {
			System.out.println(g);

		}
		for (var g : lg) {
			System.out.println(g);
			/*
			 * var sta ad indicare che g assume il valore che è contenuto in lg(valori di
			 * tipo Ghepardo)
			 */
		}

		Collections.sort(lg);
		System.out.println(lg);

		Collections.shuffle(lg);
		// altro metodo per implementare comparable
		lg.sort(new Comparator<Ghepardo>() {
			public int compare(Ghepardo g1, Ghepardo g2) {
				return g1.getSpeed().compareTo(g2.getSpeed());
			}
		});

		LinkedList<Elefante> el = new LinkedList<Elefante>();
		el.add(new Elefante(5, 10, 4500.0));
		el.add(new Elefante(4, 11, 4550.0));
		el.add(new Elefante(5, 8, 4900.0));
		el.add(new Elefante(4, 9, 4900.0));

		LinkedList<Mammifero> mam = new LinkedList<Mammifero>();
		mam.addAll(lg);
		mam.addAll(el);

		System.out.println(mam);

		// Procedura merge , usiamo due liste di interi già ordinate
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l1.add(3);
		l1.add(8);
		l1.add(11);
		l2.add(1);
		l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(9);
        l2.add(12);
        l2.add(15);
        
        LinkedList<Integer> lsorted = MergeLists(l1,l2);
		

	}

	private static LinkedList<Integer> MergeLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		//1: impariamo ad usare gli iteratori!!! Iteratori sono una classe di java che permette di scandire una collezione
		//ha due metodi: hasNext
		//Usando un iteratore, stampare una lista
		//Iterator<Integer> it1 = l1.iterator();
		//while(it1.hasNext()) {
//			Integer num = it1.next();
//			System.out.println(num);
//		}
//		
//		return null;
		//1: creo lista risultato
		LinkedList<Integer> lret = new LinkedList<Integer>();
		
		if(l1==null) {
			return l2;
		}
		if(l2==null)
		if(l1.size()==0) {
			lret.addAll(l2);
			return lret;
		}
		if(l2.size()==0) {
			lret.addAll(l1);
			return lret;
		}
		
		//2faccio merge delle 2 liste ordinate
		Iterator <Integer>it1 = l1.iterator();
		Iterator <Integer>it2 = l2.iterator();
		
		Integer n1 = it1.next();
		Integer n2 = it2.next();
		while(true) {
			if(n1<=n2) {
				lret.add(n1);
				if (it1.hasNext()) {
					n1 = it1.next();
				}else {
					while (it2.hasNext()) {
					lret.add(it2.next());
				}
					return lret;
			}
		}else {
			lret.add(n2);
			if (it1.hasNext()) {
				n2 = it2.next();
			}else {
				while (it1.hasNext()) {
				lret.add(it2.next());
			}
			
		}
	}

}
	}
}
