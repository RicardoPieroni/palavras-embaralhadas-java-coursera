package principal;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BancoDePalavrasTest {

	private BancoDePalavras bancodDePalavras;

	private List<String> lista;

	@Before
	public void setUp() {
		bancodDePalavras = new BancoDePalavras(System.getProperty("user.dir"));
		lista = Arrays.asList(new String[] {"patinete",
											"futebol",
											"música",
											"carro",
											"bicicleta",
											"mesa",
											"cadeira",
											"jogador",
											"esporte",
											"geladeira",
											"fogão",
											"aeroporto",
											"navio",
											"torneira",
											"animal",
											"cavalo",
											"vaca",
											"boi",
											"rinoceronte"});
	}

	@Test	
	public void recuperarPalavra() {
		
		String resposta = bancodDePalavras.recuperarPalavra();
		
		assertNotNull(resposta);
		assertTrue(lista.contains(resposta));
	}
}
