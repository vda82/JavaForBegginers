package day1.examples;

public class ExampleArrays {

	public static void main(String[] args) {
		
		/*int a = 1;
		int b = 2;
		int c, d, e;
		c =30;
		d = 40; e = 50;*/
		
		int[] a = {10,20,30,40,50};
		System.out.println(a[3] + " " + a[4]);
		
		//enhnaced for
		
		for(int temp : a) {
			System.out.println(temp);
		}
		
		int[] x = new int[5];
		x[0] = 12;
		x[2] = 25;
		for (int temp2 : x) {
			System.out.println(temp2);
		}
		
		String[] st = {"one", "two", "three"};
		for (String temp : st) {
			System.out.println(temp);
		}
		
		String[] stx = new String [5];
		stx[3] = "24";
		stx[0] = "22";
		for (String temp2 : stx) {
			System.out.println(temp2);
		}
		
		

	}

}
