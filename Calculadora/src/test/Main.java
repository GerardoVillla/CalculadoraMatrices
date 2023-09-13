package test;
import domain.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner entradaN = new Scanner(System.in);
	
	System.out.println("Escriba el tamaño de la matriz cuadrada");
	int tamanoN = entradaN.nextInt();
	 double[][] matriz = new double[tamanoN][tamanoN];
	System.out.println("Escriba los valores de la matriz");
	for(int i = 0 ; i < tamanoN ; i++){
		for(int j = 0 ; j < tamanoN ; j++){
			matriz[i][j] = entradaN.nextDouble();
		}
	}
   
	Calculadora calculadora = new Calculadora();

    System.out.println("Det = " + calculadora.calcularDeterminante(matriz));
    entradaN.close();
        
   }
}
