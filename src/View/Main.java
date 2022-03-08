package View;
import Controller.threadMatrix;

public class Main {

	public static void main(String[] args) {
		int[][] matrix = new int[3][5];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				
				matrix[i][j] = (int) (Math.random() * 100);
				
			}
		}
		
		for (int i = 0; i<3; i++) {
			threadMatrix matrixm = new threadMatrix(i+1, matrix[i]);
			matrixm.start();
			
		}
	}
}