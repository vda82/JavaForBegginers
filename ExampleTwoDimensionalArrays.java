package day1.examples;

public class ExampleTwoDimensionalArrays {

	public static void main(String[] args) {

		int[][] TwoDim = new int [4][3];
		
		//TwoDim[2][1] = 10;
		// for (initial value; condition; increment/decrement)		
		int temp = 10;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				
				TwoDim[i][j] = temp;
				System.out.println(TwoDim[i][j]);
				temp += 10;
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				
				System.out.println(TwoDim[i][j]);
			}
		}
		//print statement prints on the same line
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				
				System.out.print(TwoDim[i][j] + " ");
			}
			System.out.println();
		}
	}

}
