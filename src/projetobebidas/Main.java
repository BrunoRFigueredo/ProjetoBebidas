/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobebidas;

import javax.swing.JOptionPane;


/**
 *
 * @author SATC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        
       String bebidas="";
        for (Bebidas b : Bebidas.values()) {
            bebidas += b.toString();
        }
       String escolha = JOptionPane.showInputDialog(bebidas);
       
    for (Bebidas b : Bebidas.values()){
    if(b.getNome().toUpperCase().contains(escolha.toUpperCase())){
    JOptionPane.showMessageDialog(null, "Você escolheu a bebida: "+b.toString());
    
    
    }
    
    }
       
    
       
       
       
    }  
}
