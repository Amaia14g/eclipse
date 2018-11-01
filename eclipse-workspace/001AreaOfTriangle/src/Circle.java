//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Circle {

	// class variables go here
	private double radius;
	private double circumference;
	private double theArea;
	
	//Scanner keyboard = new Scanner(System.in);

	// constructor goes here
	public Circle() {

	}

	// methods go here

	public void setVarsToZero() {
		radius = 0.0;
		circumference = 0.0;
		theArea = 0.0;

	} // end of setVarsToZero

	public void showVars() {
		
		String msg = "Radius" + radius
				+ "; Circumference:  " + circumference
				+ "; area: " + theArea;
				
		
		JOptionPane.showMessageDialog(null, msg);
		
	} // end of showVars

	public void setRadius() {
		radius = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for the radius: "));
		
				
	}

	public void calcCircumference() {
		circumference = Math.PI * 2 * radius;
		
	}

	public void calcArea() {
		theArea = Math.PI * (radius * radius);
	}
	

} // end of class

