/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package algoritmo495;

/**
 *
 * @author Anna
 */
// Criar uma função que receba um vetor de caracteres e ordenar.
//          VÍDEO
// Digite nome: PEDRO LOPES
// Digite nome: JOAO BOND
// Digite nome: GUTO GARCIA
// Digite nome: ANITA LOPES
// Digite nome: MARIA CORREA
// 1 - ANITA LOPES
// 2 - GUTO GARCIA
// 3 - JOAO BOND
// 4 - MARIA CORREA
// 5 - PEDRO LOPES

import javax.swing.JOptionPane;
public class Algoritmo495 {
    
    public static void ordena(String[] vet, int tam) {
        String aux;

        for (int li = 0; li < tam - 1; li++) {
            for (int ci = li + 1; ci < tam; ci++) {
                if (vet[li].compareTo(vet[ci]) > 0) {
                    aux = vet[li];
                    vet[li] = vet[ci];
                    vet[ci] = aux;
                }
            }
        }
    }


    public static void main(String[] args) {
        
        ClassAlgoritmo495 ordenar = new ClassAlgoritmo495();
        
        for (int l = 0; l < 5; l++) {
           ordenar.nome[l] = JOptionPane.showInputDialog("Digite nome " + (l + 1) + ": ");
            
        }

        ordena(ordenar.nome, ordenar.nome.length);

        System.out.println("\n\nNOMES ORDENADOS\n");
        for (int l = 0; l < 5; l++) {
            System.out.println((l + 1) + " - " + ordenar.nome[l]);
    }     
  }
}

   