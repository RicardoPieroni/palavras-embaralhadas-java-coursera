package principal;

public class EmbaralharDificil implements Embaralhador {

	public String embaralhar(String palavra) {
		char[] vetor = palavra.toCharArray();
		char aux;
		for (int i = 0; i < vetor.length; i++) {
			if (i != vetor.length -1 && i % 2 == 0) {
				aux = vetor[i];
				vetor[i] = vetor[i + 1];
				vetor[i + 1] = aux;
			}
		}
		
		return String.valueOf(vetor);
	}

	public int dificuldade() {
		return 10;
	}

}
