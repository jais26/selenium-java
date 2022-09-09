package first_selenium;

public class forth_Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		String S1= "...hello...";
		int b = 20;
		String S2= "...wrold...";
		
		System.out.println(a+b+S1+S2);
		System.out.println(a+S1+b+S2);
		System.out.println(b+S1+a+S2);
		System.out.println(a+S1+S2+b);
		System.out.println(S1+a+b+S2);
		System.out.println(S1+S2+a+b);
		System.out.println(a+b+S1+S2);
		System.out.println(a+b+(S1+S2));
		System.out.println(S1+S2+(a+b));
		
		// it means it add same value from left to right, but when we add bracket it adds correctly
		
	}

}
