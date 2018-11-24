package eg.edu.alexu.csd.datastructure.linkedList.cs14_cs57;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Evaluate extends JFrame {
	String input = new String();
	public static char poly;
	private JPanel contentPane;
	private static JTextField textFieldPoint;
	private static JTextField textFieldResult;
    float res;
	/**
	 * Create the frame.
	 */
	public Evaluate() {
		setTitle(" Evaluate polynomial");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				poly = 'A';
			}
		});
		btnA.setForeground(new Color(248, 248, 255));
		btnA.setBackground(new Color(123, 104, 238));
		btnA.setBounds(20, 36, 72, 40);
		contentPane.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				poly = 'B';
			}
		});
		btnB.setForeground(new Color(248, 248, 255));
		btnB.setBackground(new Color(123, 104, 238));
		btnB.setBounds(129, 36, 72, 40);
		contentPane.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				poly = 'C';
			}
		});
		btnC.setForeground(new Color(248, 248, 255));
		btnC.setBackground(new Color(123, 104, 238));
		btnC.setBounds(241, 36, 72, 40);
		contentPane.add(btnC);

		JButton btnR = new JButton("R");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				poly = 'R';
			}
		});
		btnR.setBounds(341, 36, 63, 40);
		btnR.setForeground(new Color(248, 248, 255));
		btnR.setBackground(new Color(123, 104, 238));
		contentPane.add(btnR);
		
		JLabel lblSele = new JLabel("Select the variable name");
		lblSele.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 12));
		lblSele.setBounds(22, 11, 189, 14);
		contentPane.add(lblSele);
		
		textFieldPoint = new JTextField();
		textFieldPoint.setBounds(207, 170, 54, 40);
		contentPane.add(textFieldPoint);
		textFieldPoint.setColumns(10);
		
		JLabel lblInsertPoint= new JLabel("point (X):");
		lblInsertPoint.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 12));
		lblInsertPoint.setBounds(30, 103, 114, 53);
		contentPane.add(lblInsertPoint);
		
		
		textFieldResult = new JTextField();
		textFieldResult.setBounds(207, 112, 54, 36);
		contentPane.add(textFieldResult);
		textFieldResult.setColumns(10);
		JLabel lblResult = new JLabel("The result is ");
		lblResult.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 12));
		lblResult.setBounds(40, 187, 114, 14);
		contentPane.add(lblResult);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input = textFieldResult.getText();
				float num = Float.valueOf(input);
				res = PolynomialSolver.p.evaluatePolynomial(poly, num);
				String reslt = Float.toString(res);
				textFieldPoint.setText(reslt);
			}
		});
		btnEnter.setForeground(new Color(248, 248, 255));
		btnEnter.setBackground(new Color(123, 104, 238));
		btnEnter.setBounds(315, 119, 89, 23);
		contentPane.add(btnEnter);
	}
}
