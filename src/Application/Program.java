package Application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//solution in https://github.com/acenelio/matrix1-java
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // is in the area stack memory 
		//n will be the number of rows and columns of the matrix
		
		// To create the matrix, we need to define the data type, in our example  "int" (int[][])
		// [][] two-dimensional and [][][]three-dimensional...and so on
		int[][] mat = new int[n][n]; // is in the area heap memory 
		
		// Double "for", for create matrix (i = rows , j = Columms)
		// mat.length = number of rows 
		// mat[i].length = number of columms in row[i] 
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		//simple "for", to diagonal reading of the matrix
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		// Double "for", to find negative number (scanning the matrix)
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);
		
		
		sc.close();

	}

}
