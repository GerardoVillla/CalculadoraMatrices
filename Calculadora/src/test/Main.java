package test;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Crear objeto Calculadora
        Calculadora calculadora = new Calculadora();
        //Obtener la matriz devuelta por la funcion encargada de leerla
        double[][] matriz = leerMatriz();
        System.out.println("La matriz ingresada fue:\n");
        calculadora.imprimirMatriz(matriz);
        
        //Imprimir el retorno (determinante) de la funcion calcular determinante
        System.out.println("La Determinante es = " + calculadora.calcularDeterminante(matriz));
        
        
	}
	
	//funcion que lee una matriz ingresada por el usuario y la devuelve a su llamada
	public static double[][] leerMatriz(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba la dimension de la matriz cuadrada");
		//Leer dimension nxn
		int tamanoN = Integer.parseInt(scan.nextLine());
		//Crear matriz con las dimensiones ingresadas
		double[][] matriz = new double[tamanoN][tamanoN];
		System.out.println("Escriba los valores de la matriz");
		//Iterar en cada posicion de la matriz
		for(int i = 0 ; i < tamanoN ; i++){
			for(int j = 0 ; j < tamanoN ; j++){
				//Leer el valor de la posicion i,j
				System.out.println("Valor de la posicion (" + i + " , " + j + "):  ");
					matriz[i][j] = scan.nextDouble();
			}
		}
		return matriz;
	}
}
