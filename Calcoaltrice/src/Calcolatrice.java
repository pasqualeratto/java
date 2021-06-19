import java.io.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calcolatrice extends JFrame {

	private JPanel contentPane;
	private JTextField risultato;
	private File f=new File("file.txt");
	private String Stringa="";
	private float tot;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcolatrice frame = new Calcolatrice();
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
	public Calcolatrice() throws IOException{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		risultato = new JTextField();
		risultato.setBounds(20, 36, 318, 20);
		contentPane.add(risultato);
		risultato.setColumns(10);
		
		JButton uno = new JButton("1");
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stringa+="1";
				risultato.setText(Stringa);
			}
		});
		uno.setBounds(20, 219, 89, 23);
		contentPane.add(uno);
		
		JButton quattro = new JButton("4");
		quattro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stringa+="4";
				risultato.setText(Stringa);
			}
		});
		quattro.setBounds(20, 165, 89, 23);
		contentPane.add(quattro);
		
		JButton sette = new JButton("7");
		sette.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stringa+="7";
				risultato.setText(Stringa);
			}
		});
		sette.setBounds(20, 103, 89, 23);
		contentPane.add(sette);
		
		JButton otto = new JButton("8");
		otto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stringa+="8";
				risultato.setText(Stringa);
			}
		});
		otto.setBounds(135, 103, 89, 23);
		contentPane.add(otto);
		
		JButton nove = new JButton("9");
		nove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stringa+="9";
				risultato.setText(Stringa);
			}
		});
		nove.setBounds(249, 103, 89, 23);
		contentPane.add(nove);
		
		JButton cinque = new JButton("5");
		cinque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stringa+="5";
				risultato.setText(Stringa);
			}
		});
		cinque.setBounds(135, 165, 89, 23);
		contentPane.add(cinque);
		
		JButton due = new JButton("2");
		due.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stringa+="2";
				risultato.setText(Stringa);
			}
		});
		due.setBounds(135, 219, 89, 23);
		contentPane.add(due);
		
		JButton sei = new JButton("6");
		sei.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stringa+="6";
				risultato.setText(Stringa);
			}
		});
		sei.setBounds(249, 165, 89, 23);
		contentPane.add(sei);
		
		JButton tre = new JButton("3");
		tre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stringa+="3";
				risultato.setText(Stringa);
			}
		});
		tre.setBounds(249, 219, 89, 23);
		contentPane.add(tre);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stringa+="0";
				risultato.setText(Stringa);
			}
		});
		zero.setBounds(20, 270, 89, 23);
		contentPane.add(zero);
		
		JButton somma = new JButton("+");
		somma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stringa+=" + ";
				risultato.setText(Stringa);
			}
		});
		somma.setBounds(358, 103, 89, 23);
		contentPane.add(somma);
		
		JButton differenza = new JButton("-");
		differenza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stringa+=" - ";
				risultato.setText(Stringa);
			}
		});
		differenza.setBounds(358, 165, 89, 23);
		contentPane.add(differenza);
		
		JButton prodotto = new JButton("*");
		prodotto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stringa+=" * ";
				risultato.setText(Stringa);
			}
		});
		prodotto.setEnabled(true);
		prodotto.setBounds(358, 219, 89, 23);
		contentPane.add(prodotto);
		
		JButton quoziente = new JButton("/");
		quoziente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stringa+=" / ";
				risultato.setText(Stringa);
			}
		});
		quoziente.setBounds(358, 270, 89, 23);
		contentPane.add(quoziente);
		
		JButton percentuale = new JButton("%");
		percentuale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stringa+=" % ";
				risultato.setText(Stringa);
			}
		});
		percentuale.setBounds(249, 270, 89, 23);
		contentPane.add(percentuale);
		
		JButton esegui = new JButton("=");
		esegui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				
				String[] valori=Stringa.split(" ");
				if(valori[1].equals("+")) {
					tot=Integer.parseInt(valori[0])+Integer.parseInt(valori[2]);
					risultato.setText(String.valueOf(tot));
					try {
						FileWriter scrivi=new FileWriter(f,true);
						scrivi.write(Stringa+"="+String.valueOf(tot)+"\n");
						scrivi.close();
					}catch(Exception a) {
						System.out.println("Errore nella scrittura del file");
					}
					Stringa="";
				}else if(valori[1].equals("-")) {
					tot=Integer.parseInt(valori[0])-Integer.parseInt(valori[2]);
					risultato.setText(String.valueOf(tot));
					try {
						FileWriter scrivi=new FileWriter(f,true);
						scrivi.write(Stringa+"="+String.valueOf(tot)+"\n");
						scrivi.close();
					}catch(Exception a) {
						System.out.println("Errore nella scrittura del file");
					}
					Stringa="";
					
				}else if(valori[1].equals("*")) {
					tot=Integer.parseInt(valori[0])*Integer.parseInt(valori[2]);
					risultato.setText(String.valueOf(tot));
					try {
						FileWriter scrivi=new FileWriter(f,true);
						scrivi.write(Stringa+"="+String.valueOf(tot)+"\n");
						scrivi.close();
					}catch(Exception a) {
						System.out.println("Errore nella scrittura del file");
					}
					Stringa="";
				}else if(valori[1].equals("/")) {
					tot=Integer.parseInt(valori[0])/Integer.parseInt(valori[2]);
					risultato.setText(String.valueOf(tot));
					try {
						FileWriter scrivi=new FileWriter(f,true);
						scrivi.write(Stringa+"="+String.valueOf(tot)+"\n");
						scrivi.close();
					}catch(Exception a) {
						System.out.println("Errore nella scrittura del file");
					}
					Stringa="";
				}else if(valori[1].equals("%")) {
					tot=Integer.parseInt(valori[0])/100*Integer.parseInt(valori[2]);
					risultato.setText(String.valueOf(tot));
					try {
						FileWriter scrivi=new FileWriter(f,true);
						scrivi.write(Stringa+"="+String.valueOf(tot)+"\n");
						scrivi.close();
					}catch(Exception a) {
						System.out.println("Errore nella scrittura del file");
					}
					Stringa="";
					
				}
			}
		});
		esegui.setBounds(135, 270, 89, 23);
		contentPane.add(esegui);
		
		
	}
}