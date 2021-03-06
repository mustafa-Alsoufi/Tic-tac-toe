import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class buttons {
	
    static JButton[][] buttons = new JButton [3][3];
    static JLabel turn = new JLabel("");
	static Font font = new Font("Microsoft Sans Serif",Font.ROMAN_BASELINE,18);
	ticTacToe ttt = new ticTacToe();
	static String[][] grid=new String[3][3];
	static int count= 0;
	
	public buttons(){
	addButtons();
}


public void addButtons()	// Add buttons to the panel
{	int x=50,y=120;
	ticTacToe.panel.add(turn);
	turn.setBounds (320, 280, 100, 50);
	turn.setFont(font);
	
	for (int i=0;i<buttons.length;i++)
	{
		for (int j=0;j<buttons.length;j++)
		{
			
			buttons[i][j] = new JButton();
			ticTacToe.panel.add(buttons[i][j]);
			buttons[i][j].setBackground(Color.decode("#FFFFFF"));
			//The position for the buttons
			buttons[i][j].setBounds(x, y, 64, 64);	
			x = x + 66;
			if (x > 182)
			{
				x=50;
				y=y+66;
			}	
			
			buttons[i][j].addActionListener(new click(buttons[i][j],turn,i,j) );

		}
	}

}



public static void whoIsTheWinner()	// getting who is winning the game.
{ 
	
		// If any row has been filled with the same text.
			for(int i = 0; i < buttons.length; i++)	
		{
			if(grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2] && grid[i][0]!= null)
			{
				turn.setText(null);
				buttons[]
				disableButtons(grid);
				JOptionPane.showMessageDialog(null, grid[i][0] + " wins the game!"); // To display the winner
				restart res = new restart();
				
				break;
			}
		
		// If any Column has been filled with the same text.
			else if(grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i] && grid[0][i]!= null) 
			{

				turn.setText(null);
				disableButtons(grid);
				JOptionPane.showMessageDialog(null, grid[0][i] + " wins the game!"); // To display the winner
				restart res = new restart();
				break;
			}
		
		// If left diagonal has been filled with the same text.
			else if(grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[0][0]!= null)
			{

				turn.setText(null);
				disableButtons(grid);
				JOptionPane.showMessageDialog(null, grid[0][0] + " wins the game!"); // To display the winner
				restart res = new restart();
				
				break;
			}
		
		// If right diagonal has been filled with the same text.
			else if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[0][2]!= null) 
			{

				turn.setText(null);
				disableButtons(grid);
				JOptionPane.showMessageDialog(null, grid[0][2] + " wins the game!"); // To display the winner
				restart res = new restart();
				break;
			}
			
			else
			{
				count = count + 1;
			}
		
	}
			// To check if no one has won the game.
			if (count ==27)
			{
				JOptionPane.showMessageDialog(null, " It's a tie!"); // To display it's a tie
				disableButtons(grid);
				restart res = new restart();
				
			}
			
}

// Disable all the buttons
public static void disableButtons(String array[][])
{
	for(int i = 0; i< array.length; i ++)
	{
		for(int j = 0; j< array.length; j ++)
		{
			buttons[i][j].setEnabled(false);
		}
	}
}
// Enable all the buttons
public static void enableButtons()
{

	for(int i = 0; i< 3; i ++)
	{
		for(int j = 0; j< 3; j ++)
		{
			grid[i][j] = null;
			buttons[i][j].setEnabled(true);
		}
		
	}
}


}
