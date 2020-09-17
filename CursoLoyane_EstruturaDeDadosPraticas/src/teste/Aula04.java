package teste;

import estrutura_dados.lista.Vetor;

public class Aula04 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);

		// definindo o elemento do vetor

		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		//imprimindo o tamanho do vetor
		System.out.println(vetor.tamanho());
		
		// imprimindo a quantidade de elementos preenchidos no vetor
		System.out.println(vetor.toString());

	}

}
