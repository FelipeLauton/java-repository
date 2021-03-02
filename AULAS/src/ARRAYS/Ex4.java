package ARRAYS;

import java.util.Random;

public class Ex4 {

	public static void main(String[] args) {

		Random num = new Random();

		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];

		final int LINHA = 4, COLUNA = 6;
		int lin = 0, col = 0;

		for (lin = 0; lin < LINHA; lin++) {
			for (col = 0; col < COLUNA; col++) {
				N1[lin][col] = num.nextInt(9) + 1;
				N2[lin][col] = num.nextInt(9) + 1;
				M1[lin][col] = N1[lin][col] + N2[lin][col];
				M2[lin][col] = N1[lin][col] - N2[lin][col];
			}
		}

		System.out.println("Dados de N1:");

		for (lin = 0; lin < LINHA; lin++) {
			for (col = 0; col < COLUNA; col++) {
				System.out.print(N1[lin][col] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Dados de N2:");

		for (lin = 0; lin < LINHA; lin++) {
			for (col = 0; col < COLUNA; col++) {
				System.out.print(N2[lin][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Dados de M1:");

		for (lin = 0; lin < LINHA; lin++) {
			for (col = 0; col < COLUNA; col++) {
				System.out.print(M1[lin][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Dados de M2:");

		for (lin = 0; lin < LINHA; lin++) {
			for (col = 0; col < COLUNA; col++) {
				System.out.print(M2[lin][col] + " ");
			}
			System.out.println();
		}

	}

}
