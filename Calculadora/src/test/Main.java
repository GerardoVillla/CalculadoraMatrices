package test;
import domain.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double[][] matriz = {
                {1, -1, 2, 3},
                {2, 1, 0, 1},
                {3, -1, 1, 2},
                {2, -1, 0, 1}
            };
        Calculadora calculadora = new Calculadora();
        
        System.out.println("Det = " + calculadora.calcularDeterminante(matriz));
        //calculadora.imprimirMatriz(matriz);
        
	}
	
	
	public static double[][] leerMatriz(){
		double[][] matriz = new double[1][2];
		
		return matriz;
	}

}
