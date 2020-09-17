package estrutura_dados.lista;

import java.util.Arrays;

import org.graalvm.compiler.phases.common.RemoveValueProxyPhase;

import sun.tools.tree.ThisExpression;

public class Vetor {
	private String[] elementos; // elementos do vetor
	private int tamanho; // atributo que controlar� o tamanho real do vetor
	
	// criando um m�todo vetor e passando a capacidade como par�metro no vetor
	public Vetor(int capacidade) { 
		this.elementos = new String[capacidade];
		this.tamanho = 0;
		
		
	}
	
	/* criando um m�todo que adiciona elemento no vetor. Por padr�o, os elementos s�o nulos.
	public void adiciona (String elemento) {
		
		//verificando se o �ndice do vetor possui elementos nulos.
		for(int i=0; i<this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i]= elemento; 
				break;				
			}			
		}		
	}*/
	
	/* public void adiciona(String elemento) throws Exception {
		
		// Verifica se o tamanho dos elementos = capacidade do vetor
		if(this.tamanho < this.elementos.length) { 
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;			
		}else {
			throw new Exception("Vetor j� est� cheio, n�o � poss�vel adicionar mais elementos");
		}
		
		
		
	} */
	
// adiciona elementos ao vetor
public boolean adiciona(String elemento){
		
		// Verifica se a quantidade dos elementos = capacidade do vetor
		if(this.tamanho < this.elementos.length) { 
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;		
	}

// m�todo busca: retorna elementos de um vetor em determinada posi��o
public String busca(int posicao) {
	if(!(posicao >= 0 && posicao < tamanho)) {
		throw new IllegalArgumentException("Posi��o inv�lida");
	}	
	return this.elementos[posicao];
}


// retorna o tamanho do vetor
public int tamanho() {
	return this.tamanho;
}


// remove um elemento do vetor
public void remove(int posicao) {
	if (!(posicao >= 0 && posicao < tamanho)) {
		throw new IllegalArgumentException("Posi��o Inv�lida!");
	}
	for(int i=posicao; i < this.tamanho-1; i++) {
		this.elementos[i] = this.elementos[i+1];		
	}
	this.tamanho--;
	
}

// adiciona elemento a qualquer posicao do vetor
public boolean adicionaQualquerPosicao(int posicao, String elemento) {
	//verifica se essa posicao � valida
	if(!(posicao >= 0 && posicao < tamanho)) {
		throw new IllegalArgumentException("Posi��o inv�lida");
	}
	
	//mover todos os elementos para abrir espa�o
	for(int i=this.tamanho-1; i >= posicao; i--) {
		this.elementos[i+1]= this.elementos[i]; 		
	}
	//inserir elemento na posicao desejada
	this.elementos[posicao]= elemento;
	this.tamanho++;
	
	return false;
}


//remove elemento de qualquer posicao do vetor
public void removeQualquerPosicao(int posicao) {
	if(!(posicao >= 0 && posicao < tamanho)) {
		throw new IllegalArgumentException("Posi��o inv�lida");
	}	
	for(int i=posicao; i < this.tamanho-1; i++) {
		this.elementos[i] = this.elementos[i+1];		
	}
	this.tamanho--;
}

//retorna os elementos de um vetor utilizando a classe Arrays
@Override 
public String toString() {
	StringBuilder s = new StringBuilder();
	s.append("[");
	
	for(int i=0; i<this.tamanho-1; i++) {
		s.append(this.elementos[i]);
		s.append(", ");
	}
	if (this.tamanho>0) {
		s.append(this.elementos[this.tamanho-1]);
		
	}
	s.append("]");
	
	
	return s.toString();
}


	
	
}
