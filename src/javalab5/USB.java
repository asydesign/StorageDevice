/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author fmi
 */
public class USB extends StorageDevice {
      
      @Override
    public String read() {
      return "USB reads"; 
    }

    @Override
    public String write(String data) {
      return "USB writes";
    }
      
    
}
