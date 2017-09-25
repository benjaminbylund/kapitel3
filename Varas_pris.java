import javax.swing.*;
/*	Beräknar en varans pris
 	Benjamin Bylund
 	2017-09-25
*/	
 public class Varas_pris{
 	public static void main(String[] args) {
 		String kostnad = JOptionPane.showInputDialog(null, "Hur mycket kostar det?");

 		int pris = Integer.parseInt(kostnad);
 		double moms = pris * 0.2;
 		double pris_moms = pris + moms;
 		JOptionPane.showMessageDialog(null, pris_moms + "kr" + "\n" + moms + "kr");
 	}
 }