/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author fmi
 */
public class SSD extends StorageDevice {
   
     @Override
    public String read() {
      return "SSD reads"; 
    }

    @Override
    public String write(String data) {
      return "SSD writes";
    }
}
