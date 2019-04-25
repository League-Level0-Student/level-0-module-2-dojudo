import javax.swing.JOptionPane;

public class rollercoaster {
public static void main(String[] args) {
	String input=JOptionPane.showInputDialog("whats your height in inches");
	int height=Integer.parseInt(input);
if(height>48) {
System.out.println("you can go on the roller coaster");

}
else {
	System.out.println("you need to grow more first");

	}
}
}