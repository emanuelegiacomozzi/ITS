
public class Aereo {
	private String nome;
	private Integer posti;
	public Aereo(String nome, Integer posti) {
		super();
		this.nome = nome;
		this.posti = posti;
	}
	public Aereo() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getPosti() {
		return posti;
	}
	public void setPosti(Integer posti) {
		this.posti = posti;
	}
	@Override
	public String toString() {
		return "Aereo [nome=" + nome + ", posti=" + posti + "]";
	}
	
	
}