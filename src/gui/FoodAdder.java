package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class FoodAdder extends JPanel{
	
	WindowFrame frame;

	public FoodAdder(WindowFrame frame) {
		this.frame = frame;
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelNum = new JLabel("Number: ", JLabel.TRAILING);
		JTextField fieldNum = new JTextField(10);
		labelNum.setLabelFor(fieldNum);
		panel.add(labelNum);
		panel.add(fieldNum);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelAmout = new JLabel("Amount: ", JLabel.TRAILING);
		JTextField fieldAmount = new JTextField(10);
		labelAmout.setLabelFor(fieldAmount);
		panel.add(labelAmout);
		panel.add(fieldAmount);
		
		JLabel labelDate = new JLabel("Date: ", JLabel.TRAILING);
		JTextField fieldDate = new JTextField(10);
		labelDate.setLabelFor(fieldDate);
		panel.add(labelDate);
		panel.add(fieldDate);
		
		JLabel labelExperation = new JLabel("Experation: ", JLabel.TRAILING);
		JTextField fieldExperation = new JTextField(10);
		labelExperation.setLabelFor(fieldExperation);
		panel.add(labelExperation);
		panel.add(fieldExperation);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);
		
	
		
		this.add(panel);
		this.setVisible(true);

	}
}	
