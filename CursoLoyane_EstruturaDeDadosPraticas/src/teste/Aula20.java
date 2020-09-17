package teste;

import estrutura_dados.fila.Fila;

public class Aula20 {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<>();
		
		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);
		
		//System.out.println(fila.estaVazio()); //verifica se esta vazia
		
		System.out.println(fila.tamanho()); //mostra o tamanho da fila
		
		System.out.println(fila.toString()); // exibindo a fila
		
		
	}

}
