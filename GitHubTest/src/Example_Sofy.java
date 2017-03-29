import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Example_Sofy extends JFrame {
	private JPanel contentPane;
	
	
	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.println("I know, cliche");
	
		System.out.println(" quiero salir"
				+ "Quiero weekend! T.T");
		
		System.out.println(" i made a mistake");
	
	Example_Sofy frame = new Example_Sofy();
	frame.setVisible(true);
	
	}
	public Example_Sofy() {

	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	//this.setResizable(false);
	setBounds(100, 100, 653, 400);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	
	}
	}

