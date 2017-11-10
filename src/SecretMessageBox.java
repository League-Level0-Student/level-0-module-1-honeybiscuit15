import javax.swing.JOptionPane;
import javax.swing.Popup;

public class SecretMessageBox {
	public static void main(String[] args) {
		String passcode = "Loading...";
		String guess =  "";
		String message =  JOptionPane.showInputDialog(null, "Type the secret message");
		guess = JOptionPane.showInputDialog(" what's the password ");
		if (guess.equalsIgnoreCase(passcode)) {
			JOptionPane.showMessageDialog(null, message);}
		
	else 

			JOptionPane.showMessageDialog(null, "INTRUDER!!!");
		
	}
	
}
