package review;

public class SumOfMultiples {
    
    Integer n;

    public SumOfMultiples(){

    }
    
    public SumOfMultiples(int n){
        this.n = n;
    }

    public int sumaMultiplos(){
        int suma = 0;
        for (int i = 0; i < this.n; i++) {
            if(i%3 == 0){
                suma += i; 
            }else if(i%5 ==0){
                suma += i;
            }
        }
        return suma;
}
}