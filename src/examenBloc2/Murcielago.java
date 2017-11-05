package examenBloc2;

/*
 * Escriure un programa en Java que demani com a dades d’entrada a l’usuari 
 * una frase que acabarà en ‘.’ (el programa anirà llegint lletra per lletra 
 * fins trobar  ‘.’). El programa escriurà “TOTES” si durant la frase 
 * han aparegut totes les vocals, i “FALTEN” si falta alguna vocal.
 * Si  falta alguna vocal, indicarà quina/quines són les que falten.

 */

import java.util.Scanner;

public class Murcielago {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);  
		String frase;
		char lletra;
		int pos = 0;
		int conta = 0, conte = 0, conti = 0, conto = 0, contu = 0;
		
		System.out.println("Escriu una frase acabada en punt ");
		frase = reader.nextLine();  
		
		lletra = frase.charAt(0);		//Llegeix un caracter de teclat
		
		while (lletra != '.')
		{
			switch (lletra) {
				case 'a':
				case 'A': conta++;
				          break;
				case 'e':
				case 'E': conte++;
				          break;
				case 'i':
				case 'I': conti++;
				          break;
				case 'o':
				case 'O': conto++;
				          break;
				case 'u':
				case 'U': contu++;
				          break;
			}
			pos++;
			lletra = frase.charAt(pos);
		}

		if (conta != 0 && conte != 0 && conti != 0 && conto != 0 && contu != 0) {
			System.out.println("TOTES");
		}
		else {
			System.out.print("FALTEN: ");
			if (conta == 0) System.out.print("a");
			if (conte == 0) System.out.print("e");
			if (conti == 0) System.out.print("i");
			if (conto == 0) System.out.print("o");
			if (contu == 0) System.out.print("u");
		}


	}

}
