import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.SoftBevelBorder;

import java.awt.event.*;
import java.util.Scanner;
import java.awt.*;

public class CalculatorGUIPanel extends JPanel{
	
	 // an array of buttons displayed on the calculator
	  private JButton[] digitButtons;
	  private Calculator calc = new Calculator(); 
	  
	  // output display for the calculator
	  private JTextField display = new JTextField(10);
	 
	 
	  /** Constructor -- builds a GUI for a calculator */
	  public CalculatorGUIPanel() {
	   
	    // create an array of button labels
	    String[] buttonLabels =  {"1", "2", "3", "4", "5", "6",
	      "7", "8", "9", "C", "0", "=","+","-","*"};
	   
	    // Create an array of buttons.
	    digitButtons = new JButton[buttonLabels.length];
	   
	    // Create an actionListener
	    ButtonListener  listener = new ButtonListener();
	    
	    // Create a 4 x 3 grid for placement of buttons.
	    JPanel buttonGrid = new JPanel();
	    buttonGrid.setLayout(new GridLayout(5, 3));
	   
	    /* Create a button with each button label, add it to buttonGrid,
	   and register the button as a listener. */
	    for (int nextBut = 0; nextBut < digitButtons.length; nextBut++) {
	      digitButtons[nextBut] = new JButton(buttonLabels[nextBut]);

	      buttonGrid.add(digitButtons[nextBut]);
	      digitButtons[nextBut].addActionListener(listener);
	    }
	 // Create a message for the user
	    JLabel instruct = new JLabel("Press a button");
	    instruct.setFont(new Font("Arial", Font.PLAIN, 12));
	   
	    // add the components to this JPanel
	    setLayout(new BorderLayout());
	    add(instruct, BorderLayout.NORTH);
	    add(buttonGrid, BorderLayout.CENTER);
	    add(display, BorderLayout.SOUTH); 
	  }
	  /** represents a listener for button presses */
	  private class ButtonListener implements ActionListener{
	   
	    /** what to do when a button has been pressed */
	    public void actionPerformed(ActionEvent aE) {
	    	JButton whichButton = (JButton) aE.getSource();  
//	      display.setText("You pressed " +  whichButton.getText());
	      if ("+".equals(whichButton.getText())) { 
	    	  calc.inOperator("+"); 
	    	  } else if("-".equals(whichButton.getText())) {
	    		  calc.inOperator("-"); 
	    	  } else if("*".equals(whichButton.getText())) {
	    		  calc.inOperator("*"); 
	    	  }else if("=".equals(whichButton.getText())) {
	    		  
	    		  //calc.inOperator("="); 
	    		  calc.inEquals();
	    		  display.setText(calc.getResult()); 
	    		   
	    	  }else if("C".equals(whichButton.getText())) {
	    		  display.setText("You pressed " +  whichButton.getText()); 
	    		  calc.inClear();
	    	  }
	    	  else {   
			    	int i = 0; 
			    	Scanner scan = new Scanner(whichButton.getText());
			    	i = scan.nextInt();  
			    	calc.inDigit(i); 
			    	display.setText(calc.getCurrentInput()); 
	    	} 
	    }
	 

}
}
