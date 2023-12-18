package EncapsulamentoExerc;

public class calculoGeometrico {
	public static void main(String[] args) {
		
		retangulo r = new retangulo();
		
		retangulo i = new retangulo(3.4, 5.7);
		
		//ta setando (colocando) os valores do argumento do objeto i de base e altura no calculo de area dentro do metodo set
		i.setArea();
		double resultadoArea = i.getArea();
		
		//fazer agr a msm coisa para perimetro
		i.setPerimetro();
		double resultadoPerimetro = i.getPerimetro();

		System.out.printf(
				"Considerando que a base e a altura do retangulo e, respectivamente: %.2f e %.2f, entao: \narea: %.2f \nperimetro: %.2f",
				i.getBase(), i.getAltura(), i.getArea(), i.getPerimetro());
	}
}
