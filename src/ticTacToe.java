import javax.swing.*;
import java.net.URL;
import java.awt.*;


public class ticTacToe {
	static JFrame frame = new JFrame("Tic Tac Toe Game");
	static JPanel panel = new JPanel(null);
	JPanel scorePanel = new JPanel(null);
	Color Color_panel = Color.decode("#E5E5E5");
	Color color_Score_panel = Color.decode("#586F7C");
	Color fontColor = Color.decode("#14213D");
	JLabel xScore = new JLabel("X Score: ");
	JLabel oScore = new JLabel("O Score: ");
	JLabel dScore = new JLabel("Draw: ");
	
	// This is to add a logo to my game
	
	JLabel logo = new JLabel();
	URL mainp = ticTacToe.class.getResource(
            "/img/2.jpg");
	ImageIcon pic = new ImageIcon(new ImageIcon(mainp)
			.getImage().getScaledInstance(490, 100, Image.SCALE_SMOOTH));
	
	// the logo ends ^^
	
	Font font = new Font("Microsoft Sans Serif",Font.ROMAN_BASELINE,18);
	
	public static void main(String[] args) {
		
		buttons btns = new buttons();
	
	}
	public ticTacToe()
	{
		frame.setSize(497, 380);
		frame.setVisible(true);
		//frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		logo.setIcon(pic);
		panel.setBackground(Color_panel);
		panel.add(xScore);
		panel.add(oScore);
		panel.add(dScore);
		panel.setBackground(Color.WHITE);
		panel.add(scorePanel);
		scorePanel.setBackground(Color_panel);
		xScore.setBounds(290, 130, 100, 50);
		oScore.setBounds(290, 170, 100, 50);
		dScore.setBounds(290, 220, 100, 50);
		logo.setBounds(0, 0, 490, 100);
		panel.add(logo);

		frame.add(panel);
		xScore.setFont(font);
		oScore.setFont(font);
		dScore.setFont(font);
		xScore.setForeground(fontColor);
		dScore.setForeground(fontColor);
		oScore.setForeground(fontColor);

	}
	
	
}
