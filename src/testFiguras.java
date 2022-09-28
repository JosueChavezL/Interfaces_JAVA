
public class testFiguras {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo("Triángulo t1", 20.0, 10.0, 15.0);		
		imprimirCalculo(t1); 
		
		Cuadrado c1 = new Cuadrado ("Cuadrado c1", 10.0);
		imprimirCalculo(c1);
		
		Rectangulo r1 = new Rectangulo ("Rectángulo r1", 10.0, 5.0);
		imprimirCalculo(r1);

		Rombo rom1 = new Rombo ("Rombo rom1", 10.0, 7.0, 5.0);
		imprimirCalculo(rom1);
		
		Romboide romb1 = new Romboide ("Romboide romb1", 10.0, 7.0);
		imprimirCalculo(romb1);
		
		Trapecio tr = new Trapecio ("Trapecio tr", 10.0, 7.0, 15.0, 8.0, 20.0, 25.0, 10.0);
		imprimirCalculo(tr);
	}//main, donde se declaran 1 objeto de cada figura geometrica
	
	public static void imprimirCalculo(Imprimible i) {		
		System.out.println(i);
		System.out.println(("+========================================================================================================================"));
		System.out.println(("|El área de [" +i.getNombre()+"] es: " + i.calcularArea() +
				"\n" + "|El perímetro de [" + i.getNombre() + "] es: " + i.calcularPerimetro()));
		System.out.println(("+========================================================================================================================"));		
	}//imprimirCalculo de todas las figuras geometricas con la interface Imprimible

}
