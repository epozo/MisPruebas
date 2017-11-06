package examenBloc2;

/*
 * El rellotge
Escriure un programa que rebi com entrada un temps (hora, minut, segon) i 
ens mostri l’hora segon a segon fins que acabi el dia
 (arribem a les 00:00:00). Cal validar que les dades d’entrada siguin correctes.
 */
import java.util.Scanner;

public class ElRellotge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);  
		int hora = 0, minut = 0, segon = 0;
		boolean correcte = false;
		
		while (!correcte) {
			System.out.println("Iniciem el rellotge: ");
			System.out.print("Hora: ");
			hora = reader.nextInt();  
			if (hora < 0 || hora > 23) correcte = false;
			else {
				System.out.print("Minut: ");
				minut = reader.nextInt(); 
				if (minut < 0 || minut > 59) correcte = false;
				else {
					System.out.print("Segon: ");
					segon = reader.nextInt();  
					if (segon < 0 || segon > 59) correcte = false;
					else correcte = true;
				}
			}
		} //Sortim del bucle amb el rellotge inicialitzat
		
		while (hora != 0 && minut != 0 && segon != 0) { //while (!fi)
			segon++;
			if (segon == 60) {
				segon = 0;
				minut++;
				if (minut == 60) {
					minut = 0;
					hora++;
					if (hora == 24) hora = 0;  //fi = true
				}
			}
			System.out.println(hora + ":" + minut + ":" + segon);
		}
		reader.close();
	}

}
