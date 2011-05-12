/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.stegano.loader.exception;

/**
 *
 * @author d.rodionov
 */
public class NoFileException extends Exception{
    
    public NoFileException(){
        super("Cant't find specified file");
    }
    
    public NoFileException(String message){
        super(message);
    }
    
    public NoFileException(Throwable cause) {
        super(cause); 
    }
}
