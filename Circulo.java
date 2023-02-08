package Bloque3;

public class Circulo {
	 int radio;
	
	
	public int elRadio() {
		return radio;
	}
	
	public double laCircunferencia() {
		return Math.PI*radio*2;
	}
	
	
	public double elArea(){
		return Math.PI*radio*radio;
	}
	
	public Circulo(int radio) {
		this.radio = radio;
	}
	
	public Circulo() {
		this(174720);
	}
}