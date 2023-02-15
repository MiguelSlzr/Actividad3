package Actividad4;

public class Matriz {
	//int[][] arr1 = new int [n][m]
	//int[][] arr2 = new int [m][o]
	
	public int[][] multiplicarMatrices(int[][] arr1, int[][] arr2) {
		
		
		int[][] arr3 = new int [n][o];
		
		if (columna de arr1 == fila de arr2) {
			
			arr3[0][0] = arr1[0][0]*arr2[0][0] + arr1[1][0]*arr2[0][1] + arr1[2][0]*arr2[0][2];
			
			for(int i = 0; i <= n; i++) {
				for(int j = 0; j <= i; i++) {
					arr3[i][j] += arr1[i][j]*arr2[j][i];
				}
			}
		}
		
		else {
			System.out.println("No se puede realizar la multiplicación");
		}
		
		
		return (arr3);
	}
}
