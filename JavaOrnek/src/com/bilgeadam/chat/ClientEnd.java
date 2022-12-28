package com.bilgeadam.chat;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ClientEnd {

	private JFrame frmClient;
	private JTextField textField;
	private static JTextArea textArea;
	//DataInputStream input;
	DataOutputStream output;
	private static Socket con;
	
	public static void main(String[] args)  throws IOException{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientEnd window = new ClientEnd();
					window.frmClient.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		clientConnection();
	}

	private static void clientConnection() throws IOException {
		con = new Socket("127.0.0.1",8081);
		while(true) {
			try {
				DataInputStream input = new DataInputStream(con.getInputStream());
				String string = input.readUTF();  //ascii
				
				textArea.setText(textArea.getText() + "\n" +" Server : "+string);
				
			}
			catch(Exception ex) {
				
			}
		}
	}
	/**
	 * Create the application.
	 */
	public ClientEnd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClient = new JFrame();
		frmClient.setTitle("Client");
		frmClient.setBounds(100, 100, 600, 500);
		frmClient.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClient.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(34, 69, 309, 40);
		frmClient.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnGonder = new JButton("Gönder");
		btnGonder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Lütfen mesaj yazınız");
				}
				else
				{
					
					textArea.setText(textArea.getText()+ "\n" +  "Client : "+textField.getText());
					
					
					try {
						DataOutputStream output = new DataOutputStream(con.getOutputStream());
						output.writeUTF(textField.getText());
						textField.setText("");
						
					}
					catch(IOException ex) {
						try {
							Thread.sleep(2000);
							System.exit(0);
						}
						catch(InterruptedException ex2) {
							ex2.getMessage();
						}
					}
				}
			}
		});
		btnGonder.setBounds(390, 71, 121, 37);
		frmClient.getContentPane().add(btnGonder);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 164, 492, 247);
		frmClient.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Comic Sans MS",Font.PLAIN,22));
		textArea.setForeground(new Color(255,255,255));
		textArea.setBackground(new Color(0,0,255));
		scrollPane.setViewportView(textArea);
	}
}
