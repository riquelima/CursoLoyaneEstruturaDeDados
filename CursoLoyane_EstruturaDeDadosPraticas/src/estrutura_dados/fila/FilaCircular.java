package estrutura_dados.fila;

import java.util.Arrays;

public class FilaCircular {
	
	private int[] valores;
	private int primeiro;
	private int ultimo;
	private int total;

	public FilaCircular() {
		valores = new int[10];
		primeiro=0;
		ultimo=0;
		total=0;		
	}
	
	public void inserir(int elemento) {
		if(isFull()) {
			System.out.println("Fila Cheia!");
		}
		valores[ultimo] = elemento;
		ultimo = (ultimo + 1) % valores.length;
		total++;
	}
	
	public int retirar() {
		if(isEmpty()) {
			System.out.println("Fila vazia!");
		}
		int elemento = valores[primeiro];
		primeiro = (primeiro + 1)% valores.length;
		total--;
		return elemento;
	}
	
	public boolean isEmpty() {
		return total == 0;
		
	}
	
	public boolean isFull() {
		return total == valores.length;		
	}

	@Override
	public String toString() {
		return "FilaCircular [valores=" + Arrays.toString(valores) + ", primeiro=" + primeiro + ", ultimo=" + ultimo
				+ ", total=" + total + ", retirar()=" + retirar() + ", isEmpty()=" + isEmpty() + ", isFull()="
				+ isFull() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}


