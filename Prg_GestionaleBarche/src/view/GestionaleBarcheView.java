package view;

import controller.GestioneBarcheCtrl;

public class GestionaleBarcheView {

	public static void main(String[] args) {
		
		GestioneBarcheCtrl noleggio = new GestioneBarcheCtrl();
		
		noleggio.aggiungiBarca(800, "Olandese volante", 1000, 200);

	}

}
