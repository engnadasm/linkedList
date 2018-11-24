package eg.edu.alexu.csd.datastructure.linkedList.cs14_cs57;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class AddSubtractMultiply extends JFrame {
	public static char first ;
	public static char second;
	public static String s;
	private JPanel contentPane;
	private static JTextField txtAsaxa;
	private JButton btnA1;
	private JButton btnB1;
	private JButton btnC1;
	private JButton btnA2;
	private JButton btnB2;
	private JButton btnC2;
	public static String title;
	public static int check = 0;
	/**
	 * Create the frame.
	 */
	public AddSubtractMultiply() {
		if (PolynomialSolver.flagAdd == 1) {
			title = "Add ";
		}
		else if (PolynomialSolver.flagMulti == 1) {
			title = "Multiply ";
		}
		else if (PolynomialSolver.flagSub == 1) {
			title = "Subtract ";
		}
		setTitle(title + "two polynomials");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblSele1 = new JLabel("First polynomial variable");
		lblSele1.setBounds(10, 43, 153, 33);
		lblSele1.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 12));
		contentPane.add(lblSele1);
		JLabel lblSele2 = new JLabel("Second polynomial variable");
		lblSele2.setBounds(10, 110, 166, 26);
		lblSele2.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 12));
		contentPane.add(lblSele2);
		txtAsaxa = new JTextField();
		txtAsaxa.setBounds(146, 185, 251, 36);
		contentPane.add(txtAsaxa);
		txtAsaxa.setColumns(10);	
		JLabel lblResult = new JLabel("The result is");
		lblResult.setBounds(26, 185, 100, 50);
		lblResult.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 12));
		contentPane.add(lblResult);
		btnA1 = new JButton("A");
		btnA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent pressA) {
				first = 'A';
				check = 1;
			}
		});
		btnA1.setForeground(new Color(248, 248, 255));
		btnA1.setBackground(new Color(123, 104, 238));
		btnA1.setBounds(200, 43, 59, 32);
		contentPane.add(btnA1);
		btnB1 = new JButton("B");
		btnB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first = 'B';
				check = 1;
			}
		});
		btnB1.setBounds(269, 43, 59, 32);
		btnB1.setForeground(new Color(248, 248, 255));
		btnB1.setBackground(new Color(123, 104, 238));
		contentPane.add(btnB1);
		btnC1 = new JButton("C");
		btnC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first = 'C';
				check = 1;
			}
		});
		btnC1.setBounds(338, 42, 59, 33);
		btnC1.setForeground(new Color(248, 248, 255));
		btnC1.setBackground(new Color(123, 104, 238));
		contentPane.add(btnC1);
		btnA2 = new JButton("A");
		btnA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				second = 'A';
				if (check == 1) {
				if (PolynomialSolver.flagAdd == 1) {
					txtAsaxa.setText("yes add");
					PolynomialSolver.p.add(AddSubtractMultiply.first, AddSubtractMultiply.second);
					s = PolynomialSolver.p.print('R');
					PolynomialSolver.flagAdd = 0;
					check = 0;
					txtAsaxa.setText(s);
				}
				else if (PolynomialSolver.flagMulti == 1) {
					PolynomialSolver.p.multiply(AddSubtractMultiply.first, AddSubtractMultiply.second);
					s = PolynomialSolver.p.print('R');
					PolynomialSolver.flagMulti = 0;
					check = 0;
					txtAsaxa.setText(s);
				}
				else if (PolynomialSolver.flagSub == 1) {
					PolynomialSolver.p.subtract(AddSubtractMultiply.first, AddSubtractMultiply.second);
					s = PolynomialSolver.p.print('R');
					PolynomialSolver.flagSub = 0;
					check = 0;
					txtAsaxa.setText(s);
				}
				} else {
					txtAsaxa.setText("Please select First polynomial variable then Second.");
				}
			}
		});
		btnA2.setBounds(200, 103, 64, 33);
		btnA2.setForeground(new Color(248, 248, 255));
		btnA2.setBackground(new Color(123, 104, 238));
		contentPane.add(btnA2);
		btnB2 = new JButton("B");
		btnB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				second = 'B';
				if (check == 1) {
					if (PolynomialSolver.flagAdd == 1) {
						txtAsaxa.setText("yes add");
						PolynomialSolver.p.add(AddSubtractMultiply.first, AddSubtractMultiply.second);
						s = PolynomialSolver.p.print('R');
						PolynomialSolver.flagAdd = 0;
						check = 0;
						txtAsaxa.setText(s);
					}
					else if (PolynomialSolver.flagMulti == 1) {
						PolynomialSolver.p.multiply(AddSubtractMultiply.first, AddSubtractMultiply.second);
						s = PolynomialSolver.p.print('R');
						PolynomialSolver.flagMulti = 0;
						check = 0;
						txtAsaxa.setText(s);
					}
					else if (PolynomialSolver.flagSub == 1) {
						PolynomialSolver.p.subtract(AddSubtractMultiply.first, AddSubtractMultiply.second);
						s = PolynomialSolver.p.print('R');
						PolynomialSolver.flagSub = 0;
						check = 0;
						txtAsaxa.setText(s);
					}
					} else {
						txtAsaxa.setText("Please select First polynomial variable then Second.");
					}
			}
		});
		btnB2.setBounds(269, 103, 59, 33);
		btnB2.setForeground(new Color(248, 248, 255));
		btnB2.setBackground(new Color(123, 104, 238));
		contentPane.add(btnB2);
		btnC2 = new JButton("C");
		btnC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				second = 'C';
				if (check == 1) {
					if (PolynomialSolver.flagAdd == 1) {
						txtAsaxa.setText("yes add");
						PolynomialSolver.p.add(AddSubtractMultiply.first, AddSubtractMultiply.second);
						s = PolynomialSolver.p.print('R');
						PolynomialSolver.flagAdd = 0;
						check = 0;
						txtAsaxa.setText(s);
					}
					else if (PolynomialSolver.flagMulti == 1) {
						PolynomialSolver.p.multiply(AddSubtractMultiply.first, AddSubtractMultiply.second);
						s = PolynomialSolver.p.print('R');
						PolynomialSolver.flagMulti = 0;
						check = 0;
						txtAsaxa.setText(s);
					}
					else if (PolynomialSolver.flagSub == 1) {
						PolynomialSolver.p.subtract(AddSubtractMultiply.first, AddSubtractMultiply.second);
						s = PolynomialSolver.p.print('R');
						PolynomialSolver.flagSub = 0;
						check = 0;
						txtAsaxa.setText(s);
					}
					} else {
						txtAsaxa.setText("Please select First polynomial variable then Second.");
					}
			}
		});
		btnC2.setBounds(338, 103, 59, 33);
		btnC2.setForeground(new Color(248, 248, 255));
		btnC2.setBackground(new Color(123, 104, 238));
		contentPane.add(btnC2);
	}
}
