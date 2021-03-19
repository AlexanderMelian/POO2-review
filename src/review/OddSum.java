package review;

public class OddSum {
	Integer[] n;
	public OddSum() {
		
	}
	
	public OddSum(Integer[] n) {
		this.n = n;
	}
	
	
    public int amount(){
        int nL = this.n.length, amountfinal = 0;
        for (int i = 0; i < nL; i+=2) {
            amountfinal += this.n[i];
        }
        return amountfinal;
    }
}
