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
public class Principal {
    public static void main(String[] args) {
        
        // Creacion de Obejto#1
        Equipo e=new Equipo();                                                  // Se crea un nuevo objeto con el contructor 1 que no recibe ningun valor
        e.agregar_nombre("Emelec");                                             // Se envia valores a las funciones de la clase Equipo
        e.agregar_num_jugadores(20);
        e.agregar_ciudad("Guayaquil");
        System.out.printf("Nombre:%s- Jugadores:%s -Ciudad:%s\n",e.obtener_nombre(),e.obtener_num_jugadores(),e.obtener_ciudad());
        // Creacion de Objeto#2
        Equipo e2=new Equipo("Liga de Loja");                                   // Se crea un nuevo objeto con el contructor 2 que recibe un valor String
        e2.agregar_num_jugadores(20);                                           // Se envia valores a las funciones de la clase Equipo que aun no tienen valor
        e2.agregar_ciudad("Loja");
        System.out.printf("Nombre:%s- Jugadores:%s -Ciudad:%s\n",e2.obtener_nombre(),e2.obtener_num_jugadores(),e2.obtener_ciudad());
        // Creacion de Obejto#3
        Equipo e3= new Equipo("Liga de Quito",30);                              // Se crea un nuevo objeto con el contructor 3 que recibe un valor String y un entero
        e3.agregar_ciudad("Quito");                                             // Se envia valores a las funciones de la clase Equipo que aun no tienen valor
        System.out.printf("Nombre:%s- Jugadores:%s -Ciudad:%s\n",e3.obtener_nombre(),e3.obtener_num_jugadores(),e3.obtener_ciudad());
        // Creacion de Obejto#4
        Equipo e4=new Equipo("Deportivo Cuenca",20,"Cuenca");                   // // Se crea un nuveo objeto con el contructor 4 que recibe 2 valores String y un entero
        System.out.printf("Nombre:%s- Jugadores:%s -Ciudad:%s\n",e4.obtener_nombre(),e4.obtener_num_jugadores(),e4.obtener_ciudad());
    }
}
