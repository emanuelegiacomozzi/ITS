
public class Autovettura extends Automezzo {
	private Double cilindrata;
	private Double consumo;
	
	public Autovettura(Integer ruote, String carburante, Double cilindrata, Double consumo) {
		super(ruote, carburante);
		this.cilindrata = cilindrata;
		this.consumo = consumo;
	}

	public Autovettura() {
		super();
	}

	public Double getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(Double cilindrata) {
		this.cilindrata = cilindrata;
	}

	
	public Double getConsumo() {
		
		return consumo;
	}

	@Override
	public String toString() {
		return "Autovettura [cilindrata=" + cilindrata + ", consumo=" + consumo + ", getMaxSpeed()=" + getMaxSpeed()
				+ ", getRuote()=" + getRuote() + ", getCarburante()=" + getCarburante() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	public Double getMaxSpeed() {
		return 150.0;
	}
	
	

}
