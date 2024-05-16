package b_SpedizioniUnieuro;

public class Televisore extends Prodotto {

	private double diagonaleSchermo;
	private int luminosita;

	@Override
	public double calcolaSpedizione() {
		// TODO Auto-generated method stub
		return (diagonaleSchermo/10) * Prodotto.TASSA_SPEDIZIONE;
	}

	
	//Getters and setters
	public double getDiagonaleSchermo() {
		return diagonaleSchermo;
	}

	public void setDiagonaleSchermo(double diagonaleSchermo) {
		this.diagonaleSchermo = diagonaleSchermo;
	}

	public int getLuminosita() {
		return luminosita;
	}

	public void setLuminosita(int luminosita) {
		this.luminosita = luminosita;
	}

	@Override
	public String toStringAggiuntive() {
		return ", diagonaleSchermo=" + diagonaleSchermo + ", luminosita=" + luminosita;
	}	

}
