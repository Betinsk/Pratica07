package Matrix;

import java.util.Scanner;

public class Exercicio1 {

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
		
		sc.close();
		
		
		

	}

}
