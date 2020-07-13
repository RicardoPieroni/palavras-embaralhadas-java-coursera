package principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {

	private String diretorioPalavras;
	
	private static final String NOME_ARQUIVO = "lista-palavras.txt";
	
	private static final List<String> listaPalavras = new ArrayList<String>();

	public BancoDePalavras(String diretorioPalavras) {
		this.diretorioPalavras = diretorioPalavras;
		carregarPalavras();
	}

	private void carregarPalavras() {
		File arquivo = new File(diretorioPalavras +"\\"+ NOME_ARQUIVO);
		
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(arquivo));
			String linha;

			while( (linha = entrada.readLine() ) != null) {
			    listaPalavras.add(linha);
			}
			entrada.close();
		} catch (Exception e) {
			System.out.println("Um erro aconteceu ao abrir o arquivo "+ diretorioPalavras + NOME_ARQUIVO);
		}
	}
	
	public String recuperarPalavra() {
		try {
			int indice = new Random().nextInt(listaPalavras.size()) + 0;
			
			return listaPalavras.get(indice);
		} catch (Exception e) {
			return "";
		}
		
	}
	
	public int totalPalavras() {
		return listaPalavras.size();
	}
	
	
}
