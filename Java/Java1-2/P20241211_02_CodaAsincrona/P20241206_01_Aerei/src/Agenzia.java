import java.util.LinkedList;


public class Agenzia {

	private LinkedList<Volo> voli_prenotati = new LinkedList<>();

	public Agenzia(LinkedList<Volo> voli_prenotati) {
		super();
		this.voli_prenotati = voli_prenotati;
	}
	
	
	
	public Agenzia() {
		super();
	}



	public void prenotazione(Volo volo) {
		if(volo.getStato()==Volo.stato.PRENOTATO) {
			System.out.println("Impossibile effettuare la prenotazione: il volo "+ volo.getAereo().getNome()+ "è già prenotato");
		}
		else {
			volo.setStato(Volo.stato.PRENOTATO);
			voli_prenotati.add(volo);
			System.out.println("Prenotazione effettuata!");
		}
	}
	
	public void cancellazione(Volo volo) {
		if(volo.getStato()==Volo.stato.PRENOTATO) {
			voli_prenotati.remove(volo);
			System.out.println("Prenotazione cancellata!");
		}
		else {
			System.out.println("Il volo non è stato prenotato!");
		}
	}
	
	public void stampaPrenotazioni() {
		for(Volo v: voli_prenotati) {
			System.out.println(v);
		}
	}
}

