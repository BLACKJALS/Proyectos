/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objectpool;

/**
 *
 * @author Alejandro
 */
public class Reusable {
    //Obtenemos el Reusable del pool
    Reusable reusable = ReusablePool.getInstance().acquiereReusable(); 
    //Se libera
    Reusable reusable1 = ReusablePool.getInstance().releaseReusable(reusable);
    
    
}