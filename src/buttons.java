import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class buttons {
	
    static JButton[][] buttons = new JButton [3][3];
    static JLabel turn = new JLabel();
	Font font = new Font("Microsoft Sans Serif",Font.ROMAN_BASELINE,18);
	String XorO="";
	ticTacToe ttt = new ticTacToe();
	int x=10,y=10;
	static String[][] grid=new String[3][3];
	static boolean winner= false;
	private static JFrame frame = new JFrame();
	static int count= 0;
	
	public buttons(JFrame frame){
		//The position for the buttons
	ttt.scorePanel.add(turn);
	turn.setBounds (50, 150, 300, 50);
	turn.setFont(font);
	this.frame=frame;
	addButtons();
}


public static void whoIsWinner()	// getting who is winning the game
{ 
	
		
			for(int i = 0; i < buttons.length; i++)
		{
			if(grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2] && grid[i][0]!= null)
			{
				turn.setText(grid[i][0] + " Won");
				disableButtons(grid);
				restart res = new restart(frame);
				
				break;
			}
			else if(grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i] && grid[0][i]!= null)
			{
				turn.setText(grid[0][i] + " Won");
				disableButtons(grid);
				restart res = new restart(frame);
				break;
			}
			else if(grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[0][0]!= null)
			{
				turn.setText(grid[0][0] + " Won");
				disableButtons(grid);
				restart res = new restart(frame);
				
				break;
			}
			else if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[0][2]!= null) 
			{
				turn.setText(grid[0][2] + " Won");
				disableButtons(grid);
				restart res = new restart(frame);
				break;
			}
			
			else
			{
				count = count + 1;
				//break;
			}
		
	}
			if (count ==27)
			{
				turn.setText("DRAW ");
				disableButtons(grid);
				restart res = new restart(frame);
				
			}
			
}
public  void addButtons()	// getting who is winning the game
{
	for (int i=0;i<buttons.length;i++)
	{
		for (int j=0;j<buttons.length;j++)
		{
			
			buttons[i][j] = new JButton();
			ttt.panel.add(buttons[i][j]);
			buttons[i][j].setBackground(Color.decode("#FFFFFF"));

			buttons[i][j].setBounds(x, y, 64, 64);
			x = x + 66;
			if (x > 142)
			{
				x=10;
				y=y+66;
			}	

			buttons[i][j].addActionListener(new click(buttons[i][j],turn,i,j) );

		}
	}

}
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
public static void enableButtons()
{
	for(int i = 0; i< 3; i ++)
	{
		for(int j = 0; j< 3; j ++)
		{
			buttons[i][j].setEnabled(true);
			
			//buttons[i][j].setText(null);

		}
		
	}
}


}
