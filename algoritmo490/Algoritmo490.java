/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package algoritmo490;

/**
 *
 * @author Anna
 */
//Criar uma função que receba um vetor de caracteres, seu tamanho e um caractere 
// e retire todas as ocorrências desse caractere no vetor, colocando * em seu lugar. A função deve retornar o total de caracteres retirados do vetor. 
// digite palavra em letras minusculas 1: escola 
// digite palavra em letras minusculas 2: sacada 
// digite palavra em letras minusculas 3: algoritmos 
// digite palavra em letras minusculas 4: festa 
// digite palavra em letras minusculas 5: escada 
// digite palavra em letras minusculas 6: cantar 
// digite palavra em letras minusculas 7: tocar 
// digite palavra em letras minusculas 8: estudar 
// digite palavra em letras minusculas 9: pancada 
// digite palavra em letras minusculas 10: cansei 
// 1 - es*ola 
// 2 - sa*ada 
// 3 - algoritmos 
// 4 - festa 
// 5 - es*ada 
// 6 - *antar 
// 7 - to*ar 
// 8 - estudar 
// 9 - pan*ada 
// 10 - *ansei 

import javax.swing.JOptionPane;
public class Algoritmo490 {
    
    public static int restantes(char[] vet, int tam, char x) {
        int cont = 0;

        for (int i = 0; i < tam; i++) {
            if (vet[i] == x) {
                vet[i] = '*'; 
                cont++; 
            }
        }

        return cont;
    }

    public static void main(String[] args) {
        
         ClassAlgoritmo490 caracteres = new  ClassAlgoritmo490();
         
          for (int L = 0; L < 10; L++) {
          caracteres.nome[L] = JOptionPane.showInputDialog("Digite palavra em letras minúsculas " + (L + 1) + ": ");
       }

        
        for (int L = 0; L < 10; L++) {
            char[] chars = caracteres.nome[L].toCharArray();
            restantes(chars, chars.length, 'c');
            caracteres.nome[L] = new String(chars);
        }

        
        for (int L = 0; L < 10; L++) {
            System.out.println((L + 1) + " - " + caracteres.nome[L]);
     }
   }
}
