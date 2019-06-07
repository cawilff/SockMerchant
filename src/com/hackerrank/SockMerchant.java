package com.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
	
	public static void encontrarParejas( ) {
		int arregloCalcetines[] = {1,2,0,2,1,8,8};
//		
		int inicio =0;
		int fin = arregloCalcetines.length -1;
		int primerColor = 0;
		int segundoColor = 0;
		boolean procesaTodos = false;
		int numeroParejas = 0;
		Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();
			while(!procesaTodos && inicio != fin ) {
				
				primerColor =arregloCalcetines[inicio];
				segundoColor = arregloCalcetines[fin];
				if(primerColor == segundoColor ) {
					mapa.put(primerColor, segundoColor);
					numeroParejas++;
					inicio++;
					fin = arregloCalcetines.length - 1;

					
				}else {
				fin--;
				}
				if(inicio == fin && !procesaTodos) {
					inicio ++;
					fin = arregloCalcetines.length -1;
				}
				if(inicio > arregloCalcetines.length - 1) {
					procesaTodos = true;
				}
			
		}

		
		
		System.out.println(mapa);
		System.out.println("numeroParejas: " + numeroParejas);
		
	}

	
	public static void main(String[] args) {
		
		encontrarParejas();
	}

}
