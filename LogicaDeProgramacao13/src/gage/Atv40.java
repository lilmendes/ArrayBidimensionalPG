package gage;

public class Atv40 {

	public static void main(String[] args) {
	//Atividade 40  Crie um solu��o para que o retorno de um m�todo que recebe 
	//a quantidade de linhas e colunas de um array bidimensional, seja um array bidimensional do tipo double contendo uma P.G.
	//cujo termo inicial � 3,0 e a raz�o � 2,5.
	//Depois crie um segundo m�todo para receber esse array criado no m�todo anterior e substitua todos os seus valores �mpares desse array somando com o valor 5.
	//No m�todo main a chamada do primeiro m�todo dever� passar os valores 2 e 5.

double[][]vader=obterpg(2, 5);				
Impressao.imprimir(vader);		
vader = obterpgimpar5(vader);		
Impressao.imprimir(vader);	
	}
	public static double[][] obterpg(int lin, int col) {   //criando metodo para fazer essa array bidimensional com 4 linhas e 6 colunas.
		double[][]campnou = new double[lin][col];   //array bidimensional com 4 linhas e 6 colunas.	
		int  termInicial = 3;
		double razao = 2.5;  
		for (int i = 0; i < campnou.length; i++) {
		for (int j = 0; j < campnou[i].length; j++) {
		campnou[i][j] = termInicial ;
	    termInicial  *=razao;
				}
		
	}
	return campnou;
	}
	public static double[][] obterpgimpar5(double[][]obterpg) {    // metodo para receber array bi criado e somar +5 a todos os seus valores �mpares.
		                                //LINHA DO OBTER PG //COLUNA DO OBTERPG
		double[][]campnou = new double[obterpg.length][obterpg[0].length];  
		for (int i = 0; i < campnou.length; i++) {
		for (int j = 0; j < campnou[i].length; j++) {
		if(obterpg[i][j]%2!=0) {
		campnou[i][j] = obterpg[i][j] + 5;
		}
		else {campnou[i][j] = obterpg[i][j];
			
		}
		}
		
	}
	return campnou;
	}		
}
