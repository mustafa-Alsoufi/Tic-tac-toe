import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class decisionListener implements ActionListener {
	private JFrame frame = new JFrame();
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i = 0; i< 3; i ++)
		{
			for(int j = 0; j< 3; j ++)
			{
				buttons.buttons[i][j].setText("");
			}
		}
		ticTacToe tt = new ticTacToe();
		buttons b = new buttons();
		frame.setVisible(false);
	//	frame.dispose ();
        ticTacToe.main (null);
	}
	public decisionListener(JFrame restartFrame)
	{
		frame=restartFrame;
	}

}
