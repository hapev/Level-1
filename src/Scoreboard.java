import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

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

	JLabel awayTitle = new JLabel("AWAY");
	JLabel homeTitle = new JLabel("HOME");
	JLabel homeScore = new JLabel();
	JLabel homeTO = new JLabel();
	JLabel homeFouls = new JLabel();
	JLabel awayScore = new JLabel();
	JLabel awayFouls = new JLabel();
	JLabel awayTO = new JLabel();
	int hScore = 0;
	int aScore = 0;
	int hFouls = 0;
	int aFouls = 0;
	int aTO = 0;
	int hTO = 0;
	String awayTeamName = "Away";
	String homeTeamName = "Home";

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
		homeTitle.setBackground(Color.RED);
		homeTitle.setOpaque(true);
		awayTitle.setBackground(Color.BLUE);
		awayTitle.setOpaque(true);
		awayTitle.setFont(new Font("Impact", Font.BOLD, 36));
		homeTitle.setFont(new Font("Impact", Font.BOLD, 36));
		frame.add(away, BorderLayout.EAST);
		away.add(aSouth, BorderLayout.SOUTH);
		away.add(aCenter, BorderLayout.CENTER);
		away.add(aNorth, BorderLayout.NORTH);
		awayScore.setFont(new Font("Ipact", Font.BOLD, 50));
		homeScore.setFont(new Font("Ipact", Font.BOLD, 50));

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

	public void changeHomeScore(int addScore) {
		this.hScore += addScore;
		homeScore.setText(Integer.toString(hScore));
	}

	public void changeAwayScore(int addScore) {
		this.aScore += addScore;
		awayScore.setText(Integer.toString(aScore));

	}

	public void changeAwayTO(int addTO) {
		this.aTO += addTO;
		awayTO.setText("TO:" + Integer.toString(aTO));
	}

	public void changeHomeTO(int addTO) {
		this.hTO += addTO;
		homeTO.setText("TO:" + Integer.toString(hTO));
	}

	public void changeAwayFouls(int addFouls) {
		this.aFouls += addFouls;
		awayFouls.setText("Fouls:" + Integer.toString(aFouls));
	}

	public void changeHomeFouls(int addFouls) {
		this.hFouls += addFouls;
		homeFouls.setText("Fouls:" + Integer.toString(hFouls));
	}

	public void changeHomeName(String name) {
		this.homeTeamName = name;
		homeTitle.setText(homeTeamName);

	}

	public void changeAwayName(String name) {
		this.awayTeamName = name;
		awayTitle.setText(awayTeamName);

	}

}
