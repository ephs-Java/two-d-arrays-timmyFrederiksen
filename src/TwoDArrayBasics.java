import java.util.Random;
public class TwoDArrayBasics {

	public static void main(String[] args) {
		int[][] nums = new int [3][5];
		
		// Create a 3 x 5 array of ints
		fillRandom(nums, 1, 100);
		printArray(nums);
		int rowTotal = sumRows(nums, 0);
		System.out.println(rowTotal);
		int[] theSums = rowSums(nums);
		printMe(theSums);
		// Fill the array with random numbers using fillRandom
		
		// test each method you create below.

	}
	/*
	 * given the lower and upper bounds of the random numbers
	 * fill an array of random numbers 
	 */
	public static void fillRandom(int[][] nums, int low, int high) {
		Random random = new Random();
		for (int row = 0; row < nums.length; row++) {
			for (int column = 0; column < nums[0].length; column++) {
				nums[row][column] = random.nextInt(high) + low;
			}
		}
	}
	/*
	 * create a method that prints a 2D array
	 */
	public static void printArray(int[][] nums) {
		for (int row = 0; row < nums.length; row++) {
			System.out.print(" { ");
			for (int column = 0; column < nums[0].length; column++) {
				System.out.print(nums[row][column] + ", ");
			}
			System.out.println(" } ");
		}
	}
	
	/*
	 * return the sum of a row (r) in a 2D array (nums)
	 */
	public static int sumRows(int[][] nums, int row) {
		int total = 0;
		for (int column = 0; column < nums[0].length; column++) {
			total += nums[row][column];
		}
			return total;
	}

	
	/*
	 * return an array of row sums of a 2D array (nums)
	 */
	public static int[] rowSums(int[][] nums) {
		int[] sums = new int[nums.length];
		for (int r = 0; r < nums.length; r++) {
			sums[r] = sumRows(nums, r);
		}
		return sums;
	}
	
	public static void printMe(int [] n) {
		System.out.print("{");
		for (int r = 0; r < n.length; r++) {
			System.out.print(n[r] + ", ");
		}
		System.out.println("}");
	}
	
	
	/*
	 * check an 1D array for repeats, return true if all 
	 * elements of the array are unique
	 */
	

	
	
	/*
	 * given an array
	 * return the index of the target value, 
	 * return -1 if it is not found
	 */
	

	
	
	/*
	 * return the min value in a 2D array
	 */
	

	
	
	
	/*
	 * return the max value in a 2D array
	 */
	

	
	
	
}
