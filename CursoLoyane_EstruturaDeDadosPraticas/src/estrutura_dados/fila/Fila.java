package estrutura_dados.fila;

import estrutura_dados.base.EstruturaEstatica;

// Criação de Superclasse chamando a Estrutura Estatica
public class Fila<T> extends EstruturaEstatica<T>{
	
	public Fila() {
		super();
	}
	
	public Fila (int capacidade) {
		super(capacidade);
	}
	
	// adiciona elemento a fileira
	public void enfileira(T elemento) {
				
		this.adicionaCapacidade(elemento);
	}	

}
