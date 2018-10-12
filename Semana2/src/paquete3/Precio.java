/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author Carlos Juca
 */
public class Precio {

    private double euros;

    public double obtener() {
        return euros;
    }

    public void agregar(double x) {
        euros = x;
    }

    public Precio() {
        agregar(30.2);
    }
    public Precio(double y){
        agregar(y);
    }
}
