/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.reverseengineering.model;

/**
 *
 * @author USUARIO
 */
public class D {

    @Override
    public String toString() {
        return "D{" + '}';
    }
    
    
    
    public E m(){
        System.out.println("return E from D");
        return new E(5, 0.1F, 'a', "Hello");
    }
}