//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Sphere{

	// class variables go here
	private double radius;
	private double volume;
	private double theArea;
	
	//Scanner keyboard = new Scanner(System.in);

	// constructor goes here
	public Sphere() {

	}

	// methods go here

	public void setVarsToZero() {
		radius = 0.0;
		volume = 0.0;
		theArea = 0.0;

	} // end of setVarsToZero

	public void showVars() {
		
		String msg = "Radius" + radius
				+ "; Circumference:  " + volume
				+ "; area: " + theArea;
				
		
		JOptionPane.showMessageDialog(null, msg);
		
	} // end of showVars

	public void setRadius() {
		radius = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for the radius: "));
		
				
	}

	public void calcVolume() {
		volume = Math.PI * 4/3 * (radius * radius * radius);
		
	}

	public void calcArea() {
		theArea = Math.PI * 4 * (radius * radius);
	}
	

} // end of class

