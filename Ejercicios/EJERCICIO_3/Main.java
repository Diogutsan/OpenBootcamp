//ejercicio de tema 3
//introduccion a la programacion
//OpenBootcamp

public class Main {
	public static void main( String [ ] args) {
		int a=6;
		int b=2;
		int c=8;
		int suma = a+b+c;
		System.out.print(suma);
	}  
	
	public static void main (String [ ] args){
	
	coche miCoche =new coche();
	miCoche.Sumarpuerta();
	System.out.println(miCoche.puertas)
	}
}

public class coche{
        
        public int puertas = 0;
        
        public void SumarPuerta(){
            this.puertas++;
        }
        
}