package controller;

public class Thread3 extends Thread{
	
	private int matriz[];
	
	public Thread3(int[] matriz) {
		this.matriz = matriz;
		
	}
	
	public void run() {
		soma();
	}
	
	private void soma() {
		int soma = 0;
		
		for(int i = 0; i < matriz.length; i++ ) {
			soma = matriz[i] + soma;
		}
		System.out.println("A soma da linha 1 é: "+soma);
	}
}
