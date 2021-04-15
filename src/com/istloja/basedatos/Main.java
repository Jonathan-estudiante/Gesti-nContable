package com.istloja.basedatos;

import com.istloja.conexion.BaseDatos;
import com.istloja.controlador.Personabd;
import com.istloja.modelo.Persona;
import com.istloja.vistas.gestionpersona;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BaseDatos base = new BaseDatos();
        base.conexion();

    }
}
