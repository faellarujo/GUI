import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Container extends JFrame {

	
	public Container() {

		setTitle("Container Principal"); // Define o título da janela
		setSize(700, 300); // Define o tamanho da janela (largura x altura)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define o comportamento padrão ao fechar a janela
		setLocationRelativeTo(null);
		setVisible(true);
		// Aqui você pode adicionar outros componentes à janela, como botões, rótulos,
		// etc.

	}	

}
