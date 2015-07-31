package ru.alexnov.Cezar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Window extends JFrame {
	
	JTabbedPane tabPanel = new JTabbedPane();
	JPanel panel01 = new JPanel();
	
	public Window(){
		super("Шифрование");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(620, 450);
		
		tabPanel.addTab("шифр Цезаря", panel01);
		getContentPane().add(tabPanel);
	}

}
