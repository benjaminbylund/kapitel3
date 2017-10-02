import javax.swing.*;
/*  Random, heltal 0 > 99	
	Benjamin Bylund	
	2017-10-02
*/
public class Random{
	public static void main(String[] args) {
		double r;
		int i;

		r = Math.random();
		r = 100 * r;
		r = r - r%1;
		i = (int) r;


		JOptionPane.showMessageDialog(null," " + i);
	}
}