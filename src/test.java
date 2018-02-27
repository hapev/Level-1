import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class test implements ActionListener{

	
	public static void main(String[] args) {
		test leader = new test();
		leader.run();
	}

	JFrame frame = new JFrame();
	JPanel r = new JPanel();
	JPanel l = new JPanel();
	JPanel rr = new JPanel();
	JPanel ll = new JPanel();
	JPanel rl = new JPanel();
	JPanel lr = new JPanel();
	JButton yellow = new JButton();
	JButton red= new JButton();
	JButton green = new JButton();
	JButton blue = new JButton();
	
	public void run() {
		
		frame.setLayout(new BorderLayout());
		r.setLayout(new BorderLayout());
		l.setLayout(new BorderLayout());
		rl.setLayout(new BorderLayout());
		rr.setLayout(new BorderLayout());
		ll.setLayout(new BorderLayout());
		lr.setLayout(new BorderLayout());
		yellow.setLayout(new BorderLayout());
		red.setLayout(new BorderLayout());
		green.setLayout(new BorderLayout());
		blue.setLayout(new BorderLayout());
		frame.setVisible(true);
		frame.add(r, BorderLayout.EAST);
		frame.add(l,BorderLayout.WEST);
		l.add(ll,BorderLayout.WEST);
		l.add(lr,BorderLayout.EAST);
		r.add(rl,BorderLayout.WEST);
		r.add(rr,BorderLayout.EAST);
		rr.add(green);
		rl.add(blue);
		ll.add(yellow);
		lr.add(red);
		
		
		
		green.setBackground(Color.GREEN);
		yellow.setBackground(Color.YELLOW);
		red.setBackground(Color.RED);
		blue.setBackground(Color.BLUE);
		
		blue.setOpaque(true);
		yellow.setOpaque(true);
		red.setOpaque(true);
		green.setOpaque(true);
		green.addActionListener(this);
		yellow.addActionListener(this);
		red.addActionListener(this);
		blue.addActionListener(this);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		frame.pack();

	}

		
		

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==yellow) {

		}
			if(e.getSource()==blue) {
				

		}
				if(e.getSource()==red) {

		}
				
				if(e.getSource()==green) {
		
				}
	}
		
	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say "+ words);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
				
				
			
		
		
		
		
		
}	

