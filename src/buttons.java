import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class buttons {

    JButton[] buttons = new JButton[9];
    JButton[][] bts = new JButton [3][3];
    JLabel whoIsTurn = new JLabel();
    Object obj = new click().getText();
	Font font = new Font("Microsoft Sans Serif",Font.ROMAN_BASELINE,18);
	String XorO="";
	final click c = new click();

    
public buttons(){
	int x=10,y=10;	//The position for the buttons
	ticTacToe ttt = new ticTacToe();
	ttt.scorePanel.add(whoIsTurn);

	whoIsTurn.setBounds (50, 150, 300, 50);
	whoIsTurn.setFont(font);
	/*for (int k=0;k<buttons.length;k++)		// setting up the position for the buttons
	{
		buttons[k] = new JButton();
		
		ttt.panel.add(buttons[k]);
		buttons[k].setBackground(Color.decode("#FFFFFF"));

		buttons[k].setBounds(x, y, 64, 64);
		x = x + 66;
		if (x > 142)
		{
			x=10;
			y=y+66;
		}
		buttons[k].addActionListener( new click(buttons[k],whoIsTurn));
	}
	*/
	for (int i=0;i<bts.length;i++)
	{
		for (int j=0;j<bts.length;j++)
		{
			bts[i][j] = new JButton();
			ttt.panel.add(bts[i][j]);
			bts[i][j].setBackground(Color.decode("#FFFFFF"));

			bts[i][j].setBounds(x, y, 64, 64);
			x = x + 66;
			if (x > 142)
			{
				x=10;
				y=y+66;
			}

			bts[i][j].addActionListener( new click(bts[i][j],whoIsTurn));
		}
	}

}


public void whoIsWinner()	// getting who is winning the game
{ 
	///System.out.println("test"+c.getText());
	if (buttons[0].getText() == "X" && buttons[1].getText() == "X" && buttons[2].getText() == "X")
	{
		System.out.println(buttons[0].getText()+" THAT WAS THE TEST");
		whoIsTurn.setText("THE WINNER IS X");
	}
	else
	{
		System.out.println("FUCK THIS JAVA");
	}
}
}
