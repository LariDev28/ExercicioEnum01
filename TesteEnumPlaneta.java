/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enummain;

/**
 *
 * @author Usuario
 */
public class TesteEnumPlaneta {
    EnumPlanetas planeta;
    
    TesteEnumPlaneta(String planeta){
        this.planeta = EnumPlanetas.valueOf(planeta);
    }
    
    public void viajarPlaneta(){
        switch(planeta){
            case MERCURIO: 
                System.out.println("Muito quente!");
                break;
            case TERRA: 
                System.out.println("Ja estamos aqui!");
                break;
            case URANO:
                System.out.println("Muito longe!");
                break;
            default:
                System.out.println("Passagens esgotadas!");
                break;
        }
    }
    
}
