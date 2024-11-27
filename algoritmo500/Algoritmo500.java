/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package algoritmo500;

/**
 *
 * @author Anna
 */
// Criar um algoritmo que funcione de acordo com o menu a seguir, sabendo-se que 
// os vetores têm dimensão 5. Os itens 1, 2, 3 e 4 são funções: 
//       VETORES 
// 1. Dados do VETOR A 
// 2. Dados do VETOR B 
// 3 Imprime VETORES 
// 4. Soma VETORES 
// 5. Subtrai VETORES 
// 6. Sai do programa 
// OPÇÃO: 
// Apresentamos todas as telas para que você saiba o que pretendemos inclusive 
// com proteções para os trechos 3, 4 e 5 que dependem dos trechos 1 e 2. 
//     VÍDEO                               VÍDEO 
//     VETORES                            VETORES 
// 1 Dados do VETOR A               1 Dados do VETOR A 
// 2 Dados do VETOR B               2 Dados do VETOR B 
// 3 Imprime VETORES                3 Imprime VETORES 
// 4 Soma VETORES                   4 Soma VETORES 
// 5 Subtrai VETORES                5 Subtrai VETORES 
// 6 Sai do programa                6 Sai do programa 
// OPCAO:7                          OPCAO:4 
// Opcao invalida                   Escolha primeiro opcoes 1 e 2 
//    VETORES                            VETORES 
// 1 Dados do VETOR A               1 Dados do VETOR A 
// 2 Dados do VETOR B               2 Dados do VETOR B 
// 3 Imprime VETORES                3 Imprime VETORES 
// 4 Soma VETORES                   4 Soma VETORES 
// 5 Subtrai VETORES                5 Subtrai VETORES 
// 6 Sai do programa                6 Sai do programa 
// OPCAO:3 O                        PCAO:5 
// Escolha primeiro opcoes 1 e 2    Escolha primeiro opcoes 1 e 2 
// VETORES                               VETORES                   VETORES 
// 1 Dados do VETOR A               1 Dados do VETOR A       1 Dados do VETOR A 
// 2 Dados do VETOR B               2 Dados do VETOR B       2 Dados do VETOR B 
// 3 Imprime VETORES                3 Imprime VETORES        3 Imprime VETORES 
// 4 Soma VETORES                   4 Soma VETORES           4 Soma VETORES 
// 5 Subtrai VETORES                5 Subtrai VETORES        5 Subtrai VETORES 
// 6 Sai do programa                6 Sai do programa        6 Sai do programa 
// OPCAO: 1                         OPCAO:2                  OPCAO:3 
// Entrada do VETOR A               Entrada do VETOR B       VETOR A 
// Digite numero 1: 10              Digite numero 1: 5 
// Digite numero 2 9                Digite numero 2 4          10 
// Digite numero 3: 8               Digite numero 3: 3          9 
// Digite numero 4: 7               Digite numero 4: 2          8 
// Digite numero 5: 6               Digite numero 5: 1          7 
//                                                              6 
//                                                            VETOR B 
//                                                              5 
//                                                              4 
//                                                              3 
//                                                              2 
//                                                              1 
//      VETORES                         VETORES                         VETORES 
// 1 Dados do VETOR A              1 Dados do VETOR A           1 Dados do VETOR A 
// 2 Dados do VETOR B              2 Dados do VETOR B           2 Dados do VETOR B 
// 3 Imprime VETORES               3 Imprime VETORES            3 Imprime VETORES 
// 4 Soma VETORES                  4 Soma VETORES               4 Soma VETORES 
// 5 Subtrai VETORES               5 Subtrai VETORES            5 Subtrai VETORES 
// 6 Sai do programa               6 Sai do programa            6 Sai do programa 
// OPCAO:4                         OPCAO:5                      OPCAO:6 
// SOMA                            DIFERENCA                    Saindo do Algoritmo 
// 15                                 5 
// 13                                 5 
// 11                                 5 
// 9                                  5 
// 7                                  5

import javax.swing.JOptionPane;
public class Algoritmo500 {
    
     public static void entrada(int[] vet, String nomeVetor) {
        System.out.println("\nEntrada do VETOR " + nomeVetor);
        for (int i = 0; i < vet.length; i++) {
          vet[i] =  Integer.parseInt(JOptionPane.showInputDialog("Digite número " + (i + 1) + ": "));
            
        }
    }

    public static void imprime(int[] vet, String nomeVetor) {
        System.out.println("\nVETOR " + nomeVetor);
        for (int i = 0; i < vet.length; i++) {
            System.out.println((i + 1) + " - " + vet[i]);
        }
    }

    public static void soma(int[] vetA, int[] vetB) {
        System.out.println("\nSOMA");
        for (int i = 0; i < vetA.length; i++) {
            System.out.println((vetA[i] + vetB[i]));
        }
    }

    public static void subtrai(int[] vetA, int[] vetB) {
        System.out.println("\nDIFERENCA");
        for (int i = 0; i < vetA.length; i++) {
            System.out.println((vetA[i] - vetB[i]));
        }
    }

    public static void main(String[] args) {
        
        ClassAlgoritmo500 menu = new ClassAlgoritmo500();
        
        for(int L = 0; L < 5; L++){
               menu.num[L] = 0;
               menu.num1[L] = 0;

        do {
            JOptionPane.showMessageDialog(null, "\n\nVETORES");
            JOptionPane.showMessageDialog(null, "1. Dados do VETOR A");
            JOptionPane.showMessageDialog(null, "2. Dados do VETOR B");
            JOptionPane.showMessageDialog(null, "3. Imprime VETORES");
            JOptionPane.showMessageDialog(null, "4. Soma VETORES");
            JOptionPane.showMessageDialog(null, "5. Subtrai VETORES");
            JOptionPane.showMessageDialog(null, "6. Sai do programa");
            menu.op = Integer.parseInt(JOptionPane.showInputDialog("OPÇÃO: "));

            switch (menu.op) {
                case 1:
                    entrada(menu.num, "A");
                    menu.flag = 1;
                    break;
                case 2:
                    entrada(menu.num1, "B");
                    menu.flag1 = 1;
                    break;
                case 3:
                    if (menu.flag != 0 && menu.flag1 != 0) {
                        imprime(menu.num, "A");
                        imprime(menu.num1, "B");
                    } else {
                        JOptionPane.showMessageDialog(null, "\nEscolha primeiro as opções 1 e 2.");
                    }
                    break;
                case 4:
                    if (menu.flag != 0 && menu.flag1 != 0) {
                        soma(menu.num, menu.num1);
                    } else {
                        JOptionPane.showMessageDialog(null, "\nEscolha primeiro as opções 1 e 2.");
                    }
                    break;
                case 5:
                    if (menu.flag != 0 && menu.flag1 != 0) {
                        subtrai(menu.num, menu.num1);
                    } else {
                        JOptionPane.showMessageDialog(null, "\nEscolha primeiro as opções 1 e 2.");
                    }
                    break;
                case 6:
                   JOptionPane.showMessageDialog(null, "\nSaindo do Algoritmo...");
                    break;
                default:
                   JOptionPane.showMessageDialog(null, "\nOpção inválida.");
                    break;
            }
        } while (menu.op != 6);
    }
  }
}
    