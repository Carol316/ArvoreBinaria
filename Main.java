package arvorebinaria;

public class Main {

	public static void main(String[] args) {
		try {
			ArvoreBinaria<Integer>arvoreBinaria= new ArvoreBinaria<Integer>();
			arvoreBinaria.inserir(12);
			arvoreBinaria.inserir(3);
			arvoreBinaria.inserir(10);
			arvoreBinaria.inserir(8);
			arvoreBinaria.inserir(7);
			arvoreBinaria.inserir(32);
			arvoreBinaria.inserir(13);
			arvoreBinaria.inserir(23);
		
			
			System.out.println("===Em-Ordem===");
			arvoreBinaria.inOrder(arvoreBinaria.getRaiz());
			
			
			System.out.println("===Pré-Ordem===");
			arvoreBinaria.preOrder(arvoreBinaria.getRaiz());
			
			System.out.println("===Pós-Ordem===");
			arvoreBinaria.posOrder(arvoreBinaria.getRaiz());
			ArvoreBinaria<Integer>arvore= new ArvoreBinaria<Integer>();
			arvore.inOrder();
			
		}catch(ArvoreBinariaVaziaException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		}
	}

