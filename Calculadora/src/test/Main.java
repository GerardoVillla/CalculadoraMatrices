package test;
import domain.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner entradaN = new Scanner(System.in);
	
	System.out.println("Escriba el tamano de la matriz cuadrada");
	int tamanoN = entradaN.nextInt();
	
	while(tamanoN==0) {
		System.out.println("Escriba el tamano de la matriz cuadrada");
		tamanoN = entradaN.nextInt();
	}
	double[][] matriz = new double[tamanoN][tamanoN];
	System.out.println("\nEscriba los valores de la matriz");
	for(int i = 0 ; i < tamanoN ; i++){
		for(int j = 0 ; j < tamanoN ; j++){
			matriz[i][j] = entradaN.nextDouble();
		}
	}
   
	Calculadora calculadora = new Calculadora();
	calculadora.imprimirMatriz(matriz);
    System.out.println("\nDet = " + calculadora.calcularDeterminante(matriz));
    entradaN.close();
        
   }
}
