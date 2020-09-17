package teste;

import estrutura_dados.lista.Vetor;

public class Aula09 {

public static void main(String[] args) {
  Vetor vetor = new Vetor(5);		

		vetor.adiciona("B"); //posicao 0
		vetor.adiciona("G"); //posicao 1
		vetor.adiciona("D"); // posicao 2
		vetor.adiciona("E");
		vetor.adiciona("F");
		
		System.out.println(vetor);
		vetor.remove(1);
		
		System.out.println(vetor);
		
		// remove vetor na posicao desejada
				vetor.remove(1);
				
				// imprime vetor apos remocao
				System.out.println(vetor);

	}

}
