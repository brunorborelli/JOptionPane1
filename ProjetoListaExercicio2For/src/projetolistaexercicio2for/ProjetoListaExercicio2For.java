/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetolistaexercicio2for;
import javax.swing.JOptionPane;
/**
 *
 * @author bruno
 */
public class ProjetoListaExercicio2For {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        String saida = "tabuada de multiplicar do numero" +numero+"\n";
        for(int contador=1;contador<=10;contador++){
            saida+=contador +"*"+ numero + "="+contador * numero+"\n";
        }
        JOptionPane.showMessageDialog(null, saida);
    }
    
}
