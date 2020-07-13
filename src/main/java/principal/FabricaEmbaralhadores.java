package principal;

import java.util.Random;

public class FabricaEmbaralhadores {

	public static Embaralhador retornaEmbaralhador() {
		int indice = new Random().nextInt(2) + 1;
		if (indice == 1) {
			return new EmbaralharDificil();
		} else {
			return new EmbaralharFacil();
		}
	}
}
