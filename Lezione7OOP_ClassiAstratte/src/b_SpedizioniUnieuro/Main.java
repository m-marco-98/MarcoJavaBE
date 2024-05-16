package b_SpedizioniUnieuro;

public class Main {

	public static void main(String[] args) {
		
	    Frigorifero frigo1 = new Frigorifero();
		
		frigo1.setId(1);
		frigo1.setNome("CocaCola");
		frigo1.setPrezzo(200);
		frigo1.setClasseEnergetica("A");
		frigo1.setNumeroAnte(2);
		frigo1.setDescrizione("è bello");
				
		System.out.println(frigo1.toString());
	}

}