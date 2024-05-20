package model;

public class Pokemon {
	
	private int id;
	private String nome;
	private String type1;
	private String type2;
	
	
	//Overload = nella stessa classe ci sono più metodi con lo stesso nome, si devono distinguere per i parametri in ingresso
	//Costruttore firma vuota
	public Pokemon() {
		super();
	}

	//Costruttore firma vuota 
	public Pokemon(int id, String nome, String type1, String type2) {
		super();
		this.id = id;
		this.nome = nome;
		this.type1 = type1;
		this.type2 = type2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", nome=" + nome + ", type1=" + type1 + ", type2=" + type2 + "]";
	}

	//L'override indica la riscrittura di un metodo ereditato, qundi il metodo deve essere esatamente uguale
	
}
