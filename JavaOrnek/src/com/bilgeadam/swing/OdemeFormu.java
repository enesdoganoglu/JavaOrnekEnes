package com.bilgeadam.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OdemeFormu {

	private JFrame frame;
	private JTextField txtTutar;
	private JLabel lblSonuc;
	private OdemeIslemi odemeIslemi;
	private KrediKarti krediKarti;
	private MailOrder mailOrder;
	private OdemeIslemiFactory odemeIslemiFactory;
    private IOdemeTipi iOdemeTipi;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OdemeFormu window = new OdemeFormu();
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
	public OdemeFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ödeme Yöntemi : ");
		lblNewLabel.setBounds(23, 34, 94, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox cmbOdemeYontemi = new JComboBox();
		cmbOdemeYontemi.setModel(new DefaultComboBoxModel(new String[] {"Seçiniz", "KrediKarti", "MailOrder", "CoinOdeme"}));
		cmbOdemeYontemi.setBounds(160, 33, 111, 22);
		frame.getContentPane().add(cmbOdemeYontemi);
		
		JLabel lblNewLabel_1 = new JLabel("Tutar : ");
		lblNewLabel_1.setBounds(23, 76, 78, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtTutar = new JTextField();
		txtTutar.setBounds(160, 73, 111, 20);
		frame.getContentPane().add(txtTutar);
		txtTutar.setColumns(10);
		
		JButton btnOdemeYap = new JButton("Ödeme Yap");
		btnOdemeYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			   odemeIslemiFactory = new OdemeIslemiFactory();
			   try
			   {
			   iOdemeTipi = odemeIslemiFactory.create(cmbOdemeYontemi.getSelectedItem().toString());
			      odemeIslemi = new OdemeIslemi(iOdemeTipi);
			      lblSonuc.setText(odemeIslemi.Ode(Double.valueOf(txtTutar.getText())));
			   }
			   catch(Exception ex)
			   {
				   ex.getStackTrace();
			   }
			   

			}
		});
		btnOdemeYap.setBounds(160, 117, 111, 23);
		frame.getContentPane().add(btnOdemeYap);
		
		lblSonuc = new JLabel("Sonuç : ");
		lblSonuc.setBounds(10, 191, 271, 22);
		frame.getContentPane().add(lblSonuc);
	}
	
	

}
