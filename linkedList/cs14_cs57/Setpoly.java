package eg.edu.alexu.csd.datastructure.linkedList.cs14_cs57;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class Setpoly extends JFrame {
	String inputs = new String();
	int[][] arr;
	String[]s;
	private JPanel contentPane;
	private JTextField textField; 
 
	/**
	 * Create the frame.
	 */
	public Setpoly() {
		setTitle(" set polynomial");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 224));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i;
				inputs = textField.getText();
				String[]s = inputs.split("[\\\\)]+");
				String[]s2;
				int [][]arr = new int [s.length][2];
				for(i = 0;i < s.length;i++) {
					s[i] = s[i].replaceAll("\\s", "");
					s[i] = s[i].replaceAll("\\(", "");
					if(i!=0) {
						s[i] = s[i].replaceFirst("," , "");
					}
					s2 = s[i].split(",");
					arr[i][0] = Integer.parseInt(s2[0]);
					arr[i][1] = Integer.parseInt(s2[1]);
				}
				PolynomialSolver.p.setPolynomial('A', arr);
				textField.setText("Polynomial A is set.");
			}
		});
		btnA.setForeground(new Color(248, 248, 255));
		btnA.setBackground(new Color(123, 104, 238));
		btnA.setBounds(41, 60, 72, 40);
		contentPane.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i;
				inputs = textField.getText();
				String[]s = inputs.split("[\\\\)]+");
				String[]s2;
				int [][]arr = new int [s.length][2];
				for(i = 0;i < s.length;i++) {
					s[i] = s[i].replaceAll("\\s", "");
					s[i] = s[i].replaceAll("\\(", "");
					if(i!=0) {
						s[i] = s[i].replaceFirst("," , "");
					}
					s2 = s[i].split(",");
					arr[i][0] = Integer.parseInt(s2[0]);
					arr[i][1] = Integer.parseInt(s2[1]);
				}
				PolynomialSolver.p.setPolynomial('B', arr);
				textField.setText("Polynomial B is set.");
			}
		});
		btnB.setForeground(new Color(248, 248, 255));
		btnB.setBackground(new Color(123, 104, 238));
		btnB.setBounds(163, 60, 72, 40);
		contentPane.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i;
				inputs = textField.getText();
				String[]s = inputs.split("[\\\\)]+");
				String[]s2;
				int [][]arr = new int [s.length][2];
				for(i = 0;i < s.length;i++) {
					s[i] = s[i].replaceAll("\\s", "");
					s[i] = s[i].replaceAll("\\(", "");
					if(i!=0) {
						s[i] = s[i].replaceFirst("," , "");
					}
					s2 = s[i].split(",");
					arr[i][0] = Integer.parseInt(s2[0]);
					arr[i][1] = Integer.parseInt(s2[1]);
				}
				PolynomialSolver.p.setPolynomial('C', arr);
				textField.setText("Polynomial C is set.");
			}
		});
		btnC.setForeground(new Color(248, 248, 255));
		btnC.setBackground(new Color(123, 104, 238));
		btnC.setBounds(280, 60, 72, 40);
		contentPane.add(btnC);
		
		JLabel lblSele = new JLabel("Select the variable name");
		lblSele.setFont(UIManager.getFont("ToolBar.font"));
		lblSele.setForeground(new Color(70, 130, 180));
		lblSele.setBounds(10, 31, 189, 14);
		contentPane.add(lblSele);
		
		textField = new JTextField();
		textField.setBounds(10, 192, 400, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblInsertThePolynomial = new JLabel("Insert the polynomial terms in the form:");
		lblInsertThePolynomial.setFont(UIManager.getFont("ToolBar.font"));
		lblInsertThePolynomial.setForeground(new Color(70, 130, 180));
		lblInsertThePolynomial.setBounds(10, 137, 414, 23);
		contentPane.add(lblInsertThePolynomial);
		
		JLabel lblNewLabel = new JLabel("(coeff1, exponent1), (coeff2, exponent2), ..");
		lblNewLabel.setFont(UIManager.getFont("ToolBar.font"));
		lblNewLabel.setForeground(new Color(70, 130, 180));
		lblNewLabel.setBounds(10, 171, 247, 14);
		contentPane.add(lblNewLabel);
	}
}
