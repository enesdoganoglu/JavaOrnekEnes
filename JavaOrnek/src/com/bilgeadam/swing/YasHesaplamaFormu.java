package com.bilgeadam.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import com.bilgeadam.oop.Insan;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class YasHesaplamaFormu {

	private JFrame frame;
	private JTextField txtDogumYili;
	private JLabel lblSonuc; //global bir değişken 
	private Insan i;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YasHesaplamaFormu window = new YasHesaplamaFormu();
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
	public YasHesaplamaFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();// nesneye dönüştürülüyor
		frame.setBounds(100, 100, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Doğum Yılınız : ");
		lblNewLabel.setBounds(53, 131, 125, 33);
		frame.getContentPane().add(lblNewLabel);
		
		txtDogumYili = new JTextField();
		txtDogumYili.setBounds(188, 134, 125, 27);
		frame.getContentPane().add(txtDogumYili);
		txtDogumYili.setColumns(10);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Textfield lardaki
				//getText() metodu bana String bir veri getirir
				i = new Insan();
				int dogumYili = Integer.valueOf(txtDogumYili.getText());
				int gelenYas = i.YasHesapla(dogumYili);
				
				lblSonuc.setText("Yaşınız : "+gelenYas);
			}
		});
		btnHesapla.setBounds(219, 196, 89, 23);
		frame.getContentPane().add(btnHesapla);
		
		lblSonuc = new JLabel("Sonuç : ");
		lblSonuc.setBounds(53, 263, 194, 27);
		frame.getContentPane().add(lblSonuc);
	}
}
