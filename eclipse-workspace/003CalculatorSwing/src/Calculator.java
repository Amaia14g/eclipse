import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
    	
        // class variables aka instance variables aka field variables
        JFrame frame;
        JTextField textField;
        
        JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdec, badd, bsub,
        bmul, bdiv, bsqr, bcbe, bsqt, blog, bclr, bksp, beq;
        
        Double firstNumber;
        Double secondNumber;
        Double result;
        int operator;
       
        public Calculator() {
            frame = new JFrame("Calculator, Created by Amaia G");
            textField = new JTextField();
            textField.setBounds(30,40,410,30);
            frame.add(textField);
           
            b1 = new JButton("1");
            b1.setBounds(40,240,50,40);
            frame.add(b1);
            
            b2 = new JButton("2");
            b2.setBounds(110,240,50,40);
            frame.add(b2);
            
            b3= new JButton("3");
            b3.setBounds(180,240,50,40);
            frame.add(b3);
            
            b4 = new JButton("4");
            b4.setBounds(40,170,50,40);
            frame.add(b4);
            
            b5 = new JButton("5");
            b5.setBounds(110,170,50,40);
            frame.add(b5);
            
            b6= new JButton("6");
            b6.setBounds(180,170,50,40);
            frame.add(b6);
            
            b7 = new JButton("7");
            b7.setBounds(40,100,50,40);
            frame.add(b7);
            
            b8 = new JButton("8");
            b8.setBounds(110,100,50,40);
            frame.add(b8);
            
            b9= new JButton("9");
            b9.setBounds(180,100,50,40);
            frame.add(b9);
            
            b0 = new JButton("0");
            b0.setBounds(40,100,50,40);
            frame.add(b0);
            
            bdec = new JButton(".");
            bdec.setBounds(110,100,50,40);
            frame.add(bdec);
            
            badd= new JButton("+");
            badd.setBounds(180,100,50,40);
            frame.add(badd);
            
            bsub = new JButton("-");
            bsub.setBounds(40,100,50,40);
            frame.add(bsub);
            
            bmul = new JButton("*");
            bmul.setBounds(110,100,50,40);
            frame.add(bmul);
            
            bdiv= new JButton("/");
            bdiv.setBounds(180, 100,50,40);
            frame.add(bdiv);
            
            bsqr = new JButton("Square");
            bsqr.setBounds(40,100,50,40);
            frame.add(bsqr);
            
            bcbe = new JButton("Cube");
            bcbe.setBounds(110,100,50,40);
            frame.add(bcbe);
            
            bsqt= new JButton("Square Root");
            bsqt.setBounds(180,100,50,40);
            frame.add(bsqt);
            
            blog = new JButton ("Log(10)");
            blog.setBounds(180, 100, 50, 40);
            frame.add(blog); 
            
            bclr = new JButton ("Clear");
            bclr.setBounds(180, 100, 50, 40);
            frame.add(bclr);
            
            bksp = new JButton ("Backspace");
            bksp.setBounds(180, 100, 50, 40);
            frame.add(bksp);
            
            beq = new JButton ("=");
            beq.setBounds(180, 100, 50, 40);
            frame.add(beq);
            
           frame.setSize(470,  500);
           frame.setLayout(null);
           frame.setVisible(true);
           
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setResizable(false);
           frame.setSize(470, 500);
           
           
           b1.addActionListener(this);        
           b2.addActionListener(this);        
           b3.addActionListener(this);
           b4.addActionListener(this);
           b5.addActionListener(this);
           b6.addActionListener(this);
           b7.addActionListener(this);
           b8.addActionListener(this);
           b9.addActionListener(this);
           b0.addActionListener(this);
           bdec.addActionListener(this);
           badd.addActionListener(this);
           bsub.addActionListener(this);
           bmul.addActionListener(this);
           bdiv.addActionListener(this);
           bsqr.addActionListener(this);
           bcbe.addActionListener(this);
           bsqt.addActionListener(this);
           blog.addActionListener(this);
           bclr.addActionListener(this);
           bksp.addActionListener(this);
           beq.addActionListener(this);
        }
        public void actionPerformed(ActionEvent e) {
           if(e.getSource() == b1)
        	   textField.setText(textField.getText().concat("1"));
           if(e.getSource() == b2)
        	   textField.setText(textField.getText().concat("2"));
           if(e.getSource() == b3)
        	   textField.setText(textField.getText().concat("3"));
           if(e.getSource() == b4)
        	   textField.setText(textField.getText().concat("4"));
           if(e.getSource() == b5)
        	   textField.setText(textField.getText().concat("5"));
           if(e.getSource() == b6)
        	   textField.setText(textField.getText().concat("6"));
           if(e.getSource() == b7)
        	   textField.setText(textField.getText().concat("7"));
           if(e.getSource() == b8)
        	   textField.setText(textField.getText().concat("8"));
           if(e.getSource() == b9)
        	   textField.setText(textField.getText().concat("9"));
           if(e.getSource() == b0)
        	   textField.setText(textField.getText().concat("0"));
           if(e.getSource() == bdec)
        	   textField.setText(textField.getText().concat("."));
          
           if(e.getSource() == badd)
        	   operator = 1;
        	   firstNumber = Double.parseDouble(textField.getText());
        	   textField.setText("");
        	   
        	   
           if(e.getSource() == bsub)
        	   operator = 2;
        	   firstNumber = Double.parseDouble(textField.getText());
        	   textField.setText("");
           
           
           if(e.getSource() == bmul)
        	   operator = 3;
        	   firstNumber = Double.parseDouble(textField.getText());
        	   textField.setText("");
           
           
           if(e.getSource() == bdiv)
        	   operator = 4;
        	   firstNumber = Double.parseDouble(textField.getText());
        	   textField.setText("");
           
           
           
           if(e.getSource() == bsqr)
        	   operator = 5;
        	   firstNumber = Double.parseDouble(textField.getText());
        	   textField.setText("");
           
           if(e.getSource() == bsqt)
        	   operator = 6;
        	   firstNumber = Double.parseDouble(textField.getText());
        	   textField.setText(""); 
           
           
           
           if(e.getSource() == bcbe)
        	   operator = 7;
        	   firstNumber = Double.parseDouble(textField.getText());
        	   textField.setText("");
           
           
           
           if(e.getSource() == blog)
        	   operator = 8;
        	   firstNumber = Double.parseDouble(textField.getText());
        	   textField.setText("");
        	   
           
          
           if(e.getSource() == bclr) {
        	   textField.setText("");
        	   
        	   
        	   
        	   
        	if(e.getSource() == bksp)   {
        		String s=textField.getText();
        		textField.setText("");
        		for(int i=0;i<s.length()-1;i++)
        			textField.setText(textField.getText()+s.charAt(i));
        	}
        	   
        	if(e.getSource() == beq)  {
        		secondNumber = Double.parseDouble(textField.getText());
        	}
        	   
        	switch(operator) {
        	   case 1:
        		   result = firstNumber + secondNumber;
        		   break;
        	   case 2:
        		   result = firstNumber - secondNumber;
        		   break;
        	   case 3:
        		   result = firstNumber * secondNumber;
        		   break;
        	   case 4:
        		   result = firstNumber / secondNumber;
        		   break;
        		   default : result = 0.0;
        	   }
        	   textField.setText(""+result);
           }
           
        }
    }




