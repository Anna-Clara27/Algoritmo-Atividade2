/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.algoritmo497;

/**
 *
 * @author Anna
 */
// Criar uma função que implemente uma busca binária. Esta função recebe um vetor de inteiros, 
// seu tamanho e uma chave e retorna a posição da chave no vetor. Lembre-se de que o vetor deverá estar ordenado. 
//     VÍDEO                  VÍDEO 
// Digite numero 1: 23     Digite numero 1: 19
// Digite numero 2: 45     Digite numero 2: 45 
// Digite numero 3: 11     Digite numero 3: 11 
// Digite numero 4: 16     Digite numero 4: 15 
// Digite numero 5: 78     Digite numero 5: 89
// Digite numero 6: 98     Digite numero 6: 456 
// Digite numero 7: 44     Digite numero 7: 123 
// Digite numero 8: 62     Digite numero 8: 58
// Digite numero 9: 27     Digite numero 9: 74 
// Digite numero 10: 90    Digite numero 10: 39
// Digite numero de busca: 89  Digite numero de busca: 89 
//   VETOR                   VETOR 
// 1- 11                     1- 11
// 2- 16                     2- 15 
// 3- 23                     3- 23
// 4- 27                     4- 39 
// 5- 44                     5- 45 
// 6- 45                     6- 58 
// 7- 62                     7- 74 
// 8- 78                     8- 89 
// 9- 90                     9- 123 
// 10- 98                    10- 456 
//NÃO ENCONTRADO          posicao no vetor: 8

import javax.swing.JOptionPane;
public class Algoritmo497 {
    
    public static int busca(int[] vet, int tam, int chave) {
        int ini = 0;
        int fim = tam - 1;
        int meio;

        while (ini <= fim) {
            meio = (ini + fim) / 2;

            if (vet[meio] == chave) {
                return meio; 
            } else if (chave < vet[meio]) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }

        return -1; 
    }
    
    public static void ordena(int[] vet, int tam) {
        int aux;
        for (int l1 = 0; l1 < tam - 1; l1++) {
            for (int c1 = l1 + 1; c1 < tam; c1++) {
                if (vet[l1] > vet[c1]) {
                    aux = vet[l1];
                    vet[l1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
       
        ClassAlgoritmo497 buscar = new ClassAlgoritmo497();
        
        for (int l = 0; l < 10; l++) {
           buscar.num[l] = Integer.parseInt(JOptionPane.showInputDialog("Digite numero " + (l + 1) + ": "));
            
        }

       
        buscar.n = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de busca: "));
        
        ordena(buscar.num, buscar.num.length);

        
        buscar.posicao = busca(buscar.num, buscar.num.length, buscar.n);

        
        System.out.println("\nVETOR");
        for (int l = 0; l < buscar.num.length; l++) {
            System.out.println((l + 1) + " - " + buscar.num[l]);
        }

       
        if (buscar.posicao != -1) {
            System.out.println("\nPosicao no vetor: " + (buscar.posicao + 1));
        } else {
            System.out.println("\nNAO ENCONTRADO");
        }
    }
}
