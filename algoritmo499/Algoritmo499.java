/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package algoritmo499;

/**
 *
 * @author Anna
 */
// Criar um algoritmo que funcione de acordo com o menu a seguir, sabendo-se que 
// os vetores têm dimensão 5. Os itens 1, 2 e 3 são funções: 
// MENU VETOR - FUNCAO 
// 1. Dados do VETOR 
// 2. Ordena VETOR 
// 3. Imprime VETOR 
// 4. Sai do programa 
// OPÇÃO: 
// Apresentamos todas as telas para que você saiba o que pretendemos, inclusive 
// com proteções para os trechos 2 e 3 que dependem do trecho 1. Você pode imprimiro 
// vetor ordenado ou não. 
//   VÍDEO                    VÍDEO                    VÍDEO 
// MENU VETOR - FUNCAO    MENU VETOR - FUNCAO        MENU VETOR - FUNCAO 
// 1 Dados do VETOR       1 Dados do VETOR           1 Dados do VETOR 
// 2 Ordena VETOR         2 Ordena VETOR             2 Ordena VETOR 
// 3 Imprime VETOR        3 Imprime VETOR            3 Imprime VETOR 
// 4 Sai do programa      4 Sai do programa          4 Sai do programa 
// OPCAO:5                OPCAO:2                    OPCAO:3 
// Opcao invalida         Escolha primeiro opcao 1   Escolha primeiro opcao 1 
//   VÍDEO                     VÍDEO                   VÍDEO 
// MENU VETOR - FUNCAO    MENU VETOR - FUNCAO     MENU VETOR - FUNCAO 
// 1 Dados do VETOR       1 Dados do VETOR        1 Dados do VETOR 
// 2 Ordena VETOR 2       2 Ordena VETOR          2 Ordena VETOR 
// 3 Imprime VETOR        3 Imprime VETOR         3 Imprime VETOR 
// 4 Sai do programa      4 Sai do programa       4 Sai do programa 
// OPCAO:1                OPCAO:2                 OPCAO:4 
// Entrada do VETOR       MENU VETOR - FUNCAO     Saindo do algoritmo 
// Digite numero 1: 23 
// Digite numero 2: 45     1 Dados do VETOR
// Digite numero 3: 12     2 Ordena VETOR 
// Digite numero 4: 78     3 Imprime VETOR 
// Digite numero 5: 89     4 Sai do programa 
//                         OPCAO:3 
// MENU VETOR - FUNCAO 
//                         VETOR 
// 1 Dados do VETOR 
// 2 Ordena VETOR           12 
// 3 Imprime VETOR          23 
// 4 Sai do programa        45 
// OPCAO:3                  78 
//                          89 
//VETOR 
// 23 
// 45 
// 12 
// 78 
// 89

import javax.swing.JOptionPane;
public class Algoritmo499 {
    
     public static void entrada(int[] vet, int t) {
        JOptionPane.showMessageDialog(null, "\nEntrada do VETOR");
        for (int L = 0; L < t; L++) {
           vet[L] = Integer.parseInt(JOptionPane.showInputDialog("Digite número " + (L + 1) + ": "));
      }
    }

  
    public static void imprime(int[] vet, int t) {
            System.out.println("\nVETOR");
        for (int L = 0; L < t; L++) {
            System.out.println((L + 1) + " - " + vet[L]);
        }
    }
    
    public static void ordena(int[] vet, int tam) {
        int aux;
        for (int L1 = 0; L1 < tam - 1; L1++) {
            for (int c1 = L1 + 1; c1 < tam; c1++) {
                if (vet[L1] > vet[c1]) {
                    aux = vet[L1];
                    vet[L1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    } 

  
    public static void main(String[] args) {
        
        ClassAlgoritmo499 vetores = new  ClassAlgoritmo499();
        
        for (int L = 0; L < 5; L++) {
            vetores.num[L] = 0;
        }

        do {
           
            JOptionPane.showMessageDialog(null, "\n\n\nMENU VETOR - FUNÇÃO");
            JOptionPane.showMessageDialog(null, "1. Dados do VETOR");
            JOptionPane.showMessageDialog(null, "2. Ordena VETOR");
            JOptionPane.showMessageDialog(null, "3. Imprime VETOR");
            JOptionPane.showMessageDialog(null, "4. Sai do programa");
            vetores.op = Integer.parseInt(JOptionPane.showInputDialog("OPÇÃO: "));
           
            switch (vetores.op) {
                case 1: 
                    entrada(vetores.num, vetores.num.length);
                    vetores.flag = 1;
                    break;
                case 2: 
                    if (vetores.flag == 1) {
                        ordena(vetores.num, vetores.num.length);
                    } else {
                        JOptionPane.showMessageDialog(null, "\nEscolha primeiro opção 1");
                    }
                    break;
                case 3:
                    if (vetores.flag == 1) {
                        imprime(vetores.num, vetores.num.length);
                    } else {
                        JOptionPane.showMessageDialog(null, "\nEscolha primeiro opção 1");
                    }
                    break;
                case 4: 
                    JOptionPane.showMessageDialog(null, "\nSaindo do Algoritmo");
                    break;
                default: 
                    JOptionPane.showMessageDialog(null,"\nOpção inválida");
                    break;
            }
        } while (vetores.op != 4);
  }
}
    

