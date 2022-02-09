package Class_Study;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] rents = { { 400, 450, 500 }, { 550, 600, 700 }, { 750, 800, 900 } };
		
		for(int [] floor:rents) {
			System.out.println();
			for(int bdrm:floor)
				System.out.print(bdrm + "\s");
		}
		
		//int [] num1,num2,num 3 //all are arrays
		//int num1[], num2, num 3 //only the 1st is array
		

	}

}
