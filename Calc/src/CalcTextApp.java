
public class CalcTextApp {
	
	 // create an instance of the Calculator class
	 private static Calculator c = new Calculator();

	 /** Main method - performs a simple calculation on the calculator */
	 public static void main(String[] args) {
	  // A simple calculation, 50 - 26 = 
	  c.inDigit(5);
	  c.inDigit(0);
	  c.inOperator("-");
	  c.inDigit(2);
	  c.inDigit(6);
	  c.inEquals();
	  System.out.println( "50 - 26 = " + c.getResult());
	  c.inClear();
	 }

}
