/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author fmi
 */
public class StorageDevice implements StorageDeviceInterface{
        
    @Override
    public String read() {
      return "Default Device reads";  
    }

    @Override
    public String write(String data) {
      return "Default Device writes";
    }
    
    
}
