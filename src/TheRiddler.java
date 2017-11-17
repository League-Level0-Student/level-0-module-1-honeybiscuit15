import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
		 int score = 0 ;  
		 String answer = "secret"; 
		String message =  JOptionPane.showInputDialog(null, "If you have me, you want to share me. If you share me, you haven't got me. What am I?");
		if (message.equalsIgnoreCase(answer)) {
			JOptionPane.showMessageDialog(null, "awesome");
			score++; 
			JOptionPane.showMessageDialog(null, "you get a point" );
		
		}		
		
		else{
			JOptionPane.showMessageDialog(null, "loading..");}
		 
	 answer = "tomorrow"; 
			 message =  JOptionPane.showInputDialog(null, "What is always coming but never arrives?");
			if (message.equalsIgnoreCase(answer)) {
				JOptionPane.showMessageDialog(null, "awesome");
				score++; 
				JOptionPane.showMessageDialog(null, "you get a point" );
			
			}		
			
			else
				JOptionPane.showMessageDialog(null, "loading..");
		
	JOptionPane.showMessageDialog(null, "you scored..")+score;
	}
	
}
	
	


