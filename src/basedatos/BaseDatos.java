package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class BaseDatos {

    private final String nombreBaseDatos = "bdEjercicio1";
    private final String usuario= "root";
    private final String contraseña = "Jonathan1234";
    private final String lineaBaseConexion= "jdbc:mysql://localhost:3306/"+nombreBaseDatos+"?useUnicode=true&use"
            + "JDBCCompliantTimezoneShift=true&useLegacyDatetmeCode=false&serverTimezone=UTC";
    public boolean conexionMySqQL(){
        Connection connect = null;
        try{
            connect = DriverManager.getConnection(lineaBaseConexion, usuario,contraseña);
            if (connect!=null) {
                return true;
            }
        }catch(Exception e){
            System.out.println("Error al conectar:" + e.getMessage());

        }            
        return false;
    }
        public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"Conectando con la base de datos...");
        BaseDatos conectar = new BaseDatos();

        if (conectar.conexionMySqQL()) {
            JOptionPane.showMessageDialog(null,"Éxito");
            
        }else{
            JOptionPane.showMessageDialog(null,"Fallo en la conexión");
        }
    }
}

