/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package algoritmo470;

/**
 *
 * @author Anna
 */
// Criar uma função que verifique se um número é primo.

import javax.swing.JOptionPane;
public class Algoritmo470 {
    
    public static int primo(int n) {
        int c = 0, p = 2;

        while (c == 0 && p <= n / 2) {
            if (n % p == 0) {
                c = 1; 
            }
            p++;
        }
        return c;
    }

    public static void main(String[] args) {
        
        ClassAlgoritmo470 verifica = new ClassAlgoritmo470();
        
        verifica.num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero >0: ")); 

        verifica.pri = primo(verifica.num); 

   if(verifica.pri ==0) {
       System.out.println("\nO numero " + verifica.num + " eh primo.");  
  } else {
   System.out.println("\nO numero " + verifica.num + " nao eh primo.");
  }    
 }
}
