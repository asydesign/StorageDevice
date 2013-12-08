/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab5;

/**
 *
 * @author fmi
 */
public class OperaionSystem {
    private MyInterface defaultSD;
    
    public OperaionSystem(MyInterface defaultSD){
        this.defaultSD = defaultSD;
    }
    public void setDefaultSD(MyInterface defaultSD){
        this.defaultSD = defaultSD;
    }
    public MyInterface getDefaultSD(){
        return defaultSD;
    }
     public void showSD(){
        System.out.println(defaultSD.read());
        System.out.println(defaultSD.write("hi"));
    }
}
