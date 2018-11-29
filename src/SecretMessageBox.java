import javax.swing.JOptionPane;

public class SecretMessageBox {
public static void main(String[] args) {
	String password = ("GiveMePassword123");
	String message = JOptionPane.showInputDialog("What do you want the Secret code to be?");
	String MostLikelyWrong = JOptionPane.showInputDialog("You can only see the secret code only if you can figure the password out");
	if (MostLikelyWrong.equals("GiveMePassword123")) {
		JOptionPane.showMessageDialog(null, message+"");
	}
	else {
		JOptionPane.showMessageDialog(null, "INTRUDER!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
}
}
