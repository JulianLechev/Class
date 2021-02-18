package Profitable;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SierpinskiTriangleFrame extends JFrame {
	static int r = 0, gr = 0, b = 255;



	private JTextField jtfOrder = new JTextField("0", 5); // Order
	private JButton plus = new JButton("+");
	private JButton minus = new JButton("-");
	private SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel(); // To display the pattern

	public SierpinskiTriangleFrame() {
// Panel to hold label, text field, and a button
		JPanel panel = new JPanel();
		panel.add(new JLabel("Enter an order: "));
		panel.add(jtfOrder);
		jtfOrder.setHorizontalAlignment(SwingConstants.RIGHT);
// Add a Sierpinski triangle panel to the frame
		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);
		
		
		panel.add(plus);
		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int pl = Integer.parseInt(jtfOrder.getText()) + 1;
				jtfOrder.setText(Integer.toString(pl));
				trianglePanel.setOrder(Integer.parseInt(jtfOrder.getText()));
			}
		
			
		});
		
		panel.add(minus);
		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int min = Integer.parseInt(jtfOrder.getText()) - 1 ;
				jtfOrder.setText(Integer.toString(min));
				trianglePanel.setOrder(Integer.parseInt(jtfOrder.getText()));
				
			}});
		
		
// Register a listener
		jtfOrder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				trianglePanel.setOrder(Integer.parseInt(jtfOrder.getText()));
			}
		});

	}

}