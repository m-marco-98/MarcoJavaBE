package model;

public class Cliente {

	private String nome;
	private String cognome;
	private String numTelefono; //PK
	
	//Getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNumTelefono() {
		return numTelefono;
	}
	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", numTelefono=" + numTelefono + "]";
	}
	
	
	
}
