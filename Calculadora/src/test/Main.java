package test;
import domain.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaN = new Scanner(System.in);
	System.out.println("Escriba el tamaño de la matriz cuadrada");
	int tamanoN = entradaN.nextInt();

	double[][] matriz ={};
	System.out.println("Escriba los valores de la matriz");
	for(int i = 0 ; i < tamanoN ; i++){
		for(int j = 0 ; j < tamanoN ; j++){
			matriz[i][j] = entradaN.nextDouble();
		}
	}
		
        /*double[][] matriz = {
                {1, -1, 2, 3},
                {2, 1, 0, 1},
                {3, -1, 1, 2},
                {2, -1, 0, 1}
            };*/
        Calculadora calculadora = new Calculadora();
        
        System.out.println("Det = " + calculadora.calcularDeterminante(matriz));
        //calculadora.imprimirMatriz(matriz);
        
	}
	
	
	public static double[][] leerMatriz(){
		double[][] matriz = new double[1][2];
		
		return matriz;
	}

}
