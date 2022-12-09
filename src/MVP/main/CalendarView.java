package MVP.main;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalendarView implements IView {

	private JPanel panel;
	private JLabel instruct;
	private JLabel curdate;
	private JLabel nextdate;
	private JLabel prevdate;
	private JLabel shopdate;
	private JLabel week;
	private JLabel zodiac;
	private JLabel errormsg;
	private JDialog error;
	private JTextField input;
	private JButton btn_submit;

	public CalendarView() {
		JFrame frame = new JFrame("Calendale Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLayout(new FlowLayout());
		panel = new JPanel();
		error = new JDialog();
		errormsg = new JLabel("invalid date!");
		error.add(errormsg);
		error.setLayout(new FlowLayout());
		error.setSize(200, 100);
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(boxlayout);
		panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));
		panel.setSize(400, 400);
		panel.setSize(400, 400);
		curdate = new JLabel();
		nextdate = new JLabel();
		prevdate = new JLabel();
		week = new JLabel();
		shopdate = new JLabel();
		zodiac = new JLabel();
		instruct = new JLabel("Enter a Date(mm/dd/yyyy)");
		input = new JTextField();
		setBtn_submit(new JButton("Submit"));
		panel.add(curdate);
		panel.add(nextdate);
		panel.add(prevdate);
		panel.add(shopdate);
		panel.add(week);
		panel.add(zodiac);
		panel.add(instruct);
		panel.add(getInput());
		panel.add(getBtn_submit());

		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.revalidate();
		frame.repaint();
	}

	public void addButtonActionListener(ActionListener e) {
		getBtn_submit().addActionListener(e);

	}

	public String getText() {
		return getInput().getText();
	}

	public void setdate(String text) {
		curdate.setText("Input Date:" + text);
	}

	public void setnextdate(String text) {
		nextdate.setText("Next Date:" + text);

	}

	public void setprevdate(String text) {
		prevdate.setText("Previous Date:" + text);

	}

	public void setshopdate(int a) {
		shopdate.setText("Number of shopping days until Christmas:" + a);

	}

	public void setweek(String text) {
		week.setText("Day of the Week:" + text);
	}

	public void setzodiac(String text) {
		zodiac.setText("The Zodiac sign is: " + text);

	}

	@Override
	public void seterro() {
		error.setVisible(true);
		
	}

	public JButton getBtn_submit() {
		return btn_submit;
	}

	public void setBtn_submit(JButton btn_submit) {
		this.btn_submit = btn_submit;
	}

	public JTextField getInput() {
		return input;
	}

	public void setInput(String s) {
		input.setText(s);
	}

	public boolean geterror() {
		// TODO Auto-generated method stub
		return error.isVisible();
	}

}
