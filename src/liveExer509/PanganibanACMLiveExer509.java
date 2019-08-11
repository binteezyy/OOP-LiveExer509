package liveExer509;

import java.awt.*;
import java.awt.event.*;

class PanganibanFrame extends Frame implements ActionListener, WindowListener{
	
	PanganibanFrame(String title) {
		super(title);
		setLayout(new FlowLayout());
		addWindowListener(this);
		setSize(400,400);
		
		Panel loginp = new Panel();
		loginp.setLayout(new GridLayout(4,1));
		
		Label usrnl = new Label("Username");
		usrnl.setAlignment(1);
		loginp.add(usrnl);
		TextField usrnt = new TextField();
		usrnt.setColumns(30);
		loginp.add(usrnt);
		
		Label pwl = new Label("Password");
		pwl.setAlignment(1);
		loginp.add(pwl);
		TextField pwt = new TextField();
		pwt.setColumns(30);
		loginp.add(pwt);
		
		
		add(loginp);
		
		layout();
		show();
	}
	
	

	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

public class PanganibanACMLiveExer509 {
	public static void main(String[] args) {
		new PanganibanFrame("binDB");
	}
}
