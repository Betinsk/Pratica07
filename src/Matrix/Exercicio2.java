package Matrix;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] mat = new int [5][5];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	
		
		System.out.println("Elementos nas posições de linhas pares e colunas impares:");
		for (int i =0;i<5;i+=2)
			for (int j =1;j<5;j+= 2) {
				System.out.printf("%5d\n", mat[i][j]);

			}
		System.out.println("Matriz transposta:");
		for (int i =0;i<5;i++)
			for (int j =0;j<5;j++) {
				System.out.printf("%5d\n", mat[j][i]);

			}
		System.out.println("trocar elementos da diagonal principal:");
		for (int i =0;i<5;i++) {
			int pos = (mat[i].length - 1) - i;
			int temp = mat[i][pos];
			mat[i][pos] = mat[i][i];
			mat[i][i] = temp;
			System.out.printf("%5d\n", temp);

		}
		
		
		sc.close();
		
	}

}
