import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;

class FancyWindow implements KeyListener {
	int x = 50;
	int y = 50;
	Random random = new Random();
	JFrame win = new JFrame();

	public static void main(String[] args) {
		FancyWindow f = new FancyWindow();
		f.setup();
	}

	void setup() {
		win.addKeyListener(this);
		win.setSize(x, y);
		win.setVisible(true);
	}

	public void keyTyped(KeyEvent e) {

	}

	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			int x = random.nextInt(2000);
			int y = random.nextInt(599);
			win.setSize(x, y);

		}
	}

	public void keyReleased(KeyEvent e) {

	}
}
