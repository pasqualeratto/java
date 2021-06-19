package esame;

import java.awt.BorderLayout;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;


public class Patente extends JFrame  {

	private JPanel contentPane;
	private ArrayList<Integer> risposte=new ArrayList<Integer>();
	private File f=new File("file.txt");
	private JTextField domanda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Patente frame = new Patente();
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
	public Patente() throws IOException{
		Scanner leggi=new Scanner(f);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1233, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TEST PATENTE VERO O FALSO");
		lblNewLabel.setBounds(113, 11, 205, 14);
		contentPane.add(lblNewLabel);
		
		JButton v = new JButton("VERO");
		v.setBounds(97, 153, 89, 23);
		contentPane.add(v);
		
		JButton f = new JButton("FALSO");
		f.setBounds(229, 153, 89, 23);
		contentPane.add(f);
		
		domanda = new JTextField();
		domanda.setBounds(21, 37, 1096, 105);
		contentPane.add(domanda);
		domanda.setColumns(10);
		domanda.setText(leggi.nextLine());
		
	}
}
