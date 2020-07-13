package principal.model;

public class Palavra {

	private String nome;
	
	private int tentativas;
	
	private int peso;
	
	private boolean estaCorreto;
	
	private String nomeEmbaralhado;
	
	public Palavra(String nome, int peso, String nomeEmbaralhado) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.nomeEmbaralhado = nomeEmbaralhado;
		this.tentativas = 1;
		this.estaCorreto = false;
	}

	public String getNome() {
		return nome;
	}

	

	public int getTentativas() {
		return tentativas;
	}

	public void setTentativas(int tentativas) {
		this.tentativas = tentativas;
	}

	public int getPeso() {
		return peso;
	}

	public boolean isEstaCorreto() {
		return estaCorreto;
	}

	public void setEstaCorreto(boolean estaCorreto) {
		this.estaCorreto = estaCorreto;
	}

	public String getNomeEmbaralhado() {
		return nomeEmbaralhado;
	}

	public void setNomeEmbaralhado(String nomeEmbaralhado) {
		this.nomeEmbaralhado = nomeEmbaralhado;
	}
	
}
