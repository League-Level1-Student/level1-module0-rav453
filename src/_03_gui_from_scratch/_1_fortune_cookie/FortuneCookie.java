package _03_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
        System.out.println("Button clicked");
        JFrame frame = new JFrame();
        frame.setVisible(true);
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
        
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "you will win the lottery");
		
	}
		else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "nothing");
		
	}
		else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "still nothing");
		
	}
		else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "i cant come up with anything");
		
	}
		else if (rand == 4) {
			JOptionPane.showMessageDialog(null, "fortune 5");
		
	}
  }
}
