
public class Trapecio implements Imprimible{
	private String nombre;
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	private double baseMenor;
	private double baseMayor;
	private double altura;
	
	public Trapecio(String nombre, double lado1, double lado2, double lado3, double lado4, double baseMenor,double baseMayor, double altura) {
		
		this.nombre = nombre;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.baseMenor = baseMenor;
		this.baseMayor = baseMayor;
		this.altura = altura;
	}//constructor, se implementa la interface imprimible para asegurar que se pueda mostrar en TestFiguras
	
	public double calcularArea() {
		return ((getAltura() * (getBaseMayor() + getBaseMenor()))/2);
	}//calcularArea
	
	public double calcularPerimetro() {
		return ((getLado1() + getLado2() + getLado3() + getLado4()));
	}//caculatePerimetro
	
	public String getNombre() {
		return nombre;
	}//getNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	public double getLado1() {
		return lado1;
	}//getLado1
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}//setLado1
	public double getLado2() {
		return lado2;
	}//getLado2
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}//setLado2
	public double getLado3() {
		return lado3;
	}//getLado3
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}//setLado3
	public double getLado4() {
		return lado4;
	}//getLado4
	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}//setLado4
	public double getBaseMenor() {
		return baseMenor;
	}//getBaseMenor
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}//setBaseMenor
	public double getBaseMayor() {
		return baseMayor;
	}//getBaseMayor
	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}//setBaseMenor
	public double getAltura() {
		return altura;
	}//getAltura
	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura
	@Override
	public String toString() {
		return "Trapecio [nombre=" + nombre + ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4="
				+ lado4 + ", baseMenor=" + baseMenor + ", baseMayor=" + baseMayor + ", altura=" + altura + "]";
	}//toString
	
	
}
