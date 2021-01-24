package com.istloja.basedatos;

import com.istloja.controlador.Lista;
import com.istloja.controlador.PersonaActualizar;
import com.istloja.controlador.PersonaEliminar;
import com.istloja.controlador.Personabd;
import com.istloja.modelo.Persona;
import com.istloja.vistas.gestionpersona;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Personabd personabd = new Personabd();
//        Persona persona = new Persona(7,"1150662094", "Julia Carla", "Perez Martínez","Loja","jcperez@tecnologicoloja.edu.ec","0997746483");
//
//        if (personabd.crearPersona(persona)) {
//            System.out.println("Persona guardada exitosamente");
//
//        } else {
//            System.out.println("Error al guardar");
//        }
//        PersonaActualizar personabd2 = new PersonaActualizar();
//        Persona personaA = new Persona(4,"1150662094", "Julia Carla", "Perez Martínez","Loja","jcperez@tecnologicoloja.edu.ec","0997746483");
//
//        if (personabd2.actualizarPersona(personaA)) {
//            System.out.println("Persona actualizada exitosamente.");
//
//        } else {
//            System.out.println("Error al actualizar");
//        }
//        PersonaEliminar personabd3 = new PersonaEliminar();
//        Persona persona = new Persona(4);
//        if (personabd3.eliminarPersona(persona)) {
//            System.out.println("Persona eliminada exitosamente.");
//
//        } else {
//            System.out.println("Error al eliminar");
//        }
//        Lista lista = new Lista();
//        for (Persona arg : lista.obtenerPersona()) {
//            System.out.println(arg);
//        }
//        gestionpersona gp = new gestionpersona();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = entrada.nextInt();
        if (num/1000000000 != 0) {
            System.out.println("su numero debe empezar por cero");
        }else{
            System.out.println("Numero correcto");
        }
    }
}
