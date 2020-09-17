package teste;

import estrutura_dados.lista.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);

		

		vetor.adiciona("elemento 1"); //posicao 0
		vetor.adiciona("elemento 2"); //posicao 1
		vetor.adiciona("elemento 3"); // posicao 2
		
		// Retorna o elemento da posição x
		System.out.println(vetor.busca(2));
		System.out.println(vetor.busca(15));
	

	}

}
