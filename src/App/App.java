package App;

import java.awt.Container;

import javax.swing.JPanel;

import button.Botao;

public class App {

	public static void main(String[] args) {
		Container frame = new Container();

		JPanel painel = new JPanel();
		Botao jButton = new Botao();	
		
		frame.add(painel);
		
		painel.add(jButton);

	}

}
