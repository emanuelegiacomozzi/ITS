
public class Ghepardo extends Mammifero implements Must, Req, Comparable<Ghepardo>{

	@Override
	public String Verso() {
		
		return "Roarr";
	}
	
	private Double Speed;

	@Override
	public String toString() {
		return "\nGhepardo [Speed=" + Speed + ", toString()=" + super.toString() + "]";
	}

	public Double getSpeed() {
		return Speed;
	}

	public void setSpeed(Double speed) {
		Speed = speed;
	}

	public Ghepardo(Integer freqResp, Integer freqCardio, Double speed) {
		super(freqResp, freqCardio);
		Speed = speed;
	}

	public Ghepardo() {
		super();
	}

	@Override
	public String GetClassName() {
		
		return "Ghepardo";
	}

	@Override
	public String GetVersion() {
		return "1.0";
	}

	@Override
	public String GetSerial() {
		return "AI48";
	}

	@Override
	/*confronta oggetto corrente con quello passato nel parametro
	 */
	public int compareTo(Ghepardo o) {
		//return Speed.compareTo(o.Speed); //speed è di tipo double, che ha gia implementato il metodo compareTo()
//		if(Speed <o.Speed) {
//			return -1;
//		}else {
//			if(Speed > o.Speed) {
//				return 1;
//			}else {
//				return 0;
//			}
		Integer ret = Speed.compareTo(o.Speed);
		if (ret != 0) { // confronto la velocità, se uno è maggiore dell'altro , quindi 1 o -1 ritorna la velocità
			return ret;
		}else {
			return getFreqCardio().compareTo(o.getFreqCardio());
		}   //altrimenti se le velocità sono uguali , confronta la frequenza
		}
	}

