package day1.examples;

public class ExampleString {

	public static void main(String[] args) {
		
		String x = "James Dean";
		
		System.out.println("Hello " + x);
		
		System.out.println("   " + x.toUpperCase());
		
		System.out.println(x.substring(2));
		
		System.out.println(x.substring(2,7));
		
		System.out.println(x.charAt(3));
		
		System.out.println("____________");
		
		String age = "37";
		String salary = "1232.23";
		//Wrapper classes
		
		int a = Integer.parseInt(age)/2;
		System.out.println(a);
		
		double s = Double.parseDouble(salary) * 0.15;
		System.out.println(s);
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		

	}

}
