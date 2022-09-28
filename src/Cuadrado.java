
public class Cuadrado implements Imprimible {	
	private String nombre;
	private double lado;
	
	public Cuadrado(String nombre, double lado) {		
		this.nombre = nombre;
		this.lado = lado;
	}//constructor, se implementa la interface imprimible para asegurar que se pueda mostrar en TestFiguras
	
	public double calcularArea() {
		return (getLado()*4);
	}//calcularArea
	
	public double calcularPerimetro() {
		return (getLado() * getLado());
	}//caculatePerimetro

	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public double getLado() {
		return lado;
	}//getLado

	public void setLado(double lado) {
		this.lado = lado;
	}//setLado

	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}//toString
	
	

	
}
