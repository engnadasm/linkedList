package eg.edu.alexu.csd.datastructure.linkedList.cs14_cs57;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PolynomialSolver {
	private JFrame frmPolynomialSolver; 
	public static Polynomial p = new Polynomial();
	public static int flagAdd = 0;
	public static int flagSub = 0;
	public static int flagMulti = 0;
	public static int flagPrint = 0;
	public static int flagClear = 0;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public PolynomialSolver() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPolynomialSolver = new JFrame();
		frmPolynomialSolver.setTitle("Polynomial Solver");
		frmPolynomialSolver.getContentPane().setBackground(new Color(245, 245, 220));
		frmPolynomialSolver.setBounds(100, 100, 450, 300);
		frmPolynomialSolver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPolynomialSolver.getContentPane().setLayout(null);
		
		JButton btnSetAPolynomial = new JButton("Set a polynomial variable");
		btnSetAPolynomial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Setpoly set = new Setpoly();
				frmPolynomialSolver.setVisible(true);
				set.setVisible(true);
			}
		});
		btnSetAPolynomial.setForeground(new Color(248, 248, 255));
		btnSetAPolynomial.setBackground(new Color(123, 104, 238));
		btnSetAPolynomial.setBounds(0, 0, 255, 42);
		frmPolynomialSolver.getContentPane().add(btnSetAPolynomial);
		
		JButton btnPrintTheValue = new JButton("Print the value of a polynomial variable");
		btnPrintTheValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				flagPrint = 1;
				PrintEvaluateClear print = new PrintEvaluateClear();
				frmPolynomialSolver.setVisible(true);
				print.setVisible(true);
			}
		});
		btnPrintTheValue.setForeground(new Color(248, 248, 255));
		btnPrintTheValue.setBackground(new Color(123, 104, 238));
		btnPrintTheValue.setBounds(0, 38, 255, 42);
		frmPolynomialSolver.getContentPane().add(btnPrintTheValue);
		
		JButton btnAddTwoPolynomials = new JButton("Add two polynomials");
		btnAddTwoPolynomials.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				flagAdd = 1;
				AddSubtractMultiply add = new AddSubtractMultiply();
				frmPolynomialSolver.setVisible(true);
				add.setVisible(true);
			}
		});
		btnAddTwoPolynomials.setForeground(new Color(248, 248, 255));
		btnAddTwoPolynomials.setBackground(new Color(123, 104, 238));
		btnAddTwoPolynomials.setBounds(0, 74, 255, 42);
		frmPolynomialSolver.getContentPane().add(btnAddTwoPolynomials);
		
		JButton btnSubtractTwoPolynomials = new JButton("Subtract two polynomials");
		btnSubtractTwoPolynomials.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				flagSub = 1;
				AddSubtractMultiply sub = new AddSubtractMultiply();
				frmPolynomialSolver.setVisible(true);
				sub.setVisible(true);
			}
		});
		btnSubtractTwoPolynomials.setForeground(new Color(248, 248, 255));
		btnSubtractTwoPolynomials.setBackground(new Color(123, 104, 238));
		btnSubtractTwoPolynomials.setBounds(0, 115, 255, 42);
		frmPolynomialSolver.getContentPane().add(btnSubtractTwoPolynomials);
		
		JButton btnMultiplyTwoPolynomials = new JButton("Multiply two polynomials");
		btnMultiplyTwoPolynomials.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				flagMulti = 1;
				AddSubtractMultiply multi = new AddSubtractMultiply();
				frmPolynomialSolver.setVisible(true);
				multi.setVisible(true);
			}
		});
		btnMultiplyTwoPolynomials.setForeground(new Color(248, 248, 255));
		btnMultiplyTwoPolynomials.setBackground(new Color(123, 104, 238));
		btnMultiplyTwoPolynomials.setBounds(0, 151, 255, 42);
		frmPolynomialSolver.getContentPane().add(btnMultiplyTwoPolynomials);
		
		JButton btnEvaluateAPolynomial = new JButton("Evaluate a polynomial at some point");
		btnEvaluateAPolynomial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Evaluate evaluate = new Evaluate();
				frmPolynomialSolver.setVisible(true);
				evaluate.setVisible(true);
			}
		});
		btnEvaluateAPolynomial.setForeground(new Color(248, 248, 255));
		btnEvaluateAPolynomial.setBackground(new Color(123, 104, 238));
		btnEvaluateAPolynomial.setBounds(0, 187, 255, 35);
		frmPolynomialSolver.getContentPane().add(btnEvaluateAPolynomial);
		
		JButton btnClearAPolynomial = new JButton(" Clear a polynomial variable");
		btnClearAPolynomial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				flagClear = 1;
				PrintEvaluateClear clear = new PrintEvaluateClear();
				frmPolynomialSolver.setVisible(true);
				clear.setVisible(true);
			}
		});
		btnClearAPolynomial.setForeground(new Color(248, 248, 255));
		btnClearAPolynomial.setBackground(new Color(123, 104, 238));
		btnClearAPolynomial.setBounds(0, 220, 255, 42);
		frmPolynomialSolver.getContentPane().add(btnClearAPolynomial);
	}
}
