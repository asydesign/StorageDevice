/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab5;

/**
 *Създайте класове представящи различни устройства за запис и четене на информация. 
 * (USB drive, HDD, SSD)  Те имплементират общ интерфейс с 2 метода read(), write().
 * Дефинирайте клас за обект Операционна Система който ползва тези устройства. 
 * Той трябва да има метод който ни позволява да сменим устройството за четене и запис * setStorageDevice(...). 
 * Демонстрирайте чете и запис на данни от обект от клас Операционна Система.
 * 
 */
public class JavaApplication {


    public static void main(String[] args){ 
       
      StorageDevice storageDevice =  new StorageDevice();
      
      OperaionSystem myWin = new StorageDevice("USB");

       myWin.showSD();
      
    }
}
