package arvorebinaria;

public class ArvoreBinaria<TIPO extends Comparable<TIPO>>{
	 NoArvore<TIPO> raiz; 

	public NoArvore<TIPO> getRaiz() {
		return raiz;
	}
	public void setRaiz(NoArvore<TIPO> raiz) {
		this.raiz = raiz;
	}
	public ArvoreBinaria() {
		this.raiz=null;
	}
	public void inserir(TIPO valor) {
		inserir(valor,this.raiz);
	}

	private void inserir(TIPO valor,NoArvore<TIPO>atual) {
		if(raiz == null) {
			raiz = new NoArvore<TIPO>(valor);
		}
		else if (atual.valor.compareTo(valor)>0) {
			if(atual.esquerda==null) {
				atual.esquerda = new NoArvore<TIPO>(valor);
			}else {
				inserir(valor,atual.esquerda);
			}
		}else if (atual.valor.compareTo(valor)<0 || atual.valor.compareTo(valor)==0) {
			if(atual.direita == null) {
				atual.direita = new NoArvore<TIPO>(valor);
			}else {
				inserir(valor,atual.direita);
			}
		}
	
		
	}
	public void inOrder() throws ArvoreBinariaVaziaException{
		if (raiz == null) {
			throw new ArvoreBinariaVaziaException("A árvore está vazia!");
		}
		inOrder(raiz);
	}
	
	

	public void inOrder(NoArvore<TIPO>atual) {
		if (atual != null) {
			inOrder(atual.esquerda);
			System.out.println(atual.valor);
			inOrder(atual.direita);
		}
	}
	public void preOrder(NoArvore<TIPO>atual) {
		if (atual != null) {
			System.out.println(atual.valor);
			preOrder(atual.esquerda);
			preOrder(atual.direita);
		}
	}
	public void posOrder(NoArvore<TIPO>atual) {
		if (atual != null) {
			posOrder(atual.esquerda);
			posOrder(atual.direita);
			System.out.println(atual.valor);
		}
	}


}
