package gage;

public class Impressao {

	public static void imprimir(String str) {
		System.out.println(str);
	}

	public static void imprimir(int vlr) {
		System.out.println(vlr);
	}

	public static void imprimir(double vlr) {
		System.out.printf("%.2f",vlr);
	}


	public static void imprimir(String[] vet) {
		System.out.println();
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
	}

	public static void imprimir(int[] vet) {
		System.out.println();
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
	}

	public static void imprimir(String[] vet1, String[] vet2) {
		System.out.println();
		for (int i = 0; i < vet1.length; i++) {
			System.out.println(vet1[i] + " <-> " + vet2[i]);
		}
	}

	public static void imprimir(String[] vet1, String[] vet2, int[] vet3) {
		System.out.println();
		for (int i = 0; i < vet1.length; i++) {
			System.out.println(vet1[i] + " (" 
					+ vet3[i] + ") <-> " + vet2[i]);



		}
	}

			
		public static void imprimir(int[][]normalmente) { 
		for (int iL = 0; iL < normalmente.length; iL++) {
			for (int iC = 0; iC < normalmente[iL].length; iC++) {
				System.out.print(normalmente[iL][iC] + " ");
			}
			System.out.println();
		}
	}

	public static void imprimir(double[][]normalmente) {
		for (int iL = 0; iL < normalmente.length; iL++) {
			for (int iC = 0; iC < normalmente[iL].length; iC++) {
				System.out.print(normalmente[iL][iC] + " ");
			}
			System.out.println();
		}
	}
	
	public static void imprimir(String[][] normalmente) {
		for (int iL = 0; iL < normalmente.length; iL++) {
			for (int iC = 0; iC < normalmente[iL].length; iC++) {
				System.out.print(normalmente[iL][iC] + " ");
			}
			System.out.println();
		}
	}
	
	public static void imprimir(char[][] normalmente) {
		for (int iL = 0; iL < normalmente.length; iL++) {
			for (int iC = 0; iC < normalmente[iL].length; iC++) {
				System.out.print(normalmente[iL][iC] + " ");
			}
			System.out.println();
		}
	}




}
