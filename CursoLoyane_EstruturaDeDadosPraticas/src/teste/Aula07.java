package teste;

import estrutura_dados.lista.Vetor;

public class Aula07 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);

		// insere valores no vetor
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		// exibe vetor antes de adicionar elemento
		System.out.println(vetor);
		
		
		// adiciona elemento ao vetor na posicão 0 e elemento "A"
		vetor.adicionaQualquerPosicao(0, "A");
		
		// exibe vetor com o elemento A adicionado
		System.out.println(vetor);
		
		// adiciona elemento no vetor na posicao 3 e elemento "D"
		vetor.adicionaQualquerPosicao(3, "D");
		
		// exibe vetor com o elemento D adicionado
				System.out.println(vetor);
		
	
	}

}
