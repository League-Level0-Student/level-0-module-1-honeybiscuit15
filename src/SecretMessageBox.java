import javax.swing.JOptionPane;
import javax.swing.Popup;

public class SecretMessageBox {
	public static void main(String[] args) {
		String passcode = "Loading...";
		String message =  JOptionPane.showInputDialog(null, "Type the secret message");
		passcode = JOptionPane.showInputDialog(" what's the password ");
		if (passcode.equalsIgnoreCase(passcode)) {
			JOptionPane.showMessageDialog(null, message);}
		
	else 

			JOptionPane.showMessageDialog(null, "INTRUDER!!!");
		
	}
	
}
