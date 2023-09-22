package arvorebinaria;

public class NoArvore<TIPO> { 
	public TIPO valor;
	public NoArvore<TIPO>esquerda;
	public NoArvore<TIPO>direita;

	public NoArvore(TIPO novovalor) {
		this.valor =novovalor;
		this.esquerda=null;
		this.direita=null;
	}
	
	
}
