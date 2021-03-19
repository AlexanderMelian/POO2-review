package review;

public class neatArragement {
    
	Integer[] n;
	
	public neatArragement() {
		
	}
	
	public neatArragement(Integer[] n) {
		this.n = n;
	}
	
	public boolean isOrder(){
        int nL = this.n.length;
        for (int i = 1; i < nL-1; i++) {
            if(this.n[i]>this.n[i+1]){
                return false;
            }
        }
        return true;
    }
}
