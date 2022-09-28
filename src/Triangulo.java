
public class Triangulo implements Imprimible{
	private String nombre;
	private double base;
	private double altura;
	private double lado;
	
	public Triangulo(String nombre, double base, double altura, double lado) {
		
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}//constructor, se implementa la interface imprimible para asegurar que se pueda mostrar en TestFiguras
	
	public double calcularPerimetro() {
		return (getLado() + getLado() + getLado());		
	}//caculatePerimetro
	
	public double calcularArea() {
		return (getBase() * getAltura()/2);
	}//calcularArea
	
	public String getNombre() {
		return nombre;
	}//getNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	public double getBase() {
		return base;
	}//getBase
	public void setBase(double base) {
		this.base = base;
	}//setBase
	public double getAltura() {
		return altura;
	}//getAltura
	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura
	public double getLado() {
		return lado;
	}//getLAdo
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado
	@Override
	public String toString() {
		return "Triangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	}//toString
	
	
	

}//class Triangulo
