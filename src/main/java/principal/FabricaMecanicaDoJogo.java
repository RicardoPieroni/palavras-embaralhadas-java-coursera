package principal;

public class FabricaMecanicaDoJogo {

	private static final String MODO_PROFISSIONAL = "PRO";

	private static final String MODO_AMADOR = "AMADOR";

	private static final int NUMERO_TENTATIVAS_MODO_PRO = 1;

	private static final int NUMERO_TENTATIVAS_MODO_AMADOR = 2;

	public static MecanicaDoJogo gerar(String modo) {
			
			switch (modo) {
			case MODO_AMADOR:
				return new MecanicaJogoAmador(NUMERO_TENTATIVAS_MODO_AMADOR);

			case MODO_PROFISSIONAL:
				return new MecanicaJogoProfissional(NUMERO_TENTATIVAS_MODO_PRO);
			}
			
			return null;
	}

}
