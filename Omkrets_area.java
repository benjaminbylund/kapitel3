import javax.swing.*;

/*
	Beräknar omkrets och area av en cirkel
	Benjamin Bylund
	2017-09-24
*/

public class Omkrets_area{
	public static void main(String[] args) {
		
		String radie = JOptionPane.showInputDialog(null, "Radien Tack");
		
		double radie1 = Double.parseDouble(radie);
		double pi = 3.1415926536;
		double area = pi * (radie1 * radie1);
		double omkrets = (2 * pi) * radie1;


		JOptionPane.showMessageDialog(null, omkrets + "\n" + area);
	}
}