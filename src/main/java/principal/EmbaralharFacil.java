package principal;

public class EmbaralharFacil implements Embaralhador{

	public String embaralhar(String palavra) {
		
		 StringBuilder stringBuilder = new StringBuilder(); 
		
		 stringBuilder.append(palavra);
		 
		return stringBuilder.reverse().toString();
	}

	public int dificuldade() {
		// TODO Auto-generated method stub
		return 3;
	}

}
