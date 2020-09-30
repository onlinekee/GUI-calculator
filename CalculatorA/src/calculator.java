import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import java.awt.Rectangle;
import javax.swing.JRadioButton;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	 private int currentInput; //current input 
	 private int previousInput; // previous input 
	 private int result;   // result of calculation          
	 private String lastOperator = ""; 
	

	/**
	 * Launch the application.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 292, 308);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Press a button");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(0, 0, 262, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBounds(new Rectangle(30, 30, 30, 30));
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(128, 128, 128), null, null, null));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(5, 29, 79, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("2");
		button.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(128, 128, 128), null, null, null));
		button.setBounds(new Rectangle(10, 10, 10, 10));
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(90, 29, 79, 29);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("3");
		button_1.setBounds(new Rectangle(10, 10, 10, 10));
		button_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.GRAY, null, null, null));
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(175, 29, 79, 29);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.GRAY, null, null, null));
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_2.setBounds(5, 66, 79, 29);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.GRAY, null, null, null));
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_3.setBounds(90, 66, 79, 29);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.GRAY, null, null, null));
		button_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_4.setBounds(175, 66, 79, 29);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.GRAY, null, null, null));
		button_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_5.setBounds(5, 103, 79, 29);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.GRAY, null, null, null));
		button_6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_6.setBounds(90, 103, 79, 29);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.GRAY, null, null, null));
		button_7.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_7.setBounds(175, 103, 79, 29);
		frame.getContentPane().add(button_7);
		
		JButton btnC = new JButton("C");
		btnC.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.GRAY, null, null, null));
		btnC.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnC.setBounds(5, 140, 79, 29);
		frame.getContentPane().add(btnC);
		
		JButton button_9 = new JButton("0");
		button_9.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.GRAY, null, null, null));
		button_9.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_9.setBounds(90, 140, 79, 29);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("=");
		button_10.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.GRAY, null, null, null));
		button_10.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_10.setBounds(175, 140, 79, 29);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("+");
		button_11.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.GRAY, null, null, null));
		button_11.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_11.setBounds(5, 177, 79, 29);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.GRAY, null, null, null));
		button_12.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_12.setBounds(90, 177, 79, 29);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("*");
		button_13.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.GRAY, null, null, null));
		button_13.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_13.setBounds(175, 177, 79, 29);
		frame.getContentPane().add(button_13);
		
		textField = new JTextField();
		textField.setBounds(5, 219, 249, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}

