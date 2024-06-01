package calculadora_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculadora extends JFrame {
	// VARIAVEIS

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double numero1;
	double numero2;
	double resultado;
	String operacao;

	private JPanel contentPane;
	private JTextField txtPantalla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(0, 128, 192));
		setTitle("CALCULADORA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 303, 471);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtPantalla = new JTextField();
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPantalla.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		txtPantalla.setBounds(25, 38, 238, 50);
		contentPane.add(txtPantalla);
		txtPantalla.setColumns(10);

		JButton btnLimpar = new JButton("C");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");

			}
		});
		btnLimpar.setForeground(new Color(0, 0, 0));
		btnLimpar.setFont(new Font("Arial", Font.BOLD, 17));
		btnLimpar.setBounds(25, 98, 238, 50);
		contentPane.add(btnLimpar);

		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// SOMA
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");
				;
				operacao = "+";
			}
		});
		btnSoma.setForeground(new Color(0, 0, 0));
		btnSoma.setFont(new Font("Arial", Font.BOLD, 18));
		btnSoma.setBounds(211, 158, 52, 50);
		contentPane.add(btnSoma);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// NUMERO3

				String IngreseNumero = txtPantalla.getText() + btn3.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 18));
		btn3.setBounds(149, 158, 52, 50);
		contentPane.add(btn3);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// NUMERO2

				String IngreseNumero = txtPantalla.getText() + btn2.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 18));
		btn2.setBounds(87, 158, 52, 50);
		contentPane.add(btn2);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// NUMERO 1

				String IngreseNumero = txtPantalla.getText() + btn1.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 18));
		btn1.setBounds(25, 158, 52, 50);
		contentPane.add(btn1);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// NUMERO 4

				String IngreseNumero = txtPantalla.getText() + btn4.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 18));
		btn4.setBounds(25, 218, 52, 50);
		contentPane.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// NUMERO5

				String IngreseNumero = txtPantalla.getText() + btn5.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 18));
		btn5.setBounds(87, 218, 52, 50);
		contentPane.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// NUMERO 6

				String IngreseNumero = txtPantalla.getText() + btn6.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 18));
		btn6.setBounds(149, 218, 52, 50);
		contentPane.add(btn6);

		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// SUBTRAÇÃO

				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");
				;
				operacao = "-";

			}
		});
		btnSub.setForeground(new Color(0, 0, 0));
		btnSub.setFont(new Font("Arial", Font.BOLD, 18));
		btnSub.setBounds(211, 218, 52, 50);
		contentPane.add(btnSub);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// NUMERO 7

				String IngreseNumero = txtPantalla.getText() + btn7.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 18));
		btn7.setBounds(25, 278, 52, 50);
		contentPane.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// NUMERO 8

				String IngreseNumero = txtPantalla.getText() + btn8.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 18));
		btn8.setBounds(87, 278, 52, 50);
		contentPane.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// NUMERO 9

				String IngreseNumero = txtPantalla.getText() + btn9.getText();
				txtPantalla.setText(IngreseNumero);

			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 18));
		btn9.setBounds(149, 278, 52, 50);
		contentPane.add(btn9);

		JButton btnMult = new JButton("x");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// MULTIPLICAÇÃO

				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");
				;
				operacao = "*";
			}
		});
		btnMult.setForeground(new Color(0, 0, 0));
		btnMult.setFont(new Font("Arial", Font.BOLD, 18));
		btnMult.setBounds(211, 278, 52, 50);
		contentPane.add(btnMult);

		JButton btnPonto = new JButton(".");
		btnPonto.setForeground(new Color(0, 0, 0));
		btnPonto.setFont(new Font("Arial", Font.BOLD, 27));
		btnPonto.setBounds(25, 338, 52, 50);
		contentPane.add(btnPonto);

		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// NUMERO ZERO

				String IngreseNumero = txtPantalla.getText() + btnZero.getText();
				txtPantalla.setText(IngreseNumero);
			}
		});
		btnZero.setFont(new Font("Arial", Font.BOLD, 18));
		btnZero.setBounds(87, 338, 52, 50);
		contentPane.add(btnZero);

		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecionar;
				numero2 = Double.parseDouble(txtPantalla.getText());

				if (operacao == "+") {
					resultado = numero1 + numero2;

					selecionar = String.format("%.0f", resultado);
					txtPantalla.setText(selecionar);

				}

				else if (operacao == "-") {
					resultado = numero1 - numero2;

					selecionar = String.format("%.0f", resultado);
					txtPantalla.setText(selecionar);

				}

				else if (operacao == "*") {
					resultado = numero1 * numero2;

					selecionar = String.format("%.0f", resultado);
					txtPantalla.setText(selecionar);
				} else if (operacao == "/") {
					resultado = numero1 / numero2;

					selecionar = String.format("%.2f", resultado);
					txtPantalla.setText(selecionar);
				}
			}
		});
		btnIgual.setForeground(new Color(0, 0, 0));
		btnIgual.setFont(new Font("Arial", Font.BOLD, 18));
		btnIgual.setBounds(149, 338, 52, 50);
		contentPane.add(btnIgual);

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DIVISÃO
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");
				;
				operacao = "/";
			}
		});
		btnDiv.setForeground(new Color(0, 0, 0));
		btnDiv.setFont(new Font("Arial", Font.BOLD, 18));
		btnDiv.setBounds(211, 338, 52, 50);
		contentPane.add(btnDiv);
	}
}