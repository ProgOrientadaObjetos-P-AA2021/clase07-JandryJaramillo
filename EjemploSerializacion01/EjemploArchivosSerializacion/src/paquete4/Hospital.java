package paquete4;

import java.io.Serializable;

public class Hospital implements Serializable{
    String nombre;
    int numeroCamas;
    double presupuesto;
    
    public Hospital(String n, int c,double p){
        nombre = n;
        numeroCamas = c;
        presupuesto = p;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerNumeroCamas(int c){
        numeroCamas = c;
    }
    
    public void establecerPresupuesto(double p){
        presupuesto = p;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerNumeroCamas(){
        return numeroCamas;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}