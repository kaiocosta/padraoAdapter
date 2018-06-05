/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoadapter;

/**
 *
 * @author Ramon
 */
public class Conversor extends ReceptorDigital implements IReceptorAnalogico{
    //Adaptador
    @Override
    public void receberSinalAnalogico()
    {
        receberSinalDigital();
    }
    
}
