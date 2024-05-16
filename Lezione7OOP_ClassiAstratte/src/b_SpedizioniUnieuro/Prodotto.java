package b_SpedizioniUnieuro;

public abstract class Prodotto {
	
	static final int TASSA_SPEDIZIONE = 10;
	
	private long id;
	private String nome;
	private String descrizione;
	private double prezzo;
//	private String tipoAbbonamento; //Abbonamento prime spedizione 9,99
//	private double pesoVolumetrico;
	

	//Non creare il costruttore a firma piena
	//Il metodo per descrivere il prodotto dovrà essere creato qui con il metodo toString. Il metodo tooString richiama calcolaSpedizione

//	public Prodotto() {
//		
//	}
	
	//Metodi astratti
	public abstract double calcolaSpedizione();
	public abstract String toStringAggiuntive();


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	@Override
	public String toString() {
		return "Prodotto [id=" + id + ", nome=" + nome + ", descrizione=" + descrizione + ", prezzo=" + prezzo + ", costo spedizione=" + calcolaSpedizione() + toStringAggiuntive() + "]";
	}

	

}
