package principal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class EmbaralhadorDificilTest {
	
	private EmbaralharDificil embaralharDificil;
	
	private EmbaralharFacil embaralharFacil;
	
	@Before
	public void carregar() {
		embaralharDificil = new EmbaralharDificil();
		embaralharFacil = new EmbaralharFacil();
	}

	@Test
	public void testarEmbaralhar() {
		String palavra1 = "teste";
		
		String resposta = embaralharDificil.embaralhar(palavra1);
		assertNotEquals(palavra1, resposta);
		assertEquals("ettse", resposta);
		
		resposta = embaralharFacil.embaralhar(palavra1);
		assertNotEquals(palavra1, resposta);
		assertEquals("etset", resposta);
	}
}
