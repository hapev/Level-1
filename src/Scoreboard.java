import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Scoreboard {
	public static void main(String[] args) {
		Scoreboard scoreboard = new Scoreboard();
		scoreboard.run();

	}

	JFrame frame = new JFrame();
	JPanel hNorth = new JPanel();
	JPanel hSouth = new JPanel();
	JPanel hCenter = new JPanel();
	JPanel aNorth = new JPanel();
	JPanel aSouth = new JPanel();
	JPanel aCenter = new JPanel();
	JPanel home = new JPanel();
	JPanel away = new JPanel();

	JLabel awayTitle = new JLabel("Away");
	JLabel homeTitle = new JLabel("Home");
	JButton homeScore = new JButton();
	JLabel homeTO = new JLabel();
	JLabel homeFouls = new JLabel();
	JButton awayScore = new JButton();
	JLabel awayFouls = new JLabel();
	JLabel awayTO = new JLabel();
	int hScore = 0;
	int aScore = 0;
	int hFouls = 0;
	int aFouls = 0;
	int aTO = 0;
	int hTO = 0;

	public void run() {
		frame.setLayout(new BorderLayout());
		aNorth.setLayout(new BorderLayout());
		aCenter.setLayout(new BorderLayout());
		aSouth.setLayout(new BorderLayout());
		hNorth.setLayout(new BorderLayout());
		hCenter.setLayout(new BorderLayout());
		hSouth.setLayout(new BorderLayout());
		away.setLayout(new BorderLayout());
		home.setLayout(new BorderLayout());

		frame.add(away, BorderLayout.EAST);
		away.add(aSouth, BorderLayout.SOUTH);
		away.add(aCenter, BorderLayout.CENTER);
		away.add(aNorth, BorderLayout.NORTH);

		frame.add(home, BorderLayout.WEST);
		home.add(hSouth, BorderLayout.SOUTH);
		home.add(hCenter, BorderLayout.CENTER);
		home.add(hNorth, BorderLayout.NORTH);

		hCenter.add(homeScore);
		hSouth.add(homeTO, BorderLayout.CENTER);
		hSouth.add(homeFouls, BorderLayout.SOUTH);
		hNorth.add(homeTitle);

		aNorth.add(awayTitle);
		aCenter.add(awayScore);
		aSouth.add(awayFouls, BorderLayout.SOUTH);
		aSouth.add(awayTO, BorderLayout.CENTER);
		frame.setVisible(true);
		homeScore.setText(Integer.toString(hScore));
		awayScore.setText(Integer.toString(aScore));
		awayFouls.setText("Fouls: " + (Integer.toString(aFouls)));
		homeFouls.setText("Fouls: " + (Integer.toString(hFouls)));
		awayTO.setText("TOs: " + (Integer.toString(aTO)));
		homeTO.setText("TOs: " + (Integer.toString(hTO)));

		frame.pack();
	}

}
