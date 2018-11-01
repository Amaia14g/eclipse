import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class SwingConverter implements ActionListener{ 
	
	private JPanel inputPanel = initInputPanel();
	private JTextField inputText;
	private JTextArea resultArea;
	private JButton enterButton;
	
	
	public SwingConverter() {
		JFrame myWindow = new JFrame("Base Converter - Created by Amaia");
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.add(inputPanel);
		myWindow.setSize(600, 500);
		myWindow.setVisible(true);
		
		
		
		
		
	}

	
	private JPanel initInputPanel() {
		
		JPanel panel = new JPanel();
		
		panel.setPreferredSize(new java.awt.Dimension(600,500));
		panel.setLayout(null);
		
		JLabel label = new JLabel("Enter a base-10 number: ");
		label.setBounds(50, 50, 220, 30);
		panel.add(label);
		
		JTextField text;//weird, but I'm not going to freak out....
		text = inputText = new JTextField();
		text.setBounds(230, 50, 100, 30);
		panel.add(text);
		
		JButton button = new JButton("Enter");
		button.setActionCommand("Enter");
		button.setBounds(340, 50, 80, 30);
		button.addActionListener(this);
		button.setBackground(java.awt.Color.MAGENTA);
		panel.add(button);
		// save class variable
		enterButton = button; // assign it to a class var to be used in other methods
		
		button = new JButton("Reset");
		button.setActionCommand("Reset");
		button.setBounds(430, 50, 80, 30);
		button.addActionListener(this);
		button.setBackground(java.awt.Color.CYAN);
		panel.add(button);
		
		resultArea = new JTextArea();
		resultArea.setBounds(50, 180, 500, 200);
		resultArea.setEditable(false);
		resultArea.setBackground(java.awt.Color.GREEN);
		panel.add(resultArea);
		
		
		return panel;
	}








	public static void main(String[] args) throws Exception {
		//SwingConverter baseConverter = new SwingConverter();
		new SwingConverter();
	}


	@Override
	public void actionPerformed(ActionEvent ev) {
		String command = ev.getActionCommand();
		if (command.equals("Enter")){
			showResult();
		}else if (command.equals("Reset")) {
			reset();
		}
		
		
		
		
	}


	private void showResult() {
		//System.out.println("showResult entered");
		
		String hexUpperCase;
		inputText.setEnabled(false);
		enterButton.setEnabled(false);
		
		Integer n = getInputNumber();
		if (n==null) {
			resultArea.append("Invalid number!");
			return;
		}
		
		int baseTenNumber = n.intValue();
		resultArea.append("base 10 = " + baseTenNumber + "\n" );
		resultArea.append("binary = " + Integer.toString(baseTenNumber, 2) + "\n" );
		resultArea.append("octal = " + Integer.toString(baseTenNumber, 8) + "\n" );
		resultArea.append("hexadecimal = " + Integer.toString(baseTenNumber, 16) + "\n" );
		
		hexUpperCase = Integer.toString(baseTenNumber, 16).toUpperCase();
		resultArea.append("hexadecimal = " + hexUpperCase + "\n");
	}
	private Integer getInputNumber() {
		try {
			Integer n = Integer.parseInt(inputText.getText());
			return n;
		} catch (Exception e) {
			/*
		 	oops problem with number entry
			this traps that error, now tell user the error
			and let them try entry again
			return null is to prevent total crash, but
			it really is not fixing the problem
			 NOT GOOD!
			 */
			return null;
		}
		
		
	}


	private void reset() {
		//System.out.println("reset entered");
		inputText.setText("");
		resultArea.setText("");
		inputText.setEnabled(true);
		enterButton.setEnabled(true);
		inputText.requestFocus();
	}

}
