

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.LineBorder;

public class ticTacToe {
	static JFrame frame = new JFrame("Tic Tac Toe Game");
	JPanel panel = new JPanel(null);
	JPanel scorePanel = new JPanel(null);
	Color Color_panel = Color.decode("#E5E5E5");
	Color color_Score_panel = Color.decode("#586F7C");
	Color fontColor = Color.decode("#14213D");
	JLabel xScore = new JLabel("X Score: ");
	JLabel oScore = new JLabel("O Score: ");
	JLabel dScore = new JLabel("Draw: ");
	Font font = new Font("Microsoft Sans Serif",Font.ROMAN_BASELINE,18);
	public static void main(String[] args) {
		
		buttons btns = new buttons(frame);
	
	}
	public ticTacToe()
	{
		frame.setSize(512, 300);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		panel.setBackground(Color_panel);
		panel.add(xScore);
		panel.add(oScore);
		panel.add(dScore);
		panel.add(scorePanel);
		scorePanel.setBounds(230,10,240,220);
		scorePanel.setBackground(Color_panel);
		xScore.setBounds(240, 30, 100, 50);
		oScore.setBounds(240, 70, 100, 50);
		dScore.setBounds(240, 110, 100, 50);
		frame.add(panel);
		xScore.setFont(font);
		oScore.setFont(font);
		dScore.setFont(font);
		xScore.setForeground(fontColor);
		dScore.setForeground(fontColor);
		oScore.setForeground(fontColor);

	}
	
	
}
