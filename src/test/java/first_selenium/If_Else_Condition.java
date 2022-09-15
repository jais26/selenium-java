package first_selenium;

public class If_Else_Condition {

	public static void main(String[] args) {
		
      if(2>1) {
    	  
    	  System.out.println("condition true"); 
      } else {
    	  
      System.out.println("condition false");
      }
      
      if(2<1) {
    	  System.out.println("condition true");
      } else {
    	  System.out.println("condition false");
      }
		
      if(2<1) {
    	  System.out.println("condition true");
      } else if(2>2){
    	  System.out.println("condition false");
      }else if(2==2){
    	  System.out.println("condition again false");
      } else {
    	  System.out.println("print this if fail");
      }
      
	}

}
