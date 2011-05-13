/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jandora.loader;

import java.io.File;
import org.jandora.loader.exception.NoFileException;
import org.jandora.loader.image.BmpLoader;

/**
 *
 * @author d.rodionov
 */
public class LoaderFactory {
    
    public static Loader getLoader(String Type,String source) throws NoFileException{
        if(new File(source).exists()){
            throw new NoFileException("Cant't find "+source+" file");
        }
        return new BmpLoader();
    }
}
