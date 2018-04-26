package StartMenuPanelPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import DarkChessGUIPackage.DarkChessGUI;
public class StartMenuPanel extends JPanel implements ActionListener
{
	JButton button;
	DarkChessGUI root;
	public StartMenuPanel(DarkChessGUI root)
	{
		setLayout(null);
		button=new JButton();
		button.setBounds(500,250,200,50);
		button.setText("Start Game");
		add(button);
		this.root=root;
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		root.changeToSettingPanel();
	}
}
