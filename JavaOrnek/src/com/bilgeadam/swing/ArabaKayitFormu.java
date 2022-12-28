package com.bilgeadam.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import com.bilgeadam.constructor2.Araba;
import com.bilgeadam.constructor2.Kapi;
import com.bilgeadam.constructor2.Kasa;
import com.bilgeadam.constructor2.Marka;
import com.bilgeadam.constructor2.Model;
import com.bilgeadam.constructor2.Pencere;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ArabaKayitFormu {

	private JFrame frame;
	private JTextField txtFiyat;
	private JComboBox cmbMarka;
	private JLabel lblSonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArabaKayitFormu window = new ArabaKayitFormu();
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
	public ArabaKayitFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		cmbMarka = new JComboBox();
		cmbMarka.setModel(new DefaultComboBoxModel(new String[] {"Seçiniz", "Bmw", "Mercedes", "Porche"}));
		cmbMarka.setBounds(154, 32, 89, 22);
		frame.getContentPane().add(cmbMarka);
		
		JLabel lblMarka = new JLabel("Marka : ");
		lblMarka.setBounds(39, 36, 46, 14);
		frame.getContentPane().add(lblMarka);
		
		JLabel lblModel = new JLabel("Model : ");
		lblModel.setBounds(39, 83, 46, 14);
		frame.getContentPane().add(lblModel);
		
		JComboBox cmbModel = new JComboBox();
		cmbModel.setModel(new DefaultComboBoxModel(new String[] {"Model Seçiniz", "X5", "XL", "Carrera"}));
		cmbModel.setBounds(154, 79, 89, 22);
		frame.getContentPane().add(cmbModel);
		
		JLabel lblKapi = new JLabel("Kapı : ");
		lblKapi.setBounds(39, 139, 46, 14);
		frame.getContentPane().add(lblKapi);
		
		JComboBox cmbKapi = new JComboBox();
		cmbKapi.setModel(new DefaultComboBoxModel(new String[] {"Seçiniz", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cmbKapi.setBounds(154, 135, 89, 22);
		frame.getContentPane().add(cmbKapi);
		
		JLabel lblPencere = new JLabel("Pencere : ");
		lblPencere.setBounds(39, 195, 82, 14);
		frame.getContentPane().add(lblPencere);
		
		JComboBox cmbPencere = new JComboBox();
		cmbPencere.setModel(new DefaultComboBoxModel(new String[] {"Seçiniz", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cmbPencere.setBounds(155, 191, 88, 22);
		frame.getContentPane().add(cmbPencere);
		
		JLabel lblNewLabel = new JLabel("Kasa : ");
		lblNewLabel.setBounds(39, 262, 61, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox cmbKasa = new JComboBox();
		cmbKasa.setModel(new DefaultComboBoxModel(new String[] {"Seçiniz", "Sedan", "Geniş", "Station"}));
		cmbKasa.setBounds(155, 258, 88, 22);
		frame.getContentPane().add(cmbKasa);
		
		JLabel lblFiyat = new JLabel("Fiyat :");
		lblFiyat.setBounds(39, 313, 46, 14);
		frame.getContentPane().add(lblFiyat);
		
		txtFiyat = new JTextField();
		txtFiyat.setBounds(154, 310, 89, 20);
		frame.getContentPane().add(txtFiyat);
		txtFiyat.setColumns(10);
		
		JButton btnNewButton = new JButton("Sipariş Ver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Marka marka = new Marka(cmbMarka.getSelectedItem().toString());
				Model model = new Model(cmbModel.getSelectedItem().toString());
				Kapi kapi = new Kapi(Integer.valueOf(cmbKapi.getSelectedItem().toString()));
				Pencere pencere = new Pencere(Integer.valueOf(cmbPencere.getSelectedItem().toString()));
				Kasa kasa = new Kasa(marka,model,kapi,pencere,cmbKasa.getSelectedItem().toString());
				Araba araba = new Araba(kasa,Integer.valueOf(txtFiyat.getText()));
				//araba.EkranaYaz();
				lblSonuc.setText(araba.EkranaYaz());
				
			}
		});
		btnNewButton.setBounds(154, 362, 111, 23);
		frame.getContentPane().add(btnNewButton);
		
		lblSonuc = new JLabel("Sonuç : ");
		lblSonuc.setBounds(10, 414, 402, 36);
		frame.getContentPane().add(lblSonuc);
	}
	
}
