package com.bilgeadam.io;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Abc {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Abc window = new Abc();
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
	public Abc() {
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
		
		JLabel lblSeciliDosya = new JLabel("Seçili Dosya : ");
		lblSeciliDosya.setBounds(44, 50, 156, 33);
		frame.getContentPane().add(lblSeciliDosya);
		
		JButton btnNewButton = new JButton("Dosya Seç");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				int option = fileChooser.showOpenDialog(frame);
				if(option == JFileChooser.APPROVE_OPTION)
				{
					File file = fileChooser.getSelectedFile();
					lblSeciliDosya.setText("Seçili Dosya : "+file.getName());
					
				}
			
			}
		});
		btnNewButton.setBounds(221, 55, 173, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
