package com.istloja.basedatos;

import com.istloja.controlador.PersonaActualizar;
import com.istloja.controlador.PersonaEliminar;
import com.istloja.controlador.Personabd;
import com.istloja.modelo.Persona;

public class Main {

    public static void main(String[] args) {

        Personabd personabd = new Personabd();
        Persona persona = new Persona();

        persona.setCedula(2443253);

        persona.setNombres("fabiola");

        persona.setApellidos("Castro");

        persona.setDireccion("Guayaquil");

        persona.setCorreo("fc@gmail.com");

        persona.setTelefono("4333334");

        if (personabd.crearPersona(persona)) {
            System.out.println("Persona guardada exitosamente");

        } else {
            System.out.println("Error al guardar");
        }
//
//        PersonaActualizar personabd2 = new PersonaActualizar();
//        Persona personaA = new Persona();
//        personaA.setIdPersona(2);
//        personaA.setCedula(244122412);
//        personaA.setNombres("Juan G");
//        personaA.setApellidos("Castillo Serraza");
//        personaA.setDireccion("Loja");
//        personaA.setCorreo("jcwedw");
//        personaA.setTelefono("0992372332");
//
//        if (personabd2.actualizarPersona(personaA)) {
//            System.out.println("Persona actualizada exitosamente.");
//
//        } else {
//            System.out.println("Error al actualizar");
//        }
//
//        PersonaEliminar personabd3 = new PersonaEliminar();
//        Persona personaE = new Persona();
//
//        personaE.setIdPersona(3);
//        personaE.setCedula(244122412);
//        personaE.setNombres("Juan G");
//        personaE.setApellidos("Castillo Serraza");
//        personaE.setDireccion("Loja");
//        personaE.setCorreo("jcwedw");
//        personaE.setTelefono("0992372332");
//
//        if (personabd3.eliminarPersona(personaE)) {
//            System.out.println("Persona eliminada exitosamente.");
//
//        } else {
//            System.out.println("Error al eliminar");
//        }
     }
}
