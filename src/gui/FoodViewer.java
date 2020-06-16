package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Food.FoodInput;
import manager.FoodManager;

public class FoodViewer extends JPanel {
	
	WindowFrame frame;
	
	FoodManager foodManager;

	public FoodViewer(WindowFrame frame, FoodManager foodManager) {
		this.frame = frame;
		this.foodManager = foodManager;
		
		System.out.println("***" + foodManager.size() + "***");
		
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Number");
		model.addColumn("Name");
		model.addColumn("Amount");
		model.addColumn("Experation");
		model.addColumn("Date");
		
		for(int i =0; i< foodManager.size(); i++) {
			Vector row = new Vector();
			FoodInput si = foodManager.get(i);
			row.add(si.getNumber());
			row.add(si.getName());
			row.add(si.getAmount());
			row.add(si.getDate());
			row.add(si.getExperation());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
