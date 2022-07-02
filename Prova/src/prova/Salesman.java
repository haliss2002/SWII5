package prova;

public class Salesman {
	protected int id;
	protected String nome;
	protected String city;
	protected float comission;
	public Salesman() {
	}

	public Salesman(int id) {
		this.id = id;
	}

	public Salesman(int id, String nome, String city, float comission) {
		this(nome, nome, comission);
		this.id = id;
	}
	
	public Salesman(String nome, String city, float comission) {
		this.nome = nome;
		this.city = city;
		this.comission = comission;
	}
}
