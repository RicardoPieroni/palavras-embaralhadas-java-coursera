package principal;

import java.util.ArrayList;
import java.util.List;

import principal.model.Palavra;

public abstract class MecanicaDoJogo {
	
	public static final String diretorio = System.getProperty("user.dir");

	public List<Palavra> listaPalavras = new ArrayList<>();
	
	public Palavra palavraAtual;
	
	protected int numeroMaximoTentativas;
	
	private static final int PESO_NOTA = 1;
	
	BancoDePalavras bancoDePalavras;
	
	public MecanicaDoJogo(int numeroMaximoTentativas) {
		this.numeroMaximoTentativas = numeroMaximoTentativas;
		bancoDePalavras = new BancoDePalavras(diretorio);
	}

	public String jogar() {
		Embaralhador embaralhador = FabricaEmbaralhadores.retornaEmbaralhador();
		String palavra = buscarPalavra();
		
		String palavraEmbaralhada = embaralhador.embaralhar(palavra);
		
		if (palavraAtual == null  ) {
			
			palavraAtual = new Palavra(palavra, PESO_NOTA, palavraEmbaralhada);
			listaPalavras.add(palavraAtual);
		
		} else if (palavraAtual.isEstaCorreto() || palavraAtual.getTentativas() > numeroMaximoTentativas) {
			palavraAtual = new Palavra(palavra, PESO_NOTA, palavraEmbaralhada);
			listaPalavras.add(palavraAtual);
		}
			
		return palavraAtual.getNomeEmbaralhado();
	}

	public boolean tratarpalavra(String resposta) {
		
		if (palavraAtual.getNome().equals(resposta) && palavraAtual.getTentativas() <= numeroMaximoTentativas) {
			
			palavraAtual.setEstaCorreto(true);
			
			return true;
		}
		palavraAtual.setTentativas(palavraAtual.getTentativas() + 1);
		return false;
	}

	public int nota() {
		
		int a = listaPalavras
				  .stream()
				  .filter(item -> item.isEstaCorreto())
				  .reduce(0, (subtotal, palavra) -> subtotal + palavra.getPeso(), Integer::sum);
		
		return a;
	}
	
	
	private String buscarPalavra() {
		
		String palavra = bancoDePalavras.recuperarPalavra();
		
		if (listaPalavras.size() == bancoDePalavras.totalPalavras()) {
			return "";
		}

		if (listaPalavras.stream().anyMatch(item -> item.getNome().equals(palavra))) {
			return buscarPalavra();
		} 

		 return palavra;
		
	}
}
