package EncapsulamentoExerc;

public class pet {
	private String nome;
	private String tipoAnimal;
	private int idade;
	
	
	//criei um metodo construtor sem argumentos para poder criar um objeto passando nenhum argumento
	//aqui eu posso criar um objeto com nenhum ou um dos atributos mas não necessariamente todos(e so chamar o objeto.setAtributo(informacao))
	public pet() {
	}

	//metodo de sobrecarga em java, que pode criar um método com o mesmo nome (no caso dos construtores) mas que recebem argumentos diferentes.
	//aqui criei um metodo construtor com argumento para criar um objeto já com essas informacoes
	public pet(String nome, String tipoAnimal, int idade) {
		this.nome = nome;
		this.tipoAnimal = tipoAnimal;
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipoAnimal() {
		return tipoAnimal;
	}


	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	

}
