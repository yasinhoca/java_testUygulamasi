package testProgramý;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class form1 extends JFrame {

	private JPanel contentPane;
	int i = 0;
	int cevap = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form1 frame = new form1();
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
	public form1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 463);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 10, 686, 139);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblsoru = new JLabel("New label");
		lblsoru.setHorizontalAlignment(SwingConstants.CENTER);
		lblsoru.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblsoru.setBounds(10, 10, 666, 119);
		panel.add(lblsoru);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 166, 686, 168);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton ar = new JRadioButton("New radio button");
		
		ar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ar.setBounds(6, 6, 674, 21);
		panel_1.add(ar);
		
		JRadioButton br = new JRadioButton("New radio button");
		br.setFont(new Font("Tahoma", Font.PLAIN, 18));
		br.setBounds(6, 46, 674, 21);
		panel_1.add(br);
		
		JRadioButton cr = new JRadioButton("New radio button");
		cr.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cr.setBounds(6, 93, 674, 21);
		panel_1.add(cr);
		
		JRadioButton dr = new JRadioButton("New radio button");
		dr.setFont(new Font("Tahoma", Font.PLAIN, 18));
		dr.setBounds(6, 141, 674, 21);
		panel_1.add(dr);
		
		JButton ilerib = new JButton("SONRAK\u0130");
		
		ilerib.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ilerib.setBounds(556, 361, 140, 31);
		contentPane.add(ilerib);
		
		JButton gerib = new JButton("\u00D6NCEK\u0130");
		
		gerib.setFont(new Font("Tahoma", Font.PLAIN, 18));
		gerib.setBounds(10, 361, 140, 31);
		contentPane.add(gerib);
		i = 0;
		Sorular s = new Sorular();
		ButtonGroup bg = new ButtonGroup();
		bg.add(ar);
		bg.add(br);
		bg.add(cr);
		bg.add(dr);
		
		
		lblsoru.setText(s.sorular[i]);
		ar.setText(s.sorular[i+1]);
		br.setText(s.sorular[i+2]);
		cr.setText(s.sorular[i+3]);
		dr.setText(s.sorular[i+4]);
		
		JButton cbutton = new JButton("CEVAPLA");
		
		
		cbutton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbutton.setBounds(273, 361, 152, 29);
		contentPane.add(cbutton);
		
		ilerib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i<4) {
					i++;
					lblsoru.setText(s.sorular[i*5]);
					ar.setText(s.sorular[i*5+1]);
					br.setText(s.sorular[i*5+2]);
					cr.setText(s.sorular[i*5+3]);
					dr.setText(s.sorular[i*5+4]);
					cbutton.setText("CEVAPLA");
					cbutton.setForeground(Color.black);
				}
			}
		});
		
		gerib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i>0) {
					i--;
					lblsoru.setText(s.sorular[i*5]);
					ar.setText(s.sorular[i*5+1]);
					br.setText(s.sorular[i*5+2]);
					cr.setText(s.sorular[i*5+3]);
					dr.setText(s.sorular[i*5+4]);
					cbutton.setText("CEVAPLA");
					cbutton.setForeground(Color.black);
				}
			}
		});
		
		
		
		
		cbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(ar.isSelected()) cevap = 1;
				else if(br.isSelected()) cevap = 2;
				else if(cr.isSelected()) cevap = 3;
				else if(dr.isSelected()) cevap = 4;
				
				if(cevap==s.cevaplar[i]) {
					cbutton.setText("DOÐRU");
					cbutton.setForeground(Color.GREEN);
				} else {
					cbutton.setText("YANLIÞ");
					cbutton.setForeground(Color.RED);
				}
			}
		});
		
		
	}
}
