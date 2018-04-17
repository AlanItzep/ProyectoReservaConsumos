/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SONY
 */
public class Conexion {
    public String db = "dbreservahotelparaiso";
    public String url = "jdbc:mysql://192.168.1.3/"+db;
    public String user = "usuarioreserva";
    public String pass = "usuarioreserva18";
    
    public Conexion(){
    }
    
    public Connection conectar(){
        Connection link = null;
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(this.url,this.user,this.pass);
        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showConfirmDialog(null, e);
        }   
        return link;
    }
}
