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
public class PadraoAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TomadaEuropeia te = new TomadaEuropeia();
        
        AdaptadorTomada a = new AdaptadorTomada(te);
        a.ligarNaTomadaAmericana();
    }
    
}
