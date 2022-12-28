package com.bilgeadam.chat;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class ServerEnd {

	private JFrame frmServer;
	private JTextField textField;
	private static JTextArea textArea;
	private static JLabel lblStatus;
	static ServerSocket server;
	static Socket con;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerEnd window = new ServerEnd();
					window.frmServer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		serverConnection();
	}
	
	private static void serverConnection() throws IOException {
		server = new ServerSocket(8081);
		con = server.accept();
		lblStatus.setText("client bağlandı");
		while(true) {
			try
			{
				DataInputStream input = new DataInputStream(con.getInputStream());
				String string = input.readUTF();
				textArea.setText(textArea.getText() + "\n" +" Client : "+string);
				
			}
			catch(Exception ex) {
				
			}
		}
	}

	/**
	 * Create the application.
	 */
	public ServerEnd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmServer = new JFrame();
		frmServer.setTitle("Server");
		frmServer.setBounds(100, 100, 600, 500);
		frmServer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmServer.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(34, 69, 309, 40);
		frmServer.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnGonder = new JButton("Gönder");
		btnGonder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Lütfen mesaj yazınız");
				}
				else
				{
					textArea.setText(textArea.getText()+ "\n" + "Server : "+textField.getText());
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
		frmServer.getContentPane().add(btnGonder);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 164, 492, 247);
		frmServer.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Comic Sans MS",Font.PLAIN,22));
		textArea.setForeground(new Color(255,255,255));
		textArea.setBackground(new Color(255,0,0));
		scrollPane.setViewportView(textArea);
		
		lblStatus = new JLabel("Status : ");
		lblStatus.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblStatus.setBounds(34, 11, 126, 29);
		frmServer.getContentPane().add(lblStatus);
	    textField.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyPressed(KeyEvent e) {
	            if(e.getKeyCode() == KeyEvent.VK_ENTER){
	            	if(textField.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Lütfen mesaj yazınız");
					}
					else
					{
						textArea.setText(textArea.getText()+ "\n" + "Server : "+textField.getText());
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
	        }

	    });
		
		
	}
	
	
}

