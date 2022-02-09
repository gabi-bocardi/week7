package Class_Study;

public class ArrayDemo {

	public static void main(String[] args) {

		// no memory allocated when it's like below, it's null
		double[] sales;

		// adding memory
		sales = new double[10];

		// or ..
		final int SIZE = 10;
		double[] sal= new double[SIZE];

		for (int i = 0; i < sales.length; i++) {
			System.out.print(sales[i] + "\s");
		}

		System.out.println();
		// initialization list, no need for size or constructor
		int[] numbers = { 2, 3, 4, 5, 6, 7 };
		//pass by reference, one problem...it changes it's original array, so create a copy of the array;
		
		int[] numbers2 = numbers;
		numbers2[2] = 56;
		// enhanced for loop
		
		for (int num : numbers2) {
			System.out.print(num + "\s");
		}
		System.out.println();
		
		for (int num : numbers) {
			System.out.print(num + "\s");
		}

		System.out.println();

		//2d arrays or more
		
		double[][] arr1 = new double[4][];
		
	}

}
