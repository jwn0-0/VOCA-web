package VOCA;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class zz extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public zz() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(94, 63, 301, 48);
		add(textField);
		textField.setColumns(10);

	}

}
