/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Ingrediente;
import Modelo.OpcaoComida;
import connections.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Nicolas
 */
public class IngredienteDAO {
    public static void Add(Ingrediente i) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null; 
        stmt.execute();  
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    public static void Remove(int ID) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        stmt = con.prepareStatement("");
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    public static void Search(int ID) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        stmt = con.prepareStatement("SELECT * FROM INGREDIENTE WHERE ID = ID");
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    public static void Update() throws SQLException{
     Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        stmt = con.prepareStatement("SELECT * FROM INGREDIENTE WHERE ID = ID");
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
    }
}
