import javax.swing.JOptionPane;

public class UNbirthday {
public static void main(String[] args) {
	String Birthday = JOptionPane.showInputDialog("When is your birthday (mm/dd");
if (Birthday.equals("11/28")) {
JOptionPane.showMessageDialog(null, "I wish you a Happy Birthday!");
	
}
else {
JOptionPane.showMessageDialog(null, "I wish you a merry UNBirthday");
}
}
}