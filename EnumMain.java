/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enummain;
import enummain.EnumPlanetas;
import enummain.TesteEnumPlaneta;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Usuario
 */
public class EnumMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String planeta;
        boolean controle = true;
       do{ 
        try{ 
        System.out.println("Para qual planeta quer viajar?");
        planeta = entrada.next().toUpperCase();
        
        TesteEnumPlaneta pl = new TesteEnumPlaneta(planeta); 
        pl.viajarPlaneta();
        }catch(IllegalArgumentException erro){
            System.out.println("Este valor está fora da constante do programa!");
            entrada.nextLine();
            controle = false;
        }
       }while(controle);
    }
    
}
