/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.stegano;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.stegano.loader.Loader;
import org.stegano.loader.LoaderFactory;
import org.stegano.loader.exception.NoFileException;

/**
 *
 * @author d.rodionov
 */
public class Main {
    
   
    
    public static void main(String[] argc){
        try {
            Loader loader = LoaderFactory.getLoader(Loader.BMP,argc[0]);
        } catch (NoFileException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
