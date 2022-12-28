package com.bilgeadam.odeme;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ödeme Yöntemi: ");
		lblNewLabel.setBounds(57, 69, 96, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox cmbOdemeTipleri = new JComboBox();
		cmbOdemeTipleri.setModel(new DefaultComboBoxModel(new String[] {"Seçiniz", "Kredi Kartı", "Havale EFT"}));
		cmbOdemeTipleri.setBounds(199, 70, 77, 22);
		frame.getContentPane().add(cmbOdemeTipleri);
		
		JLabel lblNewLabel_1 = new JLabel("Tutar : ");
		lblNewLabel_1.setBounds(57, 116, 96, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtTutar = new JTextField();
		txtTutar.setBounds(199, 113, 86, 20);
		frame.getContentPane().add(txtTutar);
		txtTutar.setColumns(10);
		
		JButton btnOdemeYap = new JButton("Ödeme Yap");
		btnOdemeYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cmbOdemeTipleri.getSelectedItem().toString() == "Kredi Kartı")
				{
					KrediKarti krediKarti= new KrediKarti();
					OdemeIslemi odemeIslemi = new OdemeIslemi(krediKarti);
				    odemeIslemi.Ode(Double.valueOf(txtTutar.getText()));
				}
			}
		});
		btnOdemeYap.setBounds(179, 169, 120, 23);
		frame.getContentPane().add(btnOdemeYap);
	}

}
