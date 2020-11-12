package calc;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class CalculatorMain {

	public static CalculatorMain calculator;
	protected JFrame frame;
	protected JLabel answer;
	protected JLabel answerRecord;
	protected JLabel recordLabel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator = new InputedNumberController();
					calculator.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public CalculatorMain() {
		JLabel answer = new JLabel("");
		answer.setName("asdasdsa");
		answerRecord = new JLabel("");
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("calculator");
		frame.getContentPane().setBackground(new Color(188, 188, 188));
		frame.setBackground(new Color(0, 0, 0));
		frame.setSize(446, 700);

		JLabel enSharpLabel = new JLabel("EN#");
		enSharpLabel.setBackground(new Color(0, 191, 255));
		enSharpLabel.setForeground(new Color(135, 206, 235));
		enSharpLabel.setBounds(23, 49, 293, 119);
		frame.getContentPane().add(enSharpLabel);

		answerRecord.setHorizontalAlignment(SwingConstants.RIGHT);
		answerRecord.setBounds(18, 58, 399, 33);
		answerRecord.setBorder(new BevelBorder(BevelBorder.LOWERED));
		frame.getContentPane().add(answerRecord);

		//숫자 1
		JButton buttonNumber1 = new JButton("1");
		buttonNumber1.setForeground(new Color(0, 0, 0));
		buttonNumber1.setBackground(new Color(135, 206, 235));
		buttonNumber1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((InputedNumberController) calculator).NumberActionListener("1");
			}
		});
		buttonNumber1.setBounds(19, 427, 90, 90);
		frame.getContentPane().add(buttonNumber1);

		//숫자 2
		JButton buttonNumber2 = new JButton("2");
		buttonNumber2.setBackground(new Color(0, 0, 0));
		buttonNumber2.setBackground(new Color(135, 206, 235));
		buttonNumber2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((InputedNumberController) calculator).NumberActionListener("2");
			}
		});
		buttonNumber2.setBounds(124, 427, 90, 90);
		frame.getContentPane().add(buttonNumber2);

		//숫자 3
		JButton buttonNumber3 = new JButton("3");
		buttonNumber3.setForeground(new Color(0, 0, 0));
		buttonNumber3.setBackground(new Color(135, 206, 235));
		buttonNumber3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((InputedNumberController) calculator).NumberActionListener("3");
			}
		});
		buttonNumber3.setBounds(229, 427, 90, 90);
		frame.getContentPane().add(buttonNumber3);

		//숫자 4
		JButton buttonNumber4 = new JButton("4");
		buttonNumber4.setForeground(new Color(0, 0, 0));
		buttonNumber4.setBackground(new Color(135, 206, 235));
		buttonNumber4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((InputedNumberController) calculator).NumberActionListener("4");
			}
		});
		buttonNumber4.setBounds(19, 322, 90, 90);
		frame.getContentPane().add(buttonNumber4);

		//숫자 5
		JButton buttonNumber5 = new JButton("5");
		buttonNumber5.setBackground(new Color(0, 0, 0));
		buttonNumber5.setBackground(new Color(135, 206, 235));
		buttonNumber5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((InputedNumberController) calculator).NumberActionListener("5");
			}
		});
		buttonNumber5.setBounds(124, 322, 90, 90);
		frame.getContentPane().add(buttonNumber5);

		//숫자 6
		JButton buttonNumber6 = new JButton("6");
		buttonNumber6.setForeground(new Color(0, 0, 0));
		buttonNumber6.setBackground(new Color(135, 206, 235));
		buttonNumber6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((InputedNumberController) calculator).NumberActionListener("6");
			}
		});
		buttonNumber6.setBounds(229, 322, 90, 90);
		frame.getContentPane().add(buttonNumber6);

		//숫자 7
		JButton buttonNumber7 = new JButton("7");
		buttonNumber7.setForeground(new Color(0, 0, 0));
		buttonNumber7.setBackground(new Color(135, 206, 235));
		buttonNumber7.setBounds(19, 217, 90, 90);
		buttonNumber7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((InputedNumberController) calculator).NumberActionListener("7");
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(buttonNumber7);

		//숫자 8
		JButton buttonNumber8 = new JButton("8");
		buttonNumber8.setForeground(new Color(0, 0, 0));
		buttonNumber8.setBackground(new Color(135, 206, 235));
		buttonNumber8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((InputedNumberController) calculator).NumberActionListener("8");
			}
		});
		buttonNumber8.setBounds(124, 217, 90, 90);
		frame.getContentPane().add(buttonNumber8);

		// 숫자9
		JButton buttonNumber9 = new JButton("9");
		buttonNumber9.setForeground(new Color(0, 0, 0));
		buttonNumber9.setBackground(new Color(135, 206, 235));
		buttonNumber9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((InputedNumberController) calculator).NumberActionListener("9");
			}
		});
		buttonNumber9.setBounds(229, 217, 90, 90);
		frame.getContentPane().add(buttonNumber9);

		//숫자 0
		JButton buttonNumber0 = new JButton("0");
		buttonNumber0.setForeground(new Color(0, 0, 0));
		buttonNumber0.setBackground(new Color(135, 206, 235));
		buttonNumber0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((InputedNumberController) calculator).NumberActionListener("0");
			}
		});
		buttonNumber0.setBounds(124, 532, 90, 90);
		frame.getContentPane().add(buttonNumber0);
		
		//덧셈
		JButton buttonNumberSum = new JButton("+");
		buttonNumberSum.setForeground(new Color(0, 0, 0));
		buttonNumberSum.setBackground(new Color(135, 206, 235));
		buttonNumberSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((InputedNumberController) calculator).OpActionListener("+");
			}
		});
		buttonNumberSum.setBounds(334, 217, 90, 90);
		frame.getContentPane().add(buttonNumberSum);
		
		//뺄셈
		JButton buttonNumberSub = new JButton("-");
		buttonNumberSub.setForeground(new Color(0, 0, 0));
		buttonNumberSub.setBackground(new Color(135, 206, 235));
		buttonNumberSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((InputedNumberController) calculator).OpActionListener("-");
			}
		});
		buttonNumberSub.setBounds(334, 322, 90, 90);
		frame.getContentPane().add(buttonNumberSub);
		
		//곱셈
		JButton buttonNumberMul = new JButton("x");
		buttonNumberMul.setForeground(new Color(0, 0, 0));
		buttonNumberMul.setBackground(new Color(135, 206, 235));
		buttonNumberMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((InputedNumberController) calculator).OpActionListener("*");
			}
		});
		buttonNumberMul.setBounds(334, 427, 90, 90);
		frame.getContentPane().add(buttonNumberMul);
		
		//나눗셈
		JButton buttonNumberDiv = new JButton("÷");
		buttonNumberDiv.setForeground(new Color(0, 0, 0));
		buttonNumberDiv.setBackground(new Color(135, 206, 235));
		buttonNumberDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((InputedNumberController) calculator).OpActionListener("/");
			}
		});
		buttonNumberDiv.setBounds(334, 532, 90, 90);
		frame.getContentPane().add(buttonNumberDiv);
		
		//=
		JButton buttonNumberEqu = new JButton("=");
		buttonNumberEqu.setForeground(new Color(0, 0, 0));
		buttonNumberEqu.setBackground(new Color(135, 206, 235));
		buttonNumberEqu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((InputedNumberController) calculator).EquActionListener();
			}
		});
		buttonNumberEqu.setBounds(229, 112, 195, 90);
		frame.getContentPane().add(buttonNumberEqu);
		
		frame.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent event) {
				char inputedKey = event.getKeyChar();
				int key = event.getKeyCode();

				if (inputedKey >= '0' && inputedKey <= '9') {
					String keyString = "";
					keyString += inputedKey;
					((InputedNumberController) calculator).NumberActionListener(keyString);
				}

				else if (key == KeyEvent.VK_ENTER) {

				}
			}

		});
	}
}