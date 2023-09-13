package domain;

public class Calculadora {

	//constructor
	public Calculadora() {
		
	}
	
	//metodos
	
	public double calcularDeterminante(double matriz[][]){
		
		double det = 0;
		//Si la matriz es 1x1 la det es el valor unico
		if (matriz.length == 1 && matriz[0].length == 1) {
			det = matriz[0][0];
		//Si es 2x2 la det es la diferencia de las diagonales superior e inferior
		}else if(matriz.length == 2 && matriz[0].length == 2) {
			det = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
			//System.out.println(det);asd
			
			
		}else{
			//Si es mayor a 2x2, realizar el metodo por cofactores
			det = this.seleccionarFila(matriz);
		}
			
		return det;
	}
	
	private double seleccionarFila(double matriz[][]) {
		double det_final = 0;
		//Enviamos un valor de la fila elegida
		for(int i = 0; i < matriz.length; i++) {
			//Definimos la det de la submatriz generada
			
			
			double det_submatriz = calcularCofactor(this.disminuirMatriz(matriz, i), i, matriz[i][0]);
					
			
			//Se suma a la final
			det_final += det_submatriz;
			//System.out.println(det_final + "\n");
		}
		return det_final;
	}
	
	private double[][] disminuirMatriz(double matriz[][], int limite) {
		int band = 0;
		//Creamos la submatriz
		double[][] submatriz = new double[matriz.length-1][matriz[0].length-1];
		
	    for (int f = 0, i = 0; f < matriz.length && i < (matriz.length-1); f++, i++){
	    	
	    	if(f == limite && band ==0) {
	    		f++;
	    		band = 1;
	    	}

	        for (int c = 1, j = 0; c < matriz[0].length && j < (matriz[0].length-1); c++, j++){
	            //Llenamos con datos la submatriz
	        	submatriz[i][j] = matriz[f][c];
	        }
	    }
	    this.imprimirMatriz(submatriz);
	    return submatriz;
	}
	
	private double calcularCofactor(double matriz[][], int exp, double escalar) {
		//calcular formula del cofactor
		double cofactor = Math.pow(-1, exp) * escalar * this.calcularDeterminante(matriz);
		System.out.println(cofactor + "\n");
		return cofactor;
	}
	
	
	public void imprimirMatriz(double matriz[][]) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
