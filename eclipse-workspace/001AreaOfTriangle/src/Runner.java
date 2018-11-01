import javax.swing.JOptionPane;

public class Runner {
	/**********
	 * 
	 *Circle: input r, calculate circumference, and area
	 *Rectangle: input side a and b, calc perimeter, area, and diagonal
	 *Triangle: Input sides A, B, C calc perimeter, area , all angles
	 *Cuboid: input sides A B C calc volume and total surface area
	 *Sphere: Input radius, calc volume, and surface area
	 *TOTAL celebration dance for great java
	 */
	
	public static void main(String[] args) {
		
		
		
		
		// Instantiate each class

		Triangle myTriangle = new Triangle();
		Circle myCircle = new Circle();
		Rectangle myRectangle = new Rectangle();
		Cuboid myCuboid = new Cuboid();
		Sphere mySphere = new Sphere();
		int goAgain = 1;
		
		while(goAgain == 1) {
		
		
		
		String msg = "Please enter your selection: Triangle, Circle, Rectangle, Cuboid, Sphere";
		String answer = JOptionPane.showInputDialog(msg);
		
		JOptionPane.showMessageDialog(null, answer);
		
		// when comparing strings == is unreliable- do not use ==
		//instead use String class methods .equals
		if(answer.equals("Triangle") ||  (answer.equals("triangle"))) {
			JOptionPane.showMessageDialog(null, "YES we are in triangle");
			myTriangle.setVarsToZero();
			myTriangle.setSides();
			myTriangle.calcPerimeter();
			myTriangle.calcArea();
			myTriangle.showVars();
			myTriangle.calcAngles();
			

		}
		else if (answer.equals("Circle")) {
			JOptionPane.showMessageDialog(null, "YES we are in circle");
			myCircle.setVarsToZero();
			myCircle.setRadius();
			myCircle.calcCircumference();
			myCircle.calcArea();
			myCircle.showVars();
			
		}
		else if (answer.equals("Rectangle")) {
			JOptionPane.showMessageDialog(null, "YES we are in rectangle");	
			myRectangle.setVarsToZero();
			myRectangle.setSides();
			myRectangle.calcPerimeter();
			myRectangle.calcArea();
			myRectangle.showVars();
		}
		else if (answer.equals("Cuboid")) {
			JOptionPane.showMessageDialog(null, "YES we are in cuboid");
			myCuboid.setVarsToZero();
			myCuboid.setSides();
			myCuboid.calcVolume();
			myCuboid.calcArea();
			myCuboid.showVars();
		}
		else if (answer.equals("Sphere")) {
			JOptionPane.showMessageDialog(null, "YES we are in sphere");
			mySphere.setVarsToZero();
			mySphere.setRadius();
			mySphere.calcVolume();
			mySphere.calcArea();
			mySphere.showVars();
		}
		else {
			JOptionPane.showMessageDialog(null, "Nope try again idk");
			
		}
			
			

		 msg = "Would you like to go again? (Y/N) ";
		 answer = JOptionPane.showInputDialog(msg);
		 
		 JOptionPane.showMessageDialog(null, answer);
		 
		 if ((answer.equals("Y") || answer.equals("y")
				 || answer.equals("Yes"))
				 || answer.equals("yes")) {
			goAgain = 1;
				 }
				 else {
					 goAgain = 0;
					 JOptionPane.showMessageDialog(null,"Thanks come again");
				 }
	}//end of while
	
	}//end of main

} //end of runner
