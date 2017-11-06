package examenBloc2;

import java.util.Scanner;

/*
 * Escriure un programa que demani com a dades d’entrada a l’usuari una frase que acabarà en ‘.’ 
 * (el programa anirà llegint lletra per lletra fins trobar  ‘.’).
El programa indicarà, per cada vocal, el número de vegades que apareix, i, finalment, dirà quina és la vocal més repetida. 
Contempleu la possibllitat de que hi hagi més d’una vocal que siguin les més repetides.
 */

public class LaVocalMesFamosa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);  
		String frase;
		char lletra;
		int pos = 0;
		int conta = 0, conte = 0, conti = 0, conto = 0, contu = 0, mes = 0;
		
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
		System.out.println("la vocal a apareix " + conta + " vegades");
		System.out.println("la vocal e apareix " + conte + " vegades");
		System.out.println("la vocal i apareix " + conti + " vegades");
		System.out.println("la vocal o apareix " + conto + " vegades");
		System.out.println("la vocal u apareix " + contu + " vegades");
		
		if (conta > mes) {
			mes = conta;
		}
		if (conte > mes) {
			mes = conte;
		}
		if (conti > mes) {
			mes = conti;
		}
		if (conto > mes) {
			mes = conto;
		}
		if (contu > mes) {
			mes = contu;
		}
		if (mes == conta) {
			System.out.println("la vocal a és la més famosa");
		}
		if (mes == conte) {
			System.out.println("la vocal e és la més famosa");
		}
		if (mes == conti) {
			System.out.println("la vocal i és la més famosa");
		}
		if (mes == conto) {
			System.out.println("la vocal o és la més famosa");
		}
		if (mes == contu) {
			System.out.println("la vocal u és la més famosa");
		}
		reader.close();
	}

}
