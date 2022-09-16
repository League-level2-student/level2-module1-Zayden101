package _02_array_list_guestbook;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	JButton button = new JButton();
	JButton button2 = new JButton();
	
	ArrayList<String> list = new ArrayList<String>();

	
public static void main(String[] args) {
	GuestBook gb = new GuestBook();
	 gb.run();
}


	public void run() {
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 

panel.add(button);
button.setText("Add Name");

panel.add(button2);
button2.setText("View Name");

frame.add(panel);
frame.pack();
frame.setVisible(true);

button.addActionListener(this);
button2.addActionListener(this);


	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	
	
	// all the names added to the list. Format the list as follows:
	
	
	// Guest #1: Bob Banders
	
	list.add("Bob Banders");
	
	// Guest #2: Sandy Summers
	
	list.add("Sandy Summers");

	// Guest #3: Greg Ganders
	
	list.add("Greg Ganders");

	// Guest #4: Donny Doners
	
	list.add("Donny Doners");

	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button) {

			String nam = JOptionPane.showInputDialog("Enter Name");

			list.add(nam);

		}
		
		if(e.getSource() == button2) {
			
			JOptionPane.showMessageDialog(null, list);
			
		}
		
	}
	
	
	
	
	
	
}
