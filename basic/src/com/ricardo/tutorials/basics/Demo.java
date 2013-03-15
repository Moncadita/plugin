
package com.ricardo.tutorials.basics;

public class Demo {
    
    public String pdemo = "hi, i'm ricardo Moncada";
    private String pvtdemo ="soy, visible solo a lo names de mis clases ";
    public final double mathPi = 4.5154;
    public static int staticdemo = 0; 
            
            
            
    public Demo() { 
       System.out.println("Default constructor... " + staticdemo);
       String hola = "nanooooo";
    }
    
    public Demo(int a,String b){
        System.out.println("Demo 2do constructor");
    }
    
    public double Multiplicacion(double a, double b){
        return a*b;
        
    }
     public double Suma(double a, double b){
        return a+b;
        
    }
    
    private void Ambitodevariable(){
        String hi ="nanooo";
    }
    
    public String getPvtdemo(){
        return pvtdemo;
    }
}
