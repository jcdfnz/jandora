/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jandora.loader;

/**
 *
 * @author d.rodionov
 */
public abstract class Loader {
    
    public static final String PNG = "png";
    public static String JPEG = "jpeg";
    public static String BMP = "bmp";
    
    public abstract boolean load(String filename);
    
    
}
