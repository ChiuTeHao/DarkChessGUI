package DarkChessGUIPackage;
import javax.swing.*;
import StartMenuPanelPackage.StartMenuPanel;
import SettingPanelPackage.SettingPanel;
public class DarkChessGUI extends JFrame
{
	JPanel[] panellist;
	public DarkChessGUI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,100,1000,600);
		panellist=new JPanel[3];
		panellist[0]=new StartMenuPanel(this);
		panellist[1]=new SettingPanel(this);
		setContentPane(panellist[0]);
		setVisible(true);
	}
	public void changeToSettingPanel()
	{
		setContentPane(panellist[1]);
		setVisible(true);
	}
}
