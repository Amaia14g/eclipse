import javax.swing.JOptionPane;

public class Cuboid {

	// class variables go here
	private double length, width, depth;
	private double volume;
	private double theArea;
	
	//Scanner keyboard = new Scanner(System.in);

	// constructor goes here
	public Cuboid() {

	}

	// methods go here

	public void setVarsToZero() {

		length = 0.0;
		depth = 0.0;
		width = 0.0;
		volume = 0.0;
		theArea = 0.0;

	} // end of setVarsToZero

	public void showVars() {
		
		//System.out.println("Side A = " + sideA);
		//System.out.println("Side B = " + sideB);
		//System.out.println("Side C = " + sideC);
		//System.out.println("Perimeter = " + perimeter);
		//System.out.println("Area = " + theArea);
		
		String msg = "Length, Width, Depth= " + length + ", " + width + ", " + depth
				+ "; volume:  " + volume
				+ "; area: " + theArea;
				
		
		JOptionPane.showMessageDialog(null, msg);
		
	} // end of showVars

	public void setSides() {
		
		length = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for length: "));
		
		
		width = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for width: "));
		
		depth = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for depth: "));
		
	}

	public void calcVolume() {
		volume = (length * width * depth);
		
	}

	public void calcArea() {
		
		theArea = 2 * (length * width) + 2 * (width * depth) + 2 * (length * depth);
		
		
	}
	
} // end of class

