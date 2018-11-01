import javax.swing.JOptionPane;

public class Rectangle {

	// class variables go here
	private double sideA, sideB;
	private double perimeter;
	private double theArea;
	
	//Scanner keyboard = new Scanner(System.in);

	// constructor goes here
	public Rectangle() {

	}

	// methods go here

	public void setVarsToZero() {

		sideA = 0.0;
		sideB = 0.0;
		perimeter = 0.0;
		theArea = 0.0;

	} // end of setVarsToZero

	public void showVars() {
		
		//System.out.println("Side A = " + sideA);
		//System.out.println("Side B = " + sideB);
		//System.out.println("Side C = " + sideC);
		//System.out.println("Perimeter = " + perimeter);
		//System.out.println("Area = " + theArea);
		
		String msg = "Side A, B= " + sideA + ", " + sideB 
				+ "; perimeter:  " + perimeter
				+ "; area: " + theArea;
				
		
		JOptionPane.showMessageDialog(null, msg);
		
	} // end of showVars

	public void setSides() {
		//System.out.println("Please enter the value for side A:");
		//sideA = keyboard.nextDouble();
		sideA = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side A: "));
		
		//System.out.println("Please enter the value for side B:");
		//sideB = keyboard.nextDouble();
		sideB = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side B: "));
		
	}

	public void calcPerimeter() {
		perimeter = (sideA + sideB)* 2;
		
	}

	public void calcArea() {
		
		theArea = (sideA * sideB );
		
		
	}
	
} // end of class

