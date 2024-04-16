package OOP_tester;

import OOP_model.Bicicletta;

public class BiciclettaTester {

	public static void main(String[] args) {
		
		Bicicletta bici1 = new Bicicletta("Cannondale", "c-bike", (byte) 2, 21);
		
		System.out.println(bici1.toString());
		
		bici1.accelera(200);
		bici1.accelera(100);
		bici1.rallenta(60);
		
		System.out.println(bici1.toString());
		
		bici1.calcolaVelocitaMax();
		System.out.println(bici1.toString());
		
		System.out.println("ALTRA BICICLETTA");
		
		Bicicletta bici2 = new Bicicletta("Bianchi", "Bartali", (byte)2, 10);		
		System.out.println(bici2.toString());
		bici2.accelera(800);
		System.out.println(bici2.toString());

	}

}
