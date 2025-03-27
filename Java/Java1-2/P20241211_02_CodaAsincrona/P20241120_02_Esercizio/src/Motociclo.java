
public class Motociclo extends Automezzo {
	
	private Double cilindrata;
	private Double consumo;
	
	

	public Motociclo(Integer ruote, String carburante, Double cilindrata, Double consumo) {
		super(ruote, carburante);
		this.cilindrata = cilindrata;
		this.consumo = consumo;
	}
	
	
	public Motociclo() {
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
		return "Motociclo [cilindrata=" + cilindrata + ", consumo=" + consumo + ", getMaxSpeed()=" + getMaxSpeed()
				+  ", getRuote()=" + getRuote()
				+ ", getCarburante()=" + getCarburante() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}


	@Override
	public Double getMaxSpeed() {
		
		return 200.0;
	}

	
}
