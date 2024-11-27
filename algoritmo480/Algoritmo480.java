/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package algoritmo480;

/**
 *
 * @author Anna
 */
// Um número é capicua quando lido da esquerda para a direita ou da direita para a 
// esquerda. O ano 2002 é um ano capicua. Elabore uma função que verifique essa 
// característica. 
//  VÍDEO 
// digite numero: 123 
// 123 - 321 
// Nao e um numero capicua 
// digite numero: 2002 
// 2002 - 2002 
// E um numero capicua

import javax.swing.JOptionPane;
public class Algoritmo480 {
    
    public static int reverso(int num) {
        int soma = 0, r;

        while (num != 0) {
            r = num % 10;
            soma = soma * 10 + r; 
            num = num / 10; 
        }

        return soma;
    }

    public static void main(String[] args) {
       
        ClassAlgoritmo480  capicua = new ClassAlgoritmo480();
        
       capicua.n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
      

        capicua.x = reverso(capicua.n);

        System.out.println("\n" + capicua.n + " - " + capicua.x);

        if (capicua.x == capicua.n) {
            System.out.println("\nEh um numero capicua.");
        } else {
            System.out.println("\nNao eh um numero capicua.");
    }
  }
}
