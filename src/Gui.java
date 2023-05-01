import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
public class Gui implements ActionListener{
	static JFrame frame;
	private static JButton rock;
	private static JButton paper;
	private static JButton scissor;
	private static JPanel panel;
	private static Random random;
	private static String pcmove;
	
	public void Frame() {
		

		frame = new JFrame("Jack En Poy");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		rock = new JButton("Rock");
		rock.addActionListener(new Gui());
		paper = new JButton("Paper");
		paper.addActionListener(new Gui());
		scissor = new JButton("Scissor");
		scissor.addActionListener(new Gui());

		
		rock.setPreferredSize(new Dimension(100, 150));
		paper.setPreferredSize(new Dimension(100, 150));
		scissor.setPreferredSize(new Dimension(100, 150));
		
		JPanel panel = new JPanel();
		panel.add(rock);
		panel.add(paper);
		panel.add(scissor);
		
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setSize(360, 200);
		
		Random rand = new Random();
		
		while(true) {
			String [] rps = {"r", "p", "s"};
			int pc = rand.nextInt(rps.length);
			pcmove = rps[pc];
		}
		
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(pcmove.equals("r") && e.getSource() == rock) {
			JOptionPane.showMessageDialog(null, "TIE!");
		}else if(pcmove.equals("r") && e.getSource() == paper) {
			JOptionPane.showMessageDialog(null, "You Won!");
		}else if(pcmove.equals("r") && e.getSource() == scissor) {
			JOptionPane.showMessageDialog(null, "Computer Won!");
		}else if(pcmove.equals("p") && e.getSource() == rock) {
			JOptionPane.showMessageDialog(null, "Computer Won!");
		}else if(pcmove.equals("p") && e.getSource() == paper) {
			JOptionPane.showMessageDialog(null, "TIE");
		}else if(pcmove.equals("p") && e.getSource() == scissor) {
			JOptionPane.showMessageDialog(null, "You Won!");
		}else if(pcmove.equals("s") && e.getSource() == scissor) {
			JOptionPane.showMessageDialog(null, "You Won!");
		}else if(pcmove.equals("s") && e.getSource() == paper) {
			JOptionPane.showMessageDialog(null, "Computer Won!");
		}else if(pcmove.equals("s") && e.getSource() == rock) {
			JOptionPane.showMessageDialog(null, "You Won!");
		}
	}
		
	}	
	

