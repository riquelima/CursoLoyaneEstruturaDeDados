package estrutura_dados.lista;

import java.util.Arrays;

import org.graalvm.compiler.phases.common.RemoveValueProxyPhase;

import sun.tools.tree.ThisExpression;

public class Vetor {
	private String[] elementos; // elementos do vetor
	private int tamanho; // atributo que controlará o tamanho real do vetor
	
	// criando um método vetor e passando a capacidade como parâmetro no vetor
	public Vetor(int capacidade) { 
		this.elementos = new String[capacidade];
		this.tamanho = 0;
		
		
	}
	
	/* criando um método que adiciona elemento no vetor. Por padrão, os elementos são nulos.
	public void adiciona (String elemento) {
		
		//verificando se o índice do vetor possui elementos nulos.
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
			throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
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

// método busca: retorna elementos de um vetor em determinada posição
public String busca(int posicao) {
	if(!(posicao >= 0 && posicao < tamanho)) {
		throw new IllegalArgumentException("Posição inválida");
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
		throw new IllegalArgumentException("Posição Inválida!");
	}
	for(int i=posicao; i < this.tamanho-1; i++) {
		this.elementos[i] = this.elementos[i+1];		
	}
	this.tamanho--;
	
}

// adiciona elemento a qualquer posicao do vetor
public boolean adicionaQualquerPosicao(int posicao, String elemento) {
	//verifica se essa posicao é valida
	if(!(posicao >= 0 && posicao < tamanho)) {
		throw new IllegalArgumentException("Posição inválida");
	}
	
	//mover todos os elementos para abrir espaço
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
		throw new IllegalArgumentException("Posição inválida");
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
