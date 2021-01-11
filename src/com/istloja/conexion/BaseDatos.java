package com.istloja.conexion;

import java.sql.Connection;
import java.sql.DriverManager;


public class BaseDatos {

    private final String nombreBaseDatos = "bdEjercicio1";
    private final String usuario= "root";
    private final String contraseña = "Jonathan1234";
    private final String lineaBaseConexion= "jdbc:mysql://localhost:3306/"+nombreBaseDatos+"?useUnicode=true&use"
            + "JDBCCompliantTimezoneShift=true&useLegacyDatetmeCode=false&serverTimezone=UTC";
    public Connection conexion(){
        Connection connect = null;
        try{
            connect = (Connection)DriverManager.getConnection(lineaBaseConexion, usuario,contraseña);
            if (connect!=null) {
                System.out.println("Éxito en la conexión.");
               
            }
        }catch(Exception e){
            System.out.println("Error al conectar:" + e.getMessage());

        }            
        return connect;
    }

    
}

