package review;

public class PrimeNumbers {
	Integer number;
    public PrimeNumbers(){
    }
    public PrimeNumbers(int n){
        this.number = n;
    }
    public boolean prime(){
        if(this.number == 1) return false;
        if(this.number == 2 || number == 3 || number == 5){
            return true;
        }else{
            if(number%2 == 0 || number % 3 == 0 || number % 5 == 0){
                return false;
            }else{
                return true;
            }
        }
    }
}
