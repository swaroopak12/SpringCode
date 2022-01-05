package com.mycode;
import javax.swing.JOptionPane;
public class Swing {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Whats your age?"));
		JOptionPane.showMessageDialog(null, "you are " + age + " years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Whats your height?"));
		JOptionPane.showMessageDialog(null, "you are " + height + " cms");

	}

}
