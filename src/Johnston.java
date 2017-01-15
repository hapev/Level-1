import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;

class Johnston implements KeyListener {
	int x = 50;
	int y = 50;
	int john = 0;
	Random random = new Random();
	JFrame win = new JFrame();

	public static void main(String[] args) {
		Johnston f = new Johnston();
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

		for (int john = 0;john<3000;john++) {
			win.setSize(0 + john, 0 + john);
			john++;
		}

	}

	public void keyReleased(KeyEvent e) {

	}
}
