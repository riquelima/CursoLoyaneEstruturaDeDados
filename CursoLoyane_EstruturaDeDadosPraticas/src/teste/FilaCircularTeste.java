package teste;

import estrutura_dados.fila.FilaCircular;

public class FilaCircularTeste {

	public static void main(String[] args) {
	
		FilaCircular fila = new FilaCircular();
		
		fila.inserir(1);
		fila.inserir(2);
		fila.inserir(3);
		fila.inserir(4);
		
		// exibindo fila circular
		System.out.println(fila.toString());
		
		//enquanto a fila não estiver vazia, retire elementos
		while(!fila.isEmpty()) {
			int x = fila.retirar();
			System.out.println("Retirei o número" + x);
		}
		
	}

}
