package first_selenium;

public class WhileLoop {

	public static void main(String[] args) {
		
		// when we do not have constraint of a finite execution
		// infinite loop
		
  
		int i=1; //initialize
		while(i<10 ) { // condition true or false
			System.out.println("print true"+i);
			i++;
			
			while(true) {
				
				System.out.println("having fun");
			}
		}
	}

}
