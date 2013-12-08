/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author fmi
 */
public class HDD extends StorageDevice {
         
    @Override
    public String read() {
      return "HDD reads"; 
    }

    @Override
    public String write(String data) {
      return "HDD writes";
    }
    
}
