package review;

public class CombineTwoArrays {
	Integer[] a1;
	Integer[] a2;
	
	public CombineTwoArrays() {
		
	}
	
	public CombineTwoArrays(Integer[] a1, Integer[] a2) {
		this.a1 = a1;
		this.a2 = a2;
	}
	
	public int[] combine() {
		int i = this.a1.length + this.a2.length, a1L = this.a1.length, a2L =this.a2.length, j=0,l=0;
		int total[] = new int[i];
		for(;(j+l)<i;) {
			if(j<a1L && l<a2L) {
				if(this.a1[j]<=this.a2[l]) {
					total[j+l] = this.a1[j];
					j++;
				}else {
					total[j+l] = this.a2[l];
					l++;
				}
			}else if(j<a1L) {
				total[j+l] = this.a1[j];
				j++;
			}else {
				total[j+l] = this.a2[l];
				l++;
			}
			
		}
		for (int x = 0; x < i; x++) {
            System.out.print(total[x] + " ");
        }
		return total;
	}
	
	
}
/*
a1 = [-5, 0, 0, 1, 5]
a2 = [-10, 0, 7]
resultado = [-10, -5, 0, 0, 0, 1, 5, 7]
*/