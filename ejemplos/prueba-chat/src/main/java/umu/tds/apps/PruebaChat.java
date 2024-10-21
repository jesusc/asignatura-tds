package umu.tds.apps;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import tds.BubbleText;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;

public class PruebaChat {

	private JFrame frame;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaChat window = new PruebaChat();
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
	public PruebaChat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setSize(400,700);
		panel.setMinimumSize(new Dimension(400,700));
		panel.setMaximumSize(new Dimension(400,700));
		panel.setPreferredSize(new Dimension(400,700));
		
		inicializarChat(panel);
		frame.getContentPane().add(panel, BorderLayout.CENTER);

	}

	private void inicializarChat(JPanel panelChat) {
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		BubbleText burbuja = new BubbleText(panelChat, "Hola grupo!!", Color.GREEN, "J.Ramón", BubbleText.SENT);
		panelChat.add(burbuja);

		BubbleText burbuja2 = new BubbleText(panelChat, "Hola!", Color.LIGHT_GRAY, "Jesús", BubbleText.RECEIVED);
		panelChat.add(burbuja2);

	}

}
