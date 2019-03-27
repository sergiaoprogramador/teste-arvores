/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
	
/*3) crie um programa (pode aproveitar o exemplo do livro) que receba como
 *  entrada um arvore contida em um arquivo e consiga encontrar o ACMB de 
 *  dois vértices informados */
	public class Exercicio3 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader arq = new FileReader("C:\\Users\\fsanc\\eclipse-workspace\\GeradorArvores\\Arvore10_R2.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			Scanner valoracmb1 = new Scanner(System.in);
			Scanner valoracmb2 = new Scanner(System.in);
	
			System.out.println("Entre com os vértices para calcularmos o ancestral");
			int acmb1 = valoracmb1.nextInt();
			int acmb2 = valoracmb2.nextInt();
			int tamanhovetor = Integer.parseInt(args[0]);
			int [] vet1=new int[tamanhovetor];
			int [] aux= new int[tamanhovetor];
			int [] aux2= new int[tamanhovetor];

			String[] vertice_adjacentes;
			String vertice;
			String linha = lerArq.readLine(); // lê a primeira linha
			int i;
			while (linha != null) {
				vertice = linha.substring(0,linha.indexOf(" "));
				vertice_adjacentes = linha.substring(2, linha.length()).split(";");
				vet1[Integer.parseInt(vertice)]=Integer.parseInt(vertice_adjacentes[0]);
				linha = lerArq.readLine(); // lê da segunda até a última linha
			}
			i=0;
			while(acmb1!=0) {
				aux[i]=vet1[acmb1];
				acmb1= vet1[acmb1];
				i++;
			}
			i=0;
			while(acmb2!=0) {
				aux2[i]=vet1[acmb2];
				acmb2= vet1[acmb2];
				i++;
			}
			
			int resultado = 0;
			for(i=0;i<aux.length;i++)
				for(int j=0;j<aux2.length;j++)
					if((aux[i]==aux2[j])&&(aux[i]!=0))
						resultado = aux[i];
			
			System.out.println("resultado:"+resultado);
			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n",
					e.getMessage());
		}
	}
}



