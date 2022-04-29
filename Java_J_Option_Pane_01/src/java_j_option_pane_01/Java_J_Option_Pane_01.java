/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_j_option_pane_01;

import javax.swing.JOptionPane;

/**
 *
 * @author ALUNO
 */
public class Java_J_Option_Pane_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nome = "";
        int idade = 0;
        double altura = 0;
        float peso = 0;
        
        //Lendo dados usando a JOptionPane
        // FUNCIONA APENAS COM STRINGS - Precisa converter os outros tipos
   
        // ENTRADA DE DADOS (STRING)
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura, em metros: "));
        peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso, em quilos: "));
        
        // MOSTRAR A MENSAGEM (STRING)
        String saida = "DADOS DO PACIENTE\n";
        saida = saida + "Nome do Paciente: ";
        saida += nome;
        saida += "\nIdade: " + idade+" anos\n";
        saida += "Altura: " + altura+" m\n";
        saida += "Peso: " + peso + " Kg";
        
        
        // CAIXA DE MENSAGEM 
        JOptionPane.showMessageDialog(null, saida);
        
    }
    
}
