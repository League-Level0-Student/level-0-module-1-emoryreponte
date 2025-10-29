package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("Whats your birthday use this format (day/month/year)\nexample: 29/10/2025");
		if (birthday.equals("29/10/2025")) {
			JOptionPane.showMessageDialog(null, "Happy birthday");
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy UNbirthday");
		}
			

	}

}
