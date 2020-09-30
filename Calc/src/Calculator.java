
public class Calculator {
	
	private int currentInput;          //current input
	  private int previousInput;         // previous input
	  private int result;            // result of calculation
	  private String lastOperator = "";  // keeps track of the last operator entered
	 
	 
	  /** New digit entered as integer value i - moves currentInput 1 decimal place to the left and adds i in "one's column" */
	  public void inDigit(int i) {
	    currentInput = (currentInput * 10) + i;
	  }
	 
	  /** Operator entered  + - or *   */
	  public void inOperator(String op) {
	    previousInput = currentInput;      // save the new input as previous to get ready for next input
	    currentInput = 0;
	    lastOperator = op;                 // remember which operator was entered
	  }
	 
	 
	   /** Equals operation sets result to previousInput + - or * currentInput (depending on lastOperator) */
	  public void inEquals() {
	    if (lastOperator.equals("+")) {
	      result = previousInput + currentInput;
	    } else if (lastOperator.equals("-")) {
	    	result = previousInput - currentInput;
	    } else if (lastOperator.equals("*"))  {
	      result = previousInput * currentInput;
	    }
	    currentInput = result;
	    lastOperator = "";       // reset last operator to "nothing"
	  }
	 
	 
	  /** Clear operation */
	  public void inClear() {
	    currentInput = 0;
	    previousInput = 0;
	    result = 0;
	    lastOperator = "";
	  }
	  /** returns the current result */
	  public String getResult() { 
	    return Integer.toString(result);  //converts int to String
	  }
	 
	  /** returns the previous input value */
	  public String getPreviousInput() {
	    return Integer.toString(previousInput);
	  }
	  /** returns the current input value */
	  public String getCurrentInput() {
	    return Integer.toString(currentInput);
	  }
	 
}


