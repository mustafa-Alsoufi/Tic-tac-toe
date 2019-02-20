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
		buttons b = new buttons(frame);
		frame.setVisible(false);
		
	}
	public decisionListener(JFrame restartFrame)
	{
		frame=restartFrame;
	}

}
