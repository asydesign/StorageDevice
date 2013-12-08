/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab5;

/**
 *
 * @author fmi
 */
public class StorageDevice implements MyInterface{
        
    @Override
    public String read() {
      return "Default Device reads";  
    }

    @Override
    public String write(String data) {
      return "Default Device writes";
    }
    
    
}
