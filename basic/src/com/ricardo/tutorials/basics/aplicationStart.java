package com.ricardo.tutorials.basics;
import javax.swing.JOptionPane;


public class aplicationStart {
    
    public static void main (String [] args)
    {
        
        
        Demo myObject = new Demo();
        
        Demo myObjectSecond = new Demo (50, "hola mundo");
        
        double resultado = myObject.Suma(2.5, 3.9);
        
	System.out.println("Suma: " + resultado);
        
       JOptionPane.showMessageDialog(null, "Result of 12.5+3.9: " + myObject.Suma(12.5, 3.9));
        
    
    }
    
    
    
}
