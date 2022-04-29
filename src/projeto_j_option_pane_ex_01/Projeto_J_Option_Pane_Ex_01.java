/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto_j_option_pane_ex_01;
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno Borelli
 */
public class Projeto_J_Option_Pane_Ex_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero = 0;
        long fatorial = 1;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        for(int aux = numero; aux > 1; aux--){
            fatorial = fatorial + aux;
        }
        
        String saida= "O fatorial de " +numero+ " é igual " + fatorial;
        JOptionPane.showMessageDialog(null, saida);
       
    }
    
}
