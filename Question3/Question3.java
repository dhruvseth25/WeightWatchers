import java.util.Random;
import java.util.Scanner; 
import java.util.Arrays; 


public class Question3 {
		
	public static void main(String[] args) {
		Random rand = new Random(); 
		int i;
		Scanner input = new Scanner(System.in); 
		final int N = 500;
		int array[]  = new int [N];
		for(i=0;i<array.length;i++) {
			array[i] = rand.nextInt(500);
		}
		System.out.println("500 random numbers generated.");
		System.out.print("Enter the value of n (to find n'th smallest number): ");
		int n  = input.nextInt();
		System.out.println(n + "th smallest no is " + findNthSmallest(array, n));
	}
	public static int findNthSmallest(int[] array, int n){
		Arrays.sort(array);
		return array[n-1];
	}	  
		
}