package view;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Main {
	
	public static void main(String args[]) {
		
	RedesController RController = new RedesController ();
	
	int opc = 0;
	do {
	opc = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n\n 1- Chamada do método ip\n 2 - chamadas do método ping\n 9 - fim"));
	switch(opc) {

	case 1: 
		RController.readProcess();
		break;
	case 2:
		RController.readping();
		break;
	case 9: 
		JOptionPane.showInputDialog(null, "FIM");
		break;
		default:
			JOptionPane.showInputDialog(null, "Opção Invalida!, digite 1,2 ou 9");		
	}
	}
	while(opc!= 9);
}
}

		


