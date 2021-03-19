package review;
import java.lang.Math;

public class Main {

    public static void main(String[] args){
    	System.out.println(new PrimeNumbers(5).prime());
        System.out.println(new SumOfMultiples(16).sumaMultiplos());
    	Integer[] neat = {1,2,3,4,5,6};
        System.out.println(new neatArragement(neat).isOrder());
        Integer[] odd = {1, 2, 13 ,4, 8, 6};
        System.out.println(new OddSum(odd).amount());
        Integer[][] matrix1 = {{1,2},{1,2}}, matrix2 = {{2,4},{2,4}};
        System.out.println(new MatrixSum(matrix1, matrix2).Sum());
        Integer[] a1 = {-5, 0, 0, 1, 5}, a2 = {-10, 0, 7};
        System.out.println(new CombineTwoArrays(a1,a2).combine());
        Integer min = 0, max = 1000, nRandom = (int) (Math.random() * (max-min+1)+min);
        System.out.println(nRandom);
        new RandomNumber(nRandom.toString()).guessNumber();
    }
}
