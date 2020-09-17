package estrutura_dados.lista;

public class ListaEncadeada {

	private static class No {
		public No prox; // pr�ximo n� na lista
		public int valor; // elemento (valor) armazenado na lista

		public No(int val) { // construtor do n� da lista
			valor = val;
			prox = null;
		}
	}

	private No inicio; // representa a cabe�a (in�cio) da lista

	// construtor da lista
	public ListaEncadeada() {
		inicio = null;
	}

	// verifica se a lista est� vazia
	public boolean isEmpty() {
		return inicio == null;
	}

	// busca elemento na lista
	public boolean search(int elem) {
		for (No nodo = inicio; nodo != null; nodo = nodo.prox)
			if (elem == nodo.valor)
				return true; // econtrou o elemento
		return false; // n�o encontrou o elemento

	}

	// insere elemento no inicio da lista
	public void insereInicio(int elem) {
		No novoNo = new No(elem);
		novoNo.prox = inicio; // novoNo -> inicio antigo
		inicio = novoNo; // inicio -> novoNo
	}

	public void removeInicio() { // elimina o primiro item da lista
		inicio = inicio.prox; // elimina o elemento e reposiciona o in�cio
	}

	public String exibeLista() {
		if (isEmpty())
			return "Lista vazia\n"; // teste de lista vazia
		String str = "Lista Encadeada: ";
		for (No nodo = inicio; nodo != null; nodo = nodo.prox)
			str += " " + nodo.valor;
		return str + "\n";
	}

}
