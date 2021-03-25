package review;

public class MatrixRealNumbers {
	Double[][] Matrix;
	public MatrixRealNumbers() {
		
	}
	
	public MatrixRealNumbers(Double[][] Matrix) {
		this.Matrix = Matrix;
	}
	
	public boolean compare() {
		int mL = Matrix[0].length;
		Double average = 0D;
		for(int i = 0; i < mL; i++ ) {
			average = average + Matrix[i][i];
		}
		average = average / mL;
		for(int i = 0; i < mL; i++ ) {
			for(int j = 0; j < mL; j++) {
				if(i != j) {
					if(average < Matrix[i][j]) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
	
}
