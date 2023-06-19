//ejercicio de tema 3
//introduccion a la programacion
//OpenBootcamp

public class Main {
	public static void main(String[] args) {
		int a = 6;
		int b = 2;
		int c = 8;
		int suma = a + b + c;
		System.out.print(suma);

		Coche miCoche = new Coche();
		miCoche.SumarPuerta();
		System.out.print(miCoche.puertas);
	}
}
