/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioFinal;

/**
 *
 * @author Carlos Juca
 */
public class Equipo {

    private String nombre;                                                      // Inicializacion del atributo nombre de modo privado
    private int num_jugadores;                                                  // Inicializacion del atributo num_jugadores de modo privado
    private String ciudad;                                                      // Inicializacion del atributo ciudad de modo privado

    public String obtener_nombre() {                                            // Metodo para obtener nombre
        return nombre;
    }

    public int obtener_num_jugadores() {                                        // Metodo para obtener el numero de jugadores
        return num_jugadores;
    }

    public String obtener_ciudad() {                                            // Metodo para obtener la ciudad
        return ciudad;
    }

    public void agregar_nombre(String name) {                                   // Metodo void para agregar valor al atributo nombre
        nombre = name;
    }

    public void agregar_num_jugadores(int number) {                             // Metodo void para agregar valor al atrubuto num_jugadores
        num_jugadores = number;
    }

    public void agregar_ciudad(String city) {                                   // Metodo void para agregar valor al atributo ciudad
        ciudad = city;
    }

    public Equipo() {                                                           // Costructor 1 que no recibe ningun parametro
        
    }

    public Equipo(String x) {                                                   // Costructor 2 que recibe un parametro de tipo String
        agregar_nombre(x);
    }

    public Equipo(String x, int y) {                                            // Costructor 3 que recibe 2 parametros de tipo String e int 
        agregar_nombre(x);
        agregar_num_jugadores(y);

    }

    public Equipo(String x, int y, String z) {                                  // Costructor 4 que recibe 3 parametro 2 de tipo String y 1 tipo int  
        agregar_nombre(x);
        agregar_num_jugadores(y);
        agregar_ciudad(z);
    }
}
