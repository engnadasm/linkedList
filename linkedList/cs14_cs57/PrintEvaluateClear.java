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
import javax.swing.DropMode;

@SuppressWarnings("serial")
public class PrintEvaluateClear extends JFrame {
	public static char poly;
	public String s;
	private JPanel contentPane;
	public static JTextField textFieldPrint;
	public static String title;
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public PrintEvaluateClear() {
		setForeground(new Color(255, 255, 224));
		if (PolynomialSolver.flagPrint == 1) {
			title = "Print ";
		}
		else if (PolynomialSolver.flagClear == 1) {
			title = "Clear ";
		}
		setTitle(title + "Polynomial");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 228, 196));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				poly = 'A';
				if (PolynomialSolver.flagPrint == 1) {
					s = new String();
					s = PolynomialSolver.p.print('A');
					textFieldPrint.setText(s);
					PolynomialSolver.flagPrint = 0;
				}
				else if (PolynomialSolver.flagClear == 1) {
					 PolynomialSolver.p.clearPolynomial(poly);
					 s = poly + " is clear";
					 PolynomialSolver.flagClear = 0;
						textFieldPrint.setText(s);
				}
			}
		});
		btnA.setForeground(new Color(248, 248, 255));
		btnA.setBackground(new Color(123, 104, 238));
		btnA.setBounds(22, 60, 72, 40);
		contentPane.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				poly = 'B';
				if (PolynomialSolver.flagPrint == 1) {
					s = PolynomialSolver.p.print(poly);
					textFieldPrint.setText(s);
					PolynomialSolver.flagPrint = 0;
				}
				else if (PolynomialSolver.flagClear == 1) {
					 PolynomialSolver.p.clearPolynomial(poly);
					 s = poly + " is clear";
					 PolynomialSolver.flagClear = 0;
						textFieldPrint.setText(s);
				}
			}
		});
		btnB.setForeground(new Color(248, 248, 255));
		btnB.setBackground(new Color(123, 104, 238));
		btnB.setBounds(134, 60, 72, 40);
		contentPane.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				poly = 'C';
				if (PolynomialSolver.flagPrint == 1) {
					s = PolynomialSolver.p.print(poly);
					textFieldPrint.setText(s); 
					PolynomialSolver.flagPrint = 0;
				}
				else if (PolynomialSolver.flagClear == 1) {
					 PolynomialSolver.p.clearPolynomial(poly);
					 s = poly + " is clear";
					 PolynomialSolver.flagClear = 0;
						textFieldPrint.setText(s);
				}
			}
		});
		btnC.setForeground(new Color(248, 248, 255));
		btnC.setBackground(new Color(123, 104, 238));
		btnC.setBounds(243, 60, 72, 40);
		contentPane.add(btnC);
		
		JButton btnR = new JButton("R");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				poly = 'R';
				if (PolynomialSolver.flagPrint == 1) {
					s = PolynomialSolver.p.print(poly);
					textFieldPrint.setText(s);
					PolynomialSolver.flagPrint = 0;
				}
				else if (PolynomialSolver.flagClear == 1) {
					 PolynomialSolver.p.clearPolynomial(poly);
					 s = poly + " is clear";
					 PolynomialSolver.flagClear = 0;
						textFieldPrint.setText(s);
				}
			}
		});
		btnR.setBounds(339, 60, 63, 40);
		btnR.setForeground(new Color(248, 248, 255));
		btnR.setBackground(new Color(123, 104, 238));
		contentPane.add(btnR);
		
		JLabel lblSele = new JLabel("Select the variable name");
		lblSele.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 12));
		lblSele.setBounds(41, 31, 189, 14);
		contentPane.add(lblSele);
		
		textFieldPrint = new JTextField();
		textFieldPrint.setDropMode(DropMode.INSERT);
		textFieldPrint.setBounds(10, 192, 400, 40);
		contentPane.add(textFieldPrint);
		textFieldPrint.setColumns(10);
		
		JLabel lblInsertThePolynomial = new JLabel(" the value of a polynomial variable:");
		lblInsertThePolynomial.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 12));
		lblInsertThePolynomial.setBounds(20, 128, 414, 53);
		contentPane.add(lblInsertThePolynomial);
	}
}
