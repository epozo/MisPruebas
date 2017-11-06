package examenBloc2;

/*
 * Factors primers
Es demana un programa que descompongui un número donat d’entrada en tots els seus factors primers. 
Els factors primers d’un número són aquells números primers que són divisors
 exactes d’aquest número. 
 Per exemple, els factors primers del número 24 són el 2, 2, 2 i 3 (no són factors primers el 4, el 6, el 8 o el 12, 
 perquè encara que són divisors exactes, no ho són primers).
El programa demanarà a l’usuari el número a des composar i seguidament mostrarà la seva descomposició.
 */

import java.util.Scanner;

public class FactorsPrimers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);  
		int num = 0, primer = 2;
		
		System.out.print("Introdueix un número: ");
		num = reader.nextInt();  
		
		while (primer < num) {
			while (num % primer == 0) {
				System.out.print(primer + " ");
				num = num / primer;
			}
			primer++;
		}
		System.out.println(num);
		reader.close();
	}

}
