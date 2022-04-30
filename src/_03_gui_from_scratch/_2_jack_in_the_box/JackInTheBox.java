package _03_gui_from_scratch._2_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JackInTheBox implements ActionListener {
	public void showButton() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        JButton button = new JButton("Surprise");
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
        
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int pressed = 0;
		pressed += 1;
		if (pressed == 5) {
			
		}
		
		
	}
}
