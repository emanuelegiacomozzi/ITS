import java.time.LocalTime;

public class Volo {
	private String partenza;
	private String arrivo;
	private LocalTime orario_arrivo;
	private LocalTime orario_partenza;
	private Aereo aereo;
	private stato statoVolo;
	
	public enum stato {
		IMBARCATO, 
		DECOLLATO, 
		ATTERRATO,
		PRENOTATO
	}
	
	public Volo(String partenza, String arrivo, LocalTime orario_arrivo, LocalTime orario_partenza, Aereo aereo, stato statoVolo) {
		super();
		this.partenza = partenza;
		this.arrivo = arrivo;
		this.orario_arrivo = orario_arrivo;
		this.orario_partenza = orario_partenza;
		this.aereo = aereo;
		this.statoVolo = statoVolo;
	}

	public Volo() {
		super();
	}

	public String getPartenza() {
		return partenza;
	}

	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}

	public String getArrivo() {
		return arrivo;
	}

	public void setArrivo(String arrivo) {
		this.arrivo = arrivo;
	}

	public LocalTime getOrario_arrivo() {
		return orario_arrivo;
	}

	public void setOrario_arrivo(LocalTime orario_arrivo) {
		this.orario_arrivo = orario_arrivo;
	}

	public LocalTime getOrario_partenza() {
		return orario_partenza;
	}

	public void setOrario_partenza(LocalTime orario_partenza) {
		this.orario_partenza = orario_partenza;
	}

	public Aereo getAereo() {
		return aereo;
	}

	public void setAereo(Aereo aereo) {
		this.aereo = aereo;
	}
	
	public stato getStato() {
		return statoVolo;
	}
	
	public void setStato(stato statoVolo) {
		this.statoVolo = statoVolo;
	}
	
	
	


	@Override
	public String toString() {
		return "Volo [partenza=" + partenza + ", arrivo=" + arrivo + ", orario_arrivo=" + orario_arrivo
				+ ", orario_partenza=" + orario_partenza + ", aereo=" + aereo + ", stato=" + statoVolo +"]";
	}
	
	
	
	
}