/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.io.IOException;

/*4) Como encontramos o mínimo e o máximo em árvores binárias?*/
public class Exercicio4 {
	public static void main(String[] args) throws IOException {
		Tree theTree = new Tree();

		theTree.insert(50, 1.5);
		theTree.insert(25, 1.2);
		theTree.insert(75, 1.7);
		theTree.insert(12, 1.5);
		theTree.insert(37, 1.2);
		theTree.insert(43, 1.7);
		theTree.insert(30, 1.5);
		theTree.insert(33, 1.2);
		theTree.insert(87, 1.7);
		theTree.insert(93, 1.5);
		theTree.insert(97, 1.5);

		theTree.displayTree();
		System.out.println("Minimo"+theTree.minimo());
		System.out.println("Maximo"+theTree.maximo());

	}
}
