package first_selenium;

public class For_loop {

	public static void main(String[] args) {
		
		for (int i=1; i<=10;i++) {
			System.out.print("  "+i);
		}
		
		System.out.println();
		
		for(int j=10; j>=1; j--) {
			System.out.println(""+j);
		}
		
	
		
		// print table of 5

		for(int k=5; k<=50; k=k+5) {
			System.out.print("  "+k);
		}
		System.out.println();
		
		// nested for loop
		for(int a=1; a<=5; a++) {
			
			for(int b=1; b<=a; b++) {
				System.out.print("*"); // print *
			}
			System.out.println("");
		}
		
		System.out.println();
		
		for(int c=10; c<=10; c++) {
			for (int d=10; d<=c; d--) {
				System.out.print("*");
			}
		}
		
	}

}
