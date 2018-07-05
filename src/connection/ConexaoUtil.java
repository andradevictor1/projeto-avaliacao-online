/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Victor
 */
public class ConexaoUtil {
    
    private static ConexaoUtil conexaoUtil;
    
    public static ConexaoUtil getInstance(){
       if (conexaoUtil == null){
           conexaoUtil = new ConexaoUtil();
       }
       return conexaoUtil;
    }

   
    public Connection getConnection () throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdc:mysql://localhost:3306/online","root","");
    }
    
    public static void main(String[] args){
        try{
            System.out.println(getInstance().getConnection());
        } catch (ClassNotFoundException | SQLException e){
        }
    }
}
