/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author User
 */
public abstract class Vehiculo { 
 private String apatente; 
 private String marca; 
 private double combustible; 

    public Vehiculo(String apatente, String marca, double combustible) {
        this.apatente = apatente;
        this.marca = marca;
        this.combustible = combustible;
    }

    public String getApatente() {
        return apatente;
    }

    public void setApatente(String apatente) {
        this.apatente = apatente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
  // Que la clase sea abstracta no significa que el contenido lo sea,Ej;los metodos getter y setter.
  //Por eso se declara el metodo como abstracto. 
    public abstract void Avanzar (double km); // Los metodos abstractos no llevan llaves"{}". Por que no tienen implementacion.
    
}
