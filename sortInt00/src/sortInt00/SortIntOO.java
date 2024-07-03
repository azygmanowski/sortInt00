package sortInt00;

import java.util.Random;

public class SortIntOO {	
	
	static Random rn = new Random();	
		
	public  static void main(String[] args) {		
		
		//Definition der Anzahl an zu sortierenden Elementen
		int myArrayLength = 1000000;
				
		//leeres Array definieren, aktueller Datentyp Integer (Ganzzahlen)
		int[] myArraySort 	= new int [myArrayLength];
		
		//Füllen der 'Liste' mit Zufallszahlen zwischen 0 und 99
		for (int i = 0; i < myArrayLength; i++) {
			myArraySort[i] = rn.nextInt(0,99);			
		}
		
		//Startzeit festlegen
		long startTime = System.currentTimeMillis();
		//Liste sortieren
		qsort(myArraySort);
		//Stopzeit festlegen
		long endTime = System.currentTimeMillis();
		//Ausgabe der benötigten Zeit
		System.out.println("benötigte Zeit: " + (double)(endTime - startTime)/1000 + " Sekunden");
		
		//ausgabe(myArraySort);
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
	
	public static void bubblesort(int[] a){
		for (int outer = a.length-1; outer>0; outer--){
			for (int inner=0; inner<outer; inner++){
				if (a[inner]>a[inner+1]) tausche(a,inner,inner+1);
			}	
		}
	}
	
	
	static void qsort(int[] a){
		qsort(a, 0, a.length-1);
	}
	
	static void qsort(int[] a, int left, int right){
		if (right-left> 0) // nur sortieren, wenn Groesse >= 2
		{ double pivot = a[right]; // Element ganz rechts
		int partition = partitionIt(a, left, right, pivot);
		qsort(a, left, partition-1); // sortiere linke Seite
		qsort(a, partition+1, right); // sortiere rechte Seite
		}
	}	
	
	public static int partitionIt(int[] a, int left, int right, double pivot){
		int leftPtr = left;
		int rightPtr = right-1;
		while(leftPtr<=rightPtr){
			while( a[leftPtr] < pivot )leftPtr++;
			while(rightPtr >=0 && a[rightPtr] > pivot) rightPtr--;		
			if (leftPtr<=rightPtr){
				if(leftPtr<rightPtr)tausche(a, leftPtr,rightPtr);
					leftPtr++;rightPtr--;
				}
		}
		tausche(a, leftPtr, right); // setze pivot an richtige Stelle
		return leftPtr; // return Index des pivot Elements
	}
	
	
	//Methode zum Tauschen zweier Werte, wird bei Bedarf von der Sortiermethode aufgerufen
	public static  void tausche (int[] a, int i, int j)
	{
		int hilf = a[i];
		a[i] = a[j];
		a[j] = hilf;
	}
	
	public static  void ausgabe (int[] a)
	{
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}		
	}
	
	
	
	

}
