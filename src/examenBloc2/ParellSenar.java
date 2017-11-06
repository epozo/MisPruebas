package examenBloc2;

import java.util.Scanner;

/*Escriu un programa en Java que
·   Demanarà números enters  per teclat.
·   Per cada número introduït, mirarà si és parell o senar
·   Acabarà quan es compleix alguna de les següents afirmacions:
		>  número de parells – número de senars = 3
		> número de senars – número de parells = 3
·  Al final indicarà el número total de parells i senars introduïts
 */

public class ParellSenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);  
		int num, contp = 0, conts = 0;
	
		while (contp - conts != 3 && conts - contp != 3) {
			
			System.out.print("Introdueix un número: ");
			num = reader.nextInt();  
			
			if (num % 2 == 0) {
				contp++;
			}
			else {
				conts++;
			}
		}
		System.out.println("Tenim " + contp + " parells i " + conts + " senars");
		
		reader.close();
	}

}
