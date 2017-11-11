import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CHECKPOINT {
	public static void main(String[] args) {
		String colour = new String();
		colour = JOptionPane.showInputDialog("whats your favorite colour");
		JOptionPane.showMessageDialog(null, colour + " is my favorite color too");
		Robot rbt = new Robot();
		rbt.turn(-90);
		rbt.setSpeed(10);
		for (int i = 0; i < 3; i++) {
			rbt.penDown();
			rbt.turn(120);
			for (int j = 0; j < 25; j++) {
				rbt.setRandomPenColor();
				rbt.move(4);
			}
			
		}
		rbt.penUp();
		rbt.move(10000);
	}
}
