
public abstract class Automezzo implements Comparable<Automezzo>{
	private Integer ruote;
	private String carburante;
	public abstract Double getMaxSpeed();
	public abstract Double getConsumo();
	
	public Automezzo(Integer ruote, String carburante) {
		super();
		this.ruote = ruote;
		this.carburante = carburante;
	}

	public Automezzo() {
		super();
	}

	public Integer getRuote() {
		return ruote;
	}

	public void setRuote(Integer ruote) {
		this.ruote = ruote;
	}

	public String getCarburante() {
		return carburante;
	}

	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}
	
	public int compareTo(Automezzo o) {
		Integer ret = getMaxSpeed().compareTo(o.getMaxSpeed());
		if (ret != 0) { // confronto la velocità, se uno è maggiore dell'altro , quindi 1 o -1 ritorna la velocità
			return ret;
     	}else {
			return getConsumo().compareTo(o.getConsumo());
	}
	}
	

	@Override
	public String toString() {
		return "Automezzo [ruote=" + ruote + ", carburante=" + carburante + "]";
	}
	
	
	

}
