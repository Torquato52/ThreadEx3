package view;

import controller.Thread1;
import controller.Thread2;
import controller.Thread3;

public class Main {
	public static void main(String[] args) {

		int matriz[][] = new int[3][5];

		for (int i = 0; i < 3; i++) {

			for (int x = 0; x <5; i++) {
				matriz[i][x] = (int) (Math.random() * 100);
			}
		}
		
		Thread1 t = new Thread1(matriz[1]);
		t.start();

		Thread2 dois = new Thread2(matriz[2]);
		dois.start();

		Thread3 tres = new Thread3(matriz[3]);
		tres.start();
		
	}
}
