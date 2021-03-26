package review;
import java.lang.Math;

public class Main {

    public static void main(String[] args){
    	/*System.out.println(new PrimeNumbers(5).prime());
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
    	Double[][] MatrixReal = {{5D,2D,3D},{1D,5D,3D}, {1D,2D,5D}};
    	System.out.println(new MatrixRealNumbers(MatrixReal).compare());*/
    	//Integer[] sing = {230,555,1021,1,2,1,2,1000,65530,70000,80000,302,401,110,0,4,1,0,1,10000};
    	
    	Hotel x = new Hotel(5);
    	x.ocuparHabitacion(3, 4);
    	x.ocuparHabitacion(3, 2);
    	x.imprimirAlgo();
    	
    }
}



//	230,555,1021,1,2,1,2,1000,65530,70000,80000,302,401,110,0,4,1,0,1,10000

// ‘0’ (silencio) y ‘65536’ (tono agudo).