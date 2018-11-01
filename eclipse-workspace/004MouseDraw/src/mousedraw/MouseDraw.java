package mousedraw;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MouseDraw extends JFrame {
	
	JMenuBar mainMenuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	JMenu boardColorMenu = new JMenu("BoardColor");
	JMenu penSizeMenu = new JMenu("PenSize");
	JMenuItem newMenuItem = new JMenuItem("New");
	JMenuItem exitMenuItem = new JMenuItem("Exit");
	JMenuItem yellowMenuItem = new JMenuItem("Yellow");
	JMenuItem redMenuItem = new JMenuItem("Red");
	JMenuItem blackMenuItem = new JMenuItem("Black");
	JMenuItem fineMenuItem = new JMenuItem("Fine");
	JMenuItem smallMenuItem = new JMenuItem("Small");
	JMenuItem mediumMenuItem = new JMenuItem("Medium");
	JMenuItem largeMenuItem = new JMenuItem("Large");
	
	
	JPanel drawPanel = new JPanel();
	
	JLabel leftColorLabel = new JLabel();
	JLabel rightColorLabel = new JLabel();
	
	JPanel colorPanel = new JPanel();
	JLabel[] colorLabel = new JLabel[18];
	Color drawColor, leftColor,rightColor;
	double XPrevious, YPrevious;
	Graphics2D g2D;
	
	public MouseDraw() {
		// JFrame constructor
		setTitle("Artistic Creations by Amaia G! October 2018");
		setResizable(false);
		setSize(800, 600);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				exitForm(e);
			}
			
		});	
		getContentPane().setLayout(new GridBagLayout());	
		
		setJMenuBar(mainMenuBar);
		fileMenu.setMnemonic('F');
		mainMenuBar.add(fileMenu);
		fileMenu.add(newMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
		
		setJMenuBar(mainMenuBar);
		boardColorMenu.setMnemonic('B');
		mainMenuBar.add(boardColorMenu);
		boardColorMenu.add(yellowMenuItem);
		boardColorMenu.addSeparator();
		boardColorMenu.add(redMenuItem);
		boardColorMenu.addSeparator();
		boardColorMenu.add(blackMenuItem);
		
		setJMenuBar(mainMenuBar);
		penSizeMenu.setMnemonic('P');
		mainMenuBar.add(penSizeMenu);
		penSizeMenu.add(fineMenuItem);
		penSizeMenu.addSeparator();
		penSizeMenu.add(smallMenuItem);
		penSizeMenu.addSeparator();
		penSizeMenu.add(mediumMenuItem);
		penSizeMenu.addSeparator();
		penSizeMenu.add(largeMenuItem);
		
		drawPanel.setPreferredSize(new Dimension(500, 400));
		drawPanel.setBackground(new Color(200, 200, 200));
		GridBagConstraints gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 0;
		gridConstraints.gridheight = 2;
		gridConstraints.insets = new Insets(10, 10, 10, 10);
		getContentPane().add(drawPanel, gridConstraints);
		
		leftColorLabel.setPreferredSize(new Dimension(40, 40));
		leftColorLabel.setOpaque(true);
		//leftColorLabel.setBackground(Color.YELLOW);
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 0;
		gridConstraints.anchor = GridBagConstraints.NORTH;
		gridConstraints.insets = new Insets(10, 5, 10, 10);
		getContentPane().add(leftColorLabel, gridConstraints);
		
		rightColorLabel.setPreferredSize(new Dimension(40, 40));
		rightColorLabel.setOpaque(true);
		//rightColorLabel.setBackground(Color.BLUE);
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 0;
		gridConstraints.anchor = GridBagConstraints.NORTH;
		gridConstraints.insets = new Insets(10, 5, 10, 10);
		getContentPane().add(rightColorLabel, gridConstraints);
		
		colorPanel.setPreferredSize(new Dimension(160, 320));
		colorPanel.setBorder(BorderFactory.createTitledBorder("Colors"));
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 1;
		gridConstraints.gridwidth = 2;
		gridConstraints.anchor = GridBagConstraints.NORTH;
		gridConstraints.insets = new Insets(10, 5, 10, 10);
		getContentPane().add(colorPanel, gridConstraints);
		
		
		
		
		
		drawPanel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				drawPanelMousePressed(e);
			}
			
		});
		
		drawPanel.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				drawPanelMouseDragged(e);
			}
			
		});
		drawPanel.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				drawPanelMouseReleased(e);
			}
		});
		
		
		
		newMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newMenuItemActionPerformed(e);
			}
		});
		exitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exitMenuItemActionPerformed(e);
		
			}
		});
		
		
		
		yellowMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yellowMenuItemActionPerformed(e);
			}
		});		
		
		redMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				redMenuItemActionPerformed(e);
			}
		});
		blackMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				blackMenuItemActionPerformed(e);
			}
		});
		
		fineMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fineMenuItemActionPerformed(e);
			}
		});
		smallMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				smallMenuItemActionPerformed(e);
			}
		});
		mediumMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mediumMenuItemActionPerformed(e);
			}
		});
		largeMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				largeMenuItemActionPerformed(e);
			}
		});
		

			
		
		colorPanel.setLayout(new GridBagLayout());
		int j = 0;
		for (int i = 0; i < 18; i++)
		{
			colorLabel[i] = new JLabel();
			colorLabel[i].setPreferredSize(new Dimension(30, 30));
			colorLabel[i].setOpaque(true);
			gridConstraints = new GridBagConstraints();
			gridConstraints.gridx = j;
			gridConstraints.gridy = i - j * 9;
			colorPanel.add(colorLabel[i], gridConstraints);
			if (i == 8) {
			j++;		
		}
		colorLabel[i].addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				colorMousePressed(e);
			}


		});
			
			
			
		}//end of color grids loop
		
			colorLabel[0].setBackground(new Color(255, 153, 153));
			colorLabel[1].setBackground(new Color(255, 0, 0));
			colorLabel[2].setBackground(new Color(150, 0, 0));
			colorLabel[3].setBackground(new Color(204, 255, 153));
			colorLabel[4].setBackground(new Color(0, 255, 0));
			colorLabel[5].setBackground(new Color(0, 102, 0));
			colorLabel[6].setBackground(new Color(102, 178, 255));
			colorLabel[7].setBackground(new Color(0, 0, 255));
			colorLabel[8].setBackground(new Color(0, 0, 102));
			colorLabel[9].setBackground(new Color(255, 153, 255));
			colorLabel[10].setBackground(new Color(255, 0, 255));
			colorLabel[11].setBackground(new Color(153, 0, 153));
			colorLabel[12].setBackground(new Color(255, 255, 153));
			colorLabel[13].setBackground(new Color(255, 255, 0));
			colorLabel[14].setBackground(new Color(204, 204, 0));
			colorLabel[15].setBackground(new Color(153, 255, 255));
			colorLabel[16].setBackground(new Color(0, 255, 255));
			colorLabel[17].setBackground(new Color(0, 153, 153));
			
			
			
			
			leftColor = colorLabel[1].getBackground();
			leftColorLabel.setBackground(leftColor);
			rightColor = colorLabel[6].getBackground();
			rightColorLabel.setBackground(rightColor);
		
		
			pack();
			setLocationRelativeTo(null);
			g2D = (Graphics2D) drawPanel.getGraphics();
				
	}// end of constructor	
	

		
		
				
				
		private void exitForm(WindowEvent e) {
			
			g2D.dispose();
			System.exit(0);
	
		}//end exit form
		
		private void newMenuItemActionPerformed(ActionEvent e) {
			
			int response;
			response = JOptionPane.showConfirmDialog(
					null,
					"Are you sure you want to start a new drawing? ",
					"New Drawing",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if (response == JOptionPane.YES_OPTION) {
				g2D.setStroke(new BasicStroke(1f));
				g2D.setPaint(drawPanel.getBackground());
				g2D.fill(new Rectangle2D.Double(0, 0, drawPanel.getWidth(),
						drawPanel.getHeight()));
			}
		}
		private void exitMenuItemActionPerformed(ActionEvent e) {
			int response;
			response = JOptionPane.showConfirmDialog(null,  "Are you sure you want to exit?", 
					"Exit Program" ,
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if(response == JOptionPane.NO_OPTION) {
				return;
			} else {
				exitForm(null);
			}
			
		}
		
		
		
		private void yellowMenuItemActionPerformed(ActionEvent e) {
			int response;
			response = JOptionPane.showConfirmDialog(
					null,
					"Are you sure you want a yellow board? ",
					"Yellow Board",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if (response == JOptionPane.YES_OPTION) {
				drawPanel.setBackground(new Color( 255, 255, 0));
			}
		}		
		
		
		private void redMenuItemActionPerformed(ActionEvent e) {
			int response;
			response = JOptionPane.showConfirmDialog(
					null,
					"Are you sure you want a red board? ",
					"Red Board",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if (response == JOptionPane.YES_OPTION) {
				drawPanel.setBackground(new Color( 255, 0, 0));
			}
		}		
		
		
		private void blackMenuItemActionPerformed(ActionEvent e) {
			int response;
			response = JOptionPane.showConfirmDialog(
					null,
					"Are you sure you want a black board? ",
					"Black Board",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if (response == JOptionPane.YES_OPTION) {
				drawPanel.setBackground(new Color( 0, 0, 0));
			}
		}	
		
		
		
		private void fineMenuItemActionPerformed(ActionEvent e) {
			int response;
			response = JOptionPane.showConfirmDialog(
					null,
					"Are you sure you want a fine pen tip? ",
					"Fine tip",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if (response == JOptionPane.YES_OPTION) {
				g2D.setStroke(new BasicStroke(1f));
			}
		}	
		private void smallMenuItemActionPerformed(ActionEvent e) {
			int response;
			response = JOptionPane.showConfirmDialog(
					null,
					"Are you sure you want a small pen tip? ",
					"Small tip",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if (response == JOptionPane.YES_OPTION) {
				g2D.setStroke(new BasicStroke(2f));
			}
		}
		private void mediumMenuItemActionPerformed(ActionEvent e) {
			int response;
			response = JOptionPane.showConfirmDialog(
					null,
					"Are you sure you want a medium pen tip? ",
					"Medium tip",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if (response == JOptionPane.YES_OPTION) {
				g2D.setStroke(new BasicStroke(4f));
			}
		}
		private void largeMenuItemActionPerformed(ActionEvent e) {
			int response;
			response = JOptionPane.showConfirmDialog(
					null,
					"Are you sure you want a large pen tip? ",
					"Large tip",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if (response == JOptionPane.YES_OPTION) {
				g2D.setStroke(new BasicStroke(6f));
			}
		}
		

		private void drawPanelMousePressed(MouseEvent e) {
		if (e.getButton() ==MouseEvent.BUTTON1
				|| e.getButton() == MouseEvent.BUTTON3)	{
			XPrevious = e.getX();
			YPrevious = e.getY();
			if(e.getButton() == MouseEvent.BUTTON1) {drawColor = leftColor;
		
			}else {
				drawColor = rightColor;
			}
		}
			//System.out.println("mouse x, y =" + XPrevious +"," + YPrevious);
		
	}//end of mouse pressed
		
		private void drawPanelMouseDragged(MouseEvent e) {
			Line2D.Double myLine = new Line2D.Double(XPrevious, YPrevious, e.getX(), e.getY());
			g2D.setPaint(drawColor);
			g2D.draw(myLine);
			XPrevious = e.getX();
			YPrevious = e.getY();
			//System.out.println("mouse x, y =" + XPrevious + "," + YPrevious);
			
			
		}
		
		private void drawPanelMouseReleased(MouseEvent e) {
			
			if(e.getButton() == MouseEvent.BUTTON1
					|| e.getButton() == MouseEvent.BUTTON3) {
				Line2D.Double myLine = new Line2D.Double(XPrevious,  YPrevious, e.getX(), e.getY());
				g2D.setPaint(drawColor);
				g2D.draw(myLine);
			}
			
			
		}//end of mouse released
		private void colorMousePressed(MouseEvent e) {
			Component clickedColor = e.getComponent();
			
			if (e.getButton() == MouseEvent.BUTTON1) {
				leftColor = clickedColor.getBackground();
				leftColorLabel.setBackground(leftColor);	
			}	else if (e.getButton() == MouseEvent.BUTTON3) {
				rightColor = clickedColor.getBackground();
				rightColorLabel.setBackground(rightColor);
			}
			
		}
}//end class
