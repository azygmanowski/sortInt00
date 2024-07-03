package sortInt00;

import java.util.Random;

public class SortIntOO {	
	
	static Random rn = new Random();	
		
	public  static void main(String[] args) {		
		
		//Definition der Anzahl an zu sortierenden Elementen
		int myArrayLength = 100000;
				
		//leeres Array definieren, aktueller Datentyp Integer (Ganzzahlen)
		int[] myArraySort 	= new int [myArrayLength];
		
		//Füllen der 'Liste' mit Zufallszahlen zwischen 0 und 99
		for (int i = 0; i < myArrayLength; i++) {
			myArraySort[i] = rn.nextInt(0,99);			
		}		
		
		
		//Startzeit festlegen
		long startTime = System.currentTimeMillis();
		//Liste sortieren
		sort(myArraySort);
		//Stopzeit festlegen
		long endTime = System.currentTimeMillis();
		//Ausgabe der benötigten Zeit
		System.out.println("benötigte Zeit: " + (double)(endTime - startTime)/1000 + " Sekunden");
	}
	
	
	
	//Ab hier ist das eigentliche Sortieren programmiert, davor der Kram dient lediglich zum Erzeugen und Füllen der 'Liste'
	//sowie zum Messen der Zeit (Effizienz)
	
	
	//Das ist die eigentliche Methode zum Sortieren
	public static void sort(int a [])
	{ for (int outer = 0; outer < a.length; outer++)
		{ int min = outer;
		/*kleinstes Element suchen, Index nach min*/
		for (int inner = outer + 1; inner < a.length; inner++)
		if (a[inner] < a[min]) min=inner;
		tausche(a, outer, min);
		}		
	}
	
	
	//Methode zum Tauschen zweier Werte, wird bei Bedarf von der Sortiermethode aufgerufen
	public static  void tausche (int[] a, int i, int j)
	{
		int hilf = a[i];
		a[i] = a[j];
		a[j] = hilf;
	}

}
