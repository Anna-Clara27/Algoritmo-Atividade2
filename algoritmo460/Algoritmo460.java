/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package algoritmo460;

/**
 *
 * @author Anna
 */
// Criar um algoritmo que possa entrar com três números e, para cada um, imprimir 
// o dobro. Usar uma função que retorne valor. 
//   VÍDEO 
// digite numero: 12 
// dobro: 24 
// digite numero: 45 
// dobro: 90 
// digite numero: 78 
// dobro: 156 

import javax.swing.JOptionPane;
public class Algoritmo460 {
    
        public static int dob(int x) {
        return x * 2;
    }

    public static void main(String[] args) {
        
        ClassAlgoritmo460 dobro = new ClassAlgoritmo460();
        
           for (int c = 1; c <= 3; c++) {
            dobro.a = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
           
            System.out.println("Dobro: " + dob(dobro.a));
     }
   }
}



    

    

     
   

