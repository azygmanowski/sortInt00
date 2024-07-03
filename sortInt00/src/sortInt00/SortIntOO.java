package sortInt00;

import java.util.Random;

public class SortIntOO {	
	
	static Random rn = new Random();	
		
	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myArrayLength = 100000;
				
		int[] myArraySort 	= new int [myArrayLength];
		
		
		for (int i = 0; i < myArrayLength; i++) {
			myArraySort[i] = rn.nextInt(0,99);			
		}		
		
		
		long startTime = System.currentTimeMillis();
		sort(myArraySort);
		long endTime = System.currentTimeMillis();
		
		System.out.println("benötigte Zeit: " + (double)(endTime - startTime)/1000 + " Sekunden");
		

	}
	
	
	public static void sort(int a [])
	{ for (int outer = 0; outer < a.length; outer++)
		{ int min = outer;
		/*kleinstes Element suchen, Index nach min*/
		for (int inner = outer + 1; inner < a.length; inner++)
		if (a[inner] < a[min]) min=inner;
		tausche(a, outer, min);
		}		
	}
	
	public static  void tausche (int[] a, int i, int j)
	{
		int hilf = a[i];
		a[i] = a[j];
		a[j] = hilf;
	}

}
