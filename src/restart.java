import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

public class restart {
static JFrame restartFrame = new JFrame("Restart");
JPanel RestartPanel = new JPanel(null);
JLabel restartLabel = new JLabel("Would you like to restart the game?");
Font font = new Font("Microsoft Sans Serif",Font.ROMAN_BASELINE,18);
JButton yesB = new JButton("Yes");
JButton noB = new JButton("No");
public restart()
{
		
	restartLabel.setFont(font);
	restartFrame.setSize(512, 200);
	restartFrame.setLocationRelativeTo(null);
	restartFrame.setVisible(true);
	RestartPanel.add(noB);
	RestartPanel.add(yesB);
	RestartPanel.add(restartLabel);
	restartFrame.add(RestartPanel);
	restartLabel.setBounds(100, 20, 300, 50);
	yesB.setBounds(110, 80, 100, 30);
	noB.setBounds(270, 80, 100, 30);
	buttons.enableButtons();
	yesB.addActionListener(new decisionListener(restartFrame));
	noB.addActionListener(new noListener());
}


}
