package prova;

public class Customer {
	protected int id;
	protected String nome;
	protected String city;
	protected float grade;
	public Customer() {
	}

	public Customer(int id) {
		this.id = id;
	}

	public Customer(int id, String nome, String city, float grade) {
		this(nome, nome, grade);
		this.id = id;
	}
	
	public Customer(String nome, String city, float grade) {
		this.nome = nome;
		this.city = city;
		this.grade = grade;
	}
}
