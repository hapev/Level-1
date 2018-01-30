import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ControlPanel implements ActionListener {

	public static void main(String[] args) {
		ControlPanel controlPanel = new ControlPanel();

		controlPanel.run();

	}

	JFrame frame = new JFrame();
	Scoreboard board = new Scoreboard();

	JPanel home = new JPanel();
	JPanel away = new JPanel();

	JPanel hSouth = new JPanel();
	JPanel hCenter = new JPanel();
	JPanel hNorth = new JPanel();
	JPanel aSouth = new JPanel();
	JPanel aCenter = new JPanel();
	JPanel aNorth = new JPanel();

	JPanel aSouthNorth = new JPanel();
	JPanel aSouthSouth = new JPanel();
	JPanel hSouthNorth = new JPanel();
	JPanel hSouthSouth = new JPanel();

	JButton aScorePlus = new JButton("+1 Score");
	JButton aScoreMinus = new JButton("-1 Score");
	JButton hScorePlus = new JButton("+1 Score");
	JButton hScoreMinus = new JButton("-1 Score");
	JButton aFoulsPlus = new JButton("+1 Foul");
	JButton aFoulsMinus = new JButton("-1 Foul");
	JButton hFoulsPlus = new JButton("+1 Foul");
	JButton hFoulsMinus = new JButton("-1 Foul");
	JButton aTOPlus = new JButton("+1 TO");
	JButton aTOMinus = new JButton("-1 TO");
	JButton hTOPlus = new JButton("+1 TO");
	JButton hTOMinus = new JButton("-1 TO");

	JTextField hTeamName = new JTextField("Home Team Name");
	JTextField aTeamName = new JTextField("Away Team Name");

	public void run() {
		frame.setLayout(new BorderLayout());
		aNorth.setLayout(new BorderLayout());
		aCenter.setLayout(new BorderLayout());
		aSouth.setLayout(new BorderLayout());
		hNorth.setLayout(new BorderLayout());
		hCenter.setLayout(new BorderLayout());
		hSouth.setLayout(new BorderLayout());
		hSouthSouth.setLayout(new BorderLayout());
		hSouthNorth.setLayout(new BorderLayout());
		aSouthSouth.setLayout(new BorderLayout());
		aSouthNorth.setLayout(new BorderLayout());
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

		hSouth.add(hSouthSouth, BorderLayout.SOUTH);
		hSouth.add(hSouthNorth, BorderLayout.NORTH);
		aSouth.add(aSouthSouth, BorderLayout.SOUTH);
		aSouth.add(aSouthNorth, BorderLayout.NORTH);

		aNorth.add(aTeamName);
		hNorth.add(hTeamName);

		hCenter.add(hScorePlus, BorderLayout.WEST);
		hCenter.add(hScoreMinus, BorderLayout.EAST);
		aCenter.add(aScorePlus, BorderLayout.WEST);
		aCenter.add(aScoreMinus, BorderLayout.EAST);

		hSouthNorth.add(hFoulsPlus, BorderLayout.WEST);
		hSouthNorth.add(hFoulsMinus, BorderLayout.EAST);
		aSouthNorth.add(aFoulsPlus, BorderLayout.WEST);
		aSouthNorth.add(aFoulsMinus, BorderLayout.EAST);

		hSouthSouth.add(hTOPlus, BorderLayout.WEST);
		hSouthSouth.add(hTOMinus, BorderLayout.EAST);
		aSouthSouth.add(aTOPlus, BorderLayout.WEST);
		aSouthSouth.add(aTOMinus, BorderLayout.EAST);

		frame.setVisible(true);

		hScorePlus.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == hScorePlus) {
			board.changeHomeScore(1);

		}
		if (e.getSource() == aScorePlus) {
			board.changeAwayScore(1);

		}
		if (e.getSource() == hScoreMinus) {
			board.changeHomeScore(-1);

		}
		if (e.getSource() == aScoreMinus) {
			board.changeAwayScore(-1);

		}
		if (e.getSource() == aTOPlus) {
			board.changeAwayTO(1);

		}
		if (e.getSource() == aTOMinus) {
			board.changeAwayTO(-1);

		}
		if (e.getSource() == hTOMinus) {
			board.changeHomeTO(-1);

		}
		if (e.getSource() == hTOPlus) {
			board.changeHomeTO(1);

		}
		if (e.getSource() == hFoulsPlus) {
			board.changeHomeFouls(1);

		}
		if (e.getSource() == hFoulsMinus) {
			board.changeHomeFouls(-1);

		}
		if (e.getSource() == aFoulsMinus) {
			board.changeAwayFouls(-1);

		}
		if (e.getSource() == aFoulsPlus) {
			board.changeAwayFouls(1);

		}
	}

}
