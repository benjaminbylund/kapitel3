import javax.swing.*;

/* Räknar ut mobilkostnad.
	Benjamin Bylund
	2017-09-25
*/
	public class Mobil{
		public static void main(String[] args) {
			String s = JOptionPane.showInputDialog(null, "Antal minuter per manad?");
			int min = Integer.parseInt(s);

			s = JOptionPane.showInputDialog("pris per minut");
			double minutpris = Double.parseDouble(s);

			double k = min * minutpris;
			JOptionPane.showMessageDialog(null, k + "kr");
		}
	}