//Ejercicios tema 4
//introduccion a la programacion
//OpenBootcamp
import java.util.scanner;
public class Main {

	public static void main( String [ ] args) {
        
        System.out.print("Ingrese un nuemro Negativo o Positivo: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextLine();
        scanner.close();
        
        funcionIf();
        funcionWhile();
        funcionDo();    
    
	}
    public static void funcionIf(int numero)  {
        if numero <0;
            System.out.println(numero, 'Este numero es negativo');
        else;
            System.out.println(numero, 'Este numero es positivo');
    }
    public static void funcionWhile(int numero) {
        
        while (numero < 3) {
        
            System.out.println(numero);
            numero = numero += 1;
        }
    }
    public static void funcionDo(int numero) { 
  
        do{
		    System.out.println(numero);
            numero = número += 1;
  
        }while (numeroWhile < 3); 
  
    }
}	