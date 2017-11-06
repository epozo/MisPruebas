package examenBloc2;

import java.util.Scanner;

/*
 * Escriure un programa en Java que:
Demanarà números enters  per teclat.
L’algorisme acabarà quan l’usuari entri un número que sigui més petit que l’anterior introduït.
L’algorisme ens dirà la “llargada de l’escala”, és a dir, quants números hem introduït abans d’acabar.
 */


public class LEscala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);  
		int num, anterior = 0, cont = 0;
	
		System.out.print("Introdueix un número: ");
		num = reader.nextInt(); 
		cont++;
		
		while (num >= anterior) {
			anterior = num;
			System.out.print("Introdueix un número: ");
			num = reader.nextInt(); 
			cont++;
		}
		System.out.println("La llargada de l'escala és: " + cont + " números");
		reader.close();
	}

}
