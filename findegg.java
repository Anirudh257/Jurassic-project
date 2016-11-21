import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.lang.Math;

public class findegg extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Score_field;
	static int score = 0;
	Random rand = new Random();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					findegg frame = new findegg();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private JTextField timer;
	int counter = 1;
	
	/**
	 * Create the frame.
	 */
	public findegg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Score");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(249, 36, 63, 30);
		contentPane.add(lblNewLabel);
		
		//to generate random number
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rand1 = rand.nextInt(50);
				int flag = 0;
				for( int i = 1; i < Math.sqrt(rand1); i++ )
					{	
						if( rand1%i == 0)
						flag = 1;
					}
				if(flag == 0)
				{
					score++;
				}
				Score_field.setText(Integer.toString(score));
				timer.setText(Integer.toString(counter));
			}
		});
		button_1.setBounds(51, 95, 89, 23);
		contentPane.add(button_1);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rand2 = rand.nextInt(50);
				int flag = 0;
				for( int i = 1; i < Math.sqrt(rand2); i++ )
					{	
						if( rand2%i == 0)
						flag = 1;
					}
				if(flag == 0)
				{
					score++;
				}
				Score_field.setText(Integer.toString(score));
				timer.setText(Integer.toString(counter));
			}
		});
		button_4.setBounds(248, 95, 89, 23);
		contentPane.add(button_4);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rand3 = rand.nextInt(50);
				int flag = 0;
				for( int i = 1; i < Math.sqrt(rand3); i++ )
					{	
						if( rand3%i == 0)
						flag = 1;
					}
				if(flag == 0)
				{
					score++;
				}
					Score_field.setText(Integer.toString(score));
					timer.setText(Integer.toString(counter));
				}
		});
		button_2.setBounds(51, 140, 89, 23);
		contentPane.add(button_2);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int rand5 = rand.nextInt(50);
			int flag = 0;
			for( int i = 1; i < Math.sqrt(rand5); i++ )
				{	
					if( rand5%i == 0)
					flag = 1;
				}
			if(flag == 0)
			{
				score++;
			}
				Score_field.setText(Integer.toString(score));
				counter++;
				timer.setText(Integer.toString(counter));
			}
	});
		button_5.setBounds(248, 140, 89, 23);
		contentPane.add(button_5);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rand3 = rand.nextInt(50);
				int flag = 0;
				for( int i = 1; i < Math.sqrt(rand3); i++ )
					{	
						if( rand3%i == 0)
						flag = 1;
					}
				if(flag == 0)
				{
					score++;
				}
					Score_field.setText(Integer.toString(score));
					counter++;
					timer.setText(Integer.toString(counter));
				}
		});
		button_3.setBounds(51, 183, 89, 23);
		contentPane.add(button_3);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rand6 = rand.nextInt(50);
				int flag = 0;
				for( int i = 1; i < Math.sqrt(rand6); i++ )
					{	
						if( rand6%i == 0)
						flag = 1;
					}
				if(flag == 0)
				{
					score++;
				}
				//	JOptionPane.showMessageDialog(this, "Haha, didn't find the egg");
				//	new click().setVisible(true) ;
					Score_field.setText(Integer.toString(score));
					counter++;
					timer.setText(Integer.toString(counter));
				//	System.exit(100000);
				}
		});
		button_6.setBounds(248, 183, 89, 23);
		contentPane.add(button_6);
		
		Score_field = new JTextField();
		Score_field.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Score_field.setBounds(322, 36, 86, 35);
		contentPane.add(Score_field);
		Score_field.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Find the egg");
		lblNewLabel_1.setForeground(Color.MAGENTA);
		lblNewLabel_1.setBackground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		lblNewLabel_1.setBounds(113, 21, 114, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblTimer = new JLabel("Timer");
		lblTimer.setForeground(Color.RED);
		lblTimer.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblTimer.setBounds(10, 11, 63, 23);
		contentPane.add(lblTimer);
		
		timer = new JTextField();
		timer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(counter == 10 )
				{
					JOptionPane.showMessageDialog(null, "The game is over");
					System.exit(score);
				}
				
			}
		});
		timer.setBounds(83, 11, 37, 23);
		contentPane.add(timer);
		timer.setColumns(10);
		//Image img = new ImageIcon(this.getClass().getResource("/dino_img1.png")).getImage();
	}
}
