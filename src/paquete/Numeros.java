package paquete;

import java.util.*;
public class Numeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cont_cero = 0;
		int cont_menor = 0;
		int cont_mayor = 0;
		
		System.out.println("¿Cuantos numeros ingresará?");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			System.out.println("Introduzca el numero: ");
			int num = sc.nextInt();
			
			if(num == 0){
				cont_cero++;
			} else if(num < 0){
				cont_menor++;
			} else {
				cont_mayor++;
			}
			
		}
		System.out.println("Igual a cero: "+cont_cero+"\nMenor a cero: "+cont_menor+"\nMayor a cero: "+cont_mayor);
	}

}
