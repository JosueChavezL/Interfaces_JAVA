
public class Rombo implements Imprimible {
	private String nombre;
	private double diagMayor;
	private double diagMenor;
	private double lado;
	
	public Rombo(String nombre, double lado, double diagMayor, double diagMenor) {

		this.nombre = nombre;
		this.lado = lado;
		this.diagMayor = diagMayor;
		this.diagMenor = diagMenor;
	}//constructor, se implementa la interface imprimible para asegurar que se pueda mostrar en TestFiguras

	public double calcularArea() {
		return ((getDiagMayor() * getDiagMenor())/2);
	}//calcularArea
	
	public double calcularPerimetro() {
		return (getLado() * 4);
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

	public double getDiagMayor() {
		return diagMayor;
	}//getDiagMayor

	public void setDiagMayor(double diagMayor) {
		this.diagMayor = diagMayor;
	}//setDiagMayor

	public double getDiagMenor() {
		return diagMenor;
	}//getDiagMenor

	public void setDiagMenor(double diagMenor) {
		this.diagMenor = diagMenor;
	}//setDiagMenor

	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", diagMayor=" + diagMayor + ", diagMenor=" + diagMenor + "]";
	}//toString
	
	
	
}
