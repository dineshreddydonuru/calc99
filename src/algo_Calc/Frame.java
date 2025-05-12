package algo_Calc;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Frame window = new Frame();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Sortingss obj = new Sortingss();
		frame = new JFrame("Kalkulator Algoritma Pengurutan");
		frame.setBounds(100, 100, 500, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Panel untuk judul
		JPanel titlePanel = new JPanel();
		JLabel titleLabel = new JLabel("KALKULATOR ALGORITMA PENGURUTAN");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
		titlePanel.add(titleLabel);
		
		// Panel untuk tombol-tombol
		JPanel buttonPanel = new JPanel(new GridLayout(3, 2, 20, 20));
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		
		// Tambahkan tombol ke panel
		JButton btnNewButton = new JButton("Bubble Sort");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.vis(1,"BUBBLE SORT");
				frame.setVisible(false);	
			}
		});
		buttonPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Insertion Sort");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.vis(4,"INSERTION SORT");
				frame.setVisible(false);
			}
		});
		buttonPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Selection Sort");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.vis(2,"SELECTION SORT");
				frame.setVisible(false);
			}
		});
		buttonPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Merge Sort");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.vis(5,"MERGE SORT");
				frame.setVisible(false);
			}
		});
		buttonPanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Quick Sort");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.vis(3,"QUICK SORT");
				frame.setVisible(false);
			}
		});
		buttonPanel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Max Heap Sort");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.vis(6,"HEAP SORT");
				frame.setVisible(false);
			}
		});
		buttonPanel.add(btnNewButton_5);
		
		// Mengatur layout utama
		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(titlePanel, BorderLayout.NORTH);
		frame.getContentPane().add(buttonPanel, BorderLayout.CENTER);
	}
}
