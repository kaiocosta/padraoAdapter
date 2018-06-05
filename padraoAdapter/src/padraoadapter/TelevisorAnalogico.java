/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoadapter;

/**
 *
 * @author Kaioj
 */
public class TelevisorAnalogico {

    /**
     * @param args the command line arguments
     */
    
    //Cliente
    public static void main(String[] args) 
    {
        Conversor conversorDigital = new Conversor();
        conversorDigital.receberSinalAnalogico();
    }
}
