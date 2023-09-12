package domain;

public class Calculadora {

	//constructor
	public Calculadora() {
		
	}
	
	//metodos
	//funcion para calcular la determinante de una matriz
	public double calcularDeterminante(double matriz[][]){
		
		double det = 0;
		//Si la matriz es 1x1 la det es el valor unico
		if (matriz.length == 1 && matriz[0].length == 1) {
			det = matriz[0][0];
		//Si es 2x2 la det es la diferencia de las diagonales superior e inferior
		}else if(matriz.length == 2 && matriz[0].length == 2) {
			det = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
			//System.out.println(det);
			
			
		}else{
			//Si es mayor a 2x2, realizar el metodo por cofactores
			det = this.seleccionarFila(matriz);
		}
			
		return det;
	}
	
	//funcion que toma la primera fila de la matriz y calcula la sumatoria de cofactores
	private double seleccionarFila(double matriz[][]) {
		double det_final = 0;
		//Enviamos un valor de la fila elegida
		for(int i = 0; i < matriz.length; i++) {
			//Generamos una submatriz, despues calculamos el cofactor y se lo asignamos a "det_submatriz"
			double det_submatriz = calcularCofactor(this.disminuirMatriz(matriz, i), i, matriz[i][0]);
					
			
			//Se realiza la sumatoria del metodo por cofactores
			det_final += det_submatriz;
			//System.out.println(det_final + "\n");
		}
		r
		
		return det_final;
	}
	//funcion que obtiene una submatriz a partir de una matriz y un limite de corte en el eje de las filas
	private double[][] disminuirMatriz(double matriz[][], int limite) {
		int band = 0;
		//Creamos la submatriz con dimensiones (n-1) * (n-1)
		double[][] submatriz = new double[matriz.length-1][matriz[0].length-1];



		//Iteracion de las filas de la matriz original y dsu submatriz
	    for (int f = 0, i = 0; f < matriz.length && i < (matriz.length-1); f++, i++){

		//Condicional para realizar un salto en la iteracion, esto simula el corte en las filas para construir la submatriz   
	    	if(f == limite && band ==0) {
	    		f++;
	    		band = 1;
	    	}
		    
		//Iteracion de las columnas de la matriz original y su submatriz
	        for (int c = 1, j = 0; c < matriz[0].length && j < (matriz[0].length-1); c++, j++){
	            //Llenamos con datos la submatriz
	        	submatriz[i][j] = matriz[f][c];
	        }
	    }
	    this.imprimirMatriz(submatriz);
	    return submatriz;
	}

	//funcion que calcula el cofactor de la submatriz
	private double calcularCofactor(double submatriz[][], int exp, double escalar) {
		//formula del cofactor
		double cofactor = Math.pow(-1, exp) * escalar * this.calcularDeterminante(matriz);
		System.out.println(cofactor + "\n");
		return cofactor;
	}
	
	//funcion para imprimir una matriz
	public void imprimirMatriz(double matriz[][]) {
		//iteracion de las filas
		for(int i = 0; i < matriz.length; i++) {
			//iteracion de las columnas
			for(int j = 0; j < matriz[i].length; j++) {
				//imprmir la posicion [i][j] en la matriz
				System.out.print(matriz[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
