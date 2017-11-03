import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String remarkable = JOptionPane.showInputDialog(" what's your name ");
		if (remarkable.equalsIgnoreCase("Josh")) {
			JOptionPane.showMessageDialog(null, "cool shoes");
		} else if (remarkable.equalsIgnoreCase("Marc")) {
			JOptionPane.showMessageDialog(null, "nice hat");
		} else if (remarkable.equalsIgnoreCase("Jon")) {
			JOptionPane.showMessageDialog(null, "where are you");
		} else if (remarkable.equalsIgnoreCase("Maran")) {
			JOptionPane.showMessageDialog(null, "hi");
		} else if (remarkable.equalsIgnoreCase("Inez")) {
			JOptionPane.showMessageDialog(null, "nice hair");

		} else
			JOptionPane.showMessageDialog(null, "Who are you");

	}
}
