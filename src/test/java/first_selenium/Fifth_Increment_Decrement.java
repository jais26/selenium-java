package first_selenium;

public class Fifth_Increment_Decrement {

	// 4 type of increment - Decrement operators
	// 1. Pre_increment operator ++i
	// 2. Post_increment operator i++
	// 3. Pre_decremnt operator  --i
	// 4. Post_drecremnt operator i--
	
	public static void main(String[] args) {
	  	
		int i = 10;
		int j = ++i;
		int k = j++;
		
		System.out.println(i); // i = 11 add all i 10+i  = 11
		System.out.println(j); // j = 12 add i value 11 ++i = 12
		System.out.println(k); // k = 11 add j value 11
		
		System.out.println();
		
		int l = 10;
		int m = l++ + ++l + l++ + ++l;
		System.out.println(l); // 11,12,13,14 = l=14
		System.out.println(m); // 10+12+12+14=48
		
		System.out.println();
		
		int a = 10;
		int b = --a + a-- - ++a + a-- - --a;
		System.out.println(a); // 9,8,9,8,7= 7
		System.out.println(b); // 9+9-9+9-8=11
		
		
	}

}
