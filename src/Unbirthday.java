import javax.swing.JOptionPane;

public class Unbirthday {

public static void main(String[] args) {
	String Unbirthday = JOptionPane.showInputDialog("when is your birthday and month "); 
	if (Unbirthday .equals("10/26")){
		JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY");

}
	else{

JOptionPane.showMessageDialog(null, "HAPPY UNBIRTHDAY");
	}
} 
}