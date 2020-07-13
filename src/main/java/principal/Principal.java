package principal;

import java.util.Scanner;

public class Principal {
	
	

	public static final void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("===============================");
		System.out.println("Bem vindo ao jogo Embaralhador! O jogo possui 20 palavras, tente decifrá-las.");
		System.out.println("===============================");
		
		System.out.println("Escolha o modo que deseja jogar:");
		System.out.println(" 1 - para o modo Profissional");
		System.out.println(" 2 - para o modo Amador");
		System.out.println("===============================");
		
		int modo = ler.nextInt();
		
		if (modo ==1) {
			jogarModoPro();
		} else if (modo == 2) {
			jogarModoAmador();
		} 
		
		ler.close();
	}
	
	private static void jogar(MecanicaDoJogo mecanica, Scanner ler) {
		String palavra = mecanica.jogar();
		if (palavra.isEmpty()) {
			System.out.println("O jogo acabou! Sua pontuação é: "+ mecanica.nota());
			ler.close();
			System.exit(0);
		}
		System.out.println("Tente decifrar a palavra: "+ palavra);
		String resposta = ler.nextLine();
		if (mecanica.tratarpalavra(resposta)) {
			System.out.println("Você acertou! Sua pontuação: "+mecanica.nota());
			jogar(mecanica, ler);
		} else {
			jogar(mecanica, ler);
		}
	}
	
	private static void jogarModoAmador() {
		Scanner ler = new Scanner(System.in);
		MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.gerar("AMADOR");
		System.out.println("Vamos lá, sua pontuação será apresentanda a cada tentativa. Neste modo você pode tentar duas vezes!");
		
		jogar(mecanica, ler);
		
		
	}

	public static  void jogarModoPro() {
		Scanner ler = new Scanner(System.in);
		MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.gerar("PRO");
		System.out.println("Vamos lá, sua pontuação será apresentanda a cada tentativa.  Neste modo você poderá tentar somente uma vez!");
		
		jogar(mecanica, ler);
	}
	
}
