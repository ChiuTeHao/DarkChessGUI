package SettingPanelPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import DarkChessGUIPackage.DarkChessGUI;
public class SettingPanel extends JPanel implements ActionListener
{
	DarkChessGUI root;
	JButton[] button;
	JLabel[] plabel;
	public SettingPanel(DarkChessGUI root)
	{
		setLayout(null);
		this.root=root;
		button=new JButton[3];
		plabel=new JLabel[2];
		for(int i=0;i<3;i++)
			button[i]=new JButton();
		for(int i=0;i<2;i++)
		{
			plabel[i]=new JLabel();
			plabel[i].setText("You have not choose a program");
			plabel[i].setBounds(50,100+i*200,800,50);
			add(plabel[i]);
		}
		button[0].setText("Choose Program 1");
		button[0].setBounds(900,100,200,50);
		button[1].setText("Choose Program 2");
		button[1].setBounds(900,300,200,50);
		button[2].setText("Game Start");
		button[2].setBounds(900,400,200,50);
		for(int i=0;i<3;i++)
		{
			button[i].addActionListener(this);
			add(button[i]);
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		JButton btn=(JButton)e.getSource();
		if(btn.getText()=="Choose Program 1")
		{
			chooseProgram(0);
		}
		else if(btn.getText()=="Choose Program 2")
		{
			chooseProgram(1);
		}
		else
		{
		}
	}
	public void chooseProgram(int id)
	{
		JFileChooser fc=new JFileChooser();
		fc.setCurrentDirectory(new java.io.File("/home"));
		fc.setDialogTitle("Please choose a DarkChess AI Program");
		int returnval=fc.showOpenDialog(null);
		if(returnval==JFileChooser.APPROVE_OPTION)
		{
			plabel[id].setText(fc.getSelectedFile().getAbsolutePath());
			setVisible(true);
		}
	}
}
