/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author Rodrigues
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Jose";
        String nome2 = "Jose";
        String nome3 = new String("Jose");
        String res;
//        res = (nome1==nome3) ? "igual":"diferente"; // vai ver se são extritamente iguais

// vai ver se o que esta dentro é igual ou diferente
        res = (nome1.equals(nome3)) ? "igual":"diferente";
        System.out.println(res);

        
    }
    
}
