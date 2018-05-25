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
public class AdaptadorTomada extends TomadaAmericana{
    
    private TomadaEuropeia tomadaEuropeia;
    
    public AdaptadorTomada(TomadaEuropeia tomadaEuropeia){
        this.tomadaEuropeia = tomadaEuropeia;
    }
    
    /**
     *
     */
    @Override
    public void ligarNaTomadaAmericana(){
        tomadaEuropeia.ligarNaTomadaEuropeia();
    }
}
