import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


	public class click implements ActionListener 
	{
		private JButton button = new JButton();
		private int row;
		private int column;
		private JLabel label;
		private static boolean player1=true, player2=false;
		Font font = new Font("Segoe Script", Font.PLAIN, 27);
		
		public void actionPerformed(ActionEvent e) {

			button.setFont(font);
			if (player1 && !player2)	// if it's Player1's turn
			{
				button.setForeground(Color.BLUE);
				button.setText("X");
				player1 = false;
				player2 = true;
				button.removeActionListener(this);
				label.setText("O's turn");
			}
			else if (!player1 && player2)		// if it's Player2's turn
			{
				button.setText("O");
				button.setForeground(Color.RED);
				player1 = true;
				player2 = false;

				button.removeActionListener(this);
				label.setText("X's turn");
			}
			
				buttons.grid[row][column] = button.getText();
				buttons.whoIsTheWinner();
			
		}
		
		public click(JButton button,JLabel label,int i, int j)
		{
			this.button = button;
			this.label = label;
			this.row = i;
			this.column = j;
			
		}
	
}

