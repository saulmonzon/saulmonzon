/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author J@mes
 */
public class conexionSQL {
    Connection con;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Escuela","Saul","12345");
                  
            //JOptionPane.showMessageDialog(null,"Connection status: OK");
        }catch (Exception e)
        {
                    JOptionPane.showMessageDialog(null,"Connection error");
                            }
            return con;
    }    
    
}
