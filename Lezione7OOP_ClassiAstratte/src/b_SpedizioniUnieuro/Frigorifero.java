package b_SpedizioniUnieuro;

public class Frigorifero extends Prodotto {

	private String classeEnergetica;
	private int numeroAnte;
	

	@Override
	public double calcolaSpedizione() {
		
		return numeroAnte*Prodotto.TASSA_SPEDIZIONE;
	}


	//Getters and setters
	public String getClasseEnergetica() {
		return classeEnergetica;
	}


	public void setClasseEnergetica(String classeEnergetica) {
		this.classeEnergetica = classeEnergetica;
	}


	public int getNumeroAnte() {
		return numeroAnte;
	}


	public void setNumeroAnte(int numeroAnte) {
		this.numeroAnte = numeroAnte;
	}


	@Override
	public String toStringAggiuntive() {
		return ", classeEnergetica=" + classeEnergetica + ", numeroAnte=" + numeroAnte;
	}	

}