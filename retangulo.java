package EncapsulamentoExerc;

public class retangulo {
	private double base;
	private double altura;
	private double area;
	private double perimetro;
	
	
	
	public retangulo() {
	}

	public retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArea() {
		return area;
	}
	
	//nao recebe nenhum paramento pa ja vai recber as informacoes de base e altura
	public void setArea() {
		this.area = base * altura;
	}

	public double getPerimetro() {
		return perimetro;
	}
	
	//nao recebe nenhum paramento pa ja vai recber as informacoes de base e altura
	public void setPerimetro() {
		this.perimetro =  2 * (base+altura);
	}
	
	
}
