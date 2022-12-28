package com.bilgeadam.swing2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogForm {

	private JFrame frame;
	private JTextField txtHata;
	private JLabel lblSonuc;
	private ILog iLog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogForm window = new LogForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogTipi = new JLabel("Log Tipi : ");
		lblLogTipi.setBounds(31, 38, 77, 14);
		frame.getContentPane().add(lblLogTipi);
		
		JComboBox cmbLogTipi = new JComboBox();
		cmbLogTipi.setModel(new DefaultComboBoxModel(new String[] {"Seçiniz", "DbLog", "XmlLog", "TextLog"}));
		cmbLogTipi.setBounds(161, 34, 95, 22);
		frame.getContentPane().add(cmbLogTipi);
		
		JLabel lblHataTipi = new JLabel("Hata Tipi : ");
		lblHataTipi.setBounds(31, 80, 77, 14);
		frame.getContentPane().add(lblHataTipi);
		
		txtHata = new JTextField();
		txtHata.setBounds(161, 77, 95, 20);
		frame.getContentPane().add(txtHata);
		txtHata.setColumns(10);
		
		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		String secilenLogTipi = cmbLogTipi.getSelectedItem().toString();
		 Logger logger;
		 
		 LogFactory logFactory = new LogFactory();
		 iLog = logFactory.create(secilenLogTipi);
		 logger = new Logger(iLog);
		 lblSonuc.setText(logger.Log(txtHata.getText()));

		}
		});
		btnKaydet.setBounds(167, 127, 89, 23);
		frame.getContentPane().add(btnKaydet);
		
		lblSonuc = new JLabel("Sonuç : ");
		lblSonuc.setBounds(10, 205, 303, 22);
		frame.getContentPane().add(lblSonuc);
	}

}
