package review;

public class MatrixSum {
	Integer[][] m1;
	Integer[][] m2;
	
	
	public MatrixSum(){
		
	}
	public MatrixSum(Integer[][] m1, Integer[][] m2){
		this.m1 = m1;
		this.m2 = m2;
	}
	
	public int[][] Sum() {
		int mL = this.m1.length;
		int[][] sum = new int[mL][mL];
		
		for(int i = 0;i<mL;i++) {
			for(int j = 0;j<mL;j++) {
				sum[i][j] = this.m1[i][j] + this.m2[i][j];
			}
		}
		
		
		for(int i = 0;i<mL;i++) {
			for(int j = 0;j<mL;j++) {
				System.out.print(sum[i][j]+" ");
			}
		}
		return sum;
	}
	
}
