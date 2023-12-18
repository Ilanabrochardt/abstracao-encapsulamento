package EncapsulamentoExerc;

public class gato {
	public static void main(String[] args) {
		pet gatito = new pet("Dino","gato",1);
		
		pet gatita = new pet();
		gatita.setNome("Dina");
		
		
		System.out.printf("Nome do animal: "+ gatito.getNome() + "\nTipo de animal: " + gatito.getTipoAnimal() + "\nIdade do animal: " + gatito.getIdade() + " ano(s)");
		System.out.printf("\nNome do outro animal: %s", gatita.getNome());
	}

	
}
