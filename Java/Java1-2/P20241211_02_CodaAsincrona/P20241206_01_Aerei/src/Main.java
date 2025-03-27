import java.time.LocalTime;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		Agenzia agenzia = new Agenzia();
		
		Aeroporti aeroporto = new Aeroporti();
		
		Aereo aereo1 = new Aereo("Boeing 737", 160);
		Aereo aereo2 = new Aereo("Airbus A320", 160);
		
		Volo volo1 = new Volo("Fiumicino","Madrid", LocalTime.of(14, 30), LocalTime.of(16, 30), aereo1, Volo.stato.PRENOTATO);
		Volo volo2 = new Volo("Fiumicino","Londra", LocalTime.of(18, 00), LocalTime.of(21, 00), aereo2, Volo.stato.IMBARCATO);
		
		System.out.println(aereo1);
		System.out.println(aereo2);
		System.out.println(volo1);
		System.out.println(volo2);
		
		LinkedList<Aereo> a1 = new LinkedList<Aereo>();
		LinkedList<Volo> v1 = new LinkedList<Volo>();
		LinkedList<Aereo> a2 = new LinkedList<Aereo>();
		LinkedList<Volo> v2 = new LinkedList<Volo>();
		
		CompagniaAerea c1 = new CompagniaAerea(v1, a1);
		CompagniaAerea c2 = new CompagniaAerea(v2, a2);
		
		c1.AddAereo(aereo1);
		c2.AddAereo(aereo2);
		
		c1.getVoli().add(volo1);
		c2.getVoli().add(volo2);
		
		aeroporto.gestisciVolo(volo1);
		aeroporto.gestisciVolo(volo2);
		
		agenzia.prenotazione(volo2);
		agenzia.stampaPrenotazioni();
		agenzia.prenotazione(volo1);
		agenzia.stampaPrenotazioni();
		agenzia.cancellazione(volo2);
	}

}