/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import Modelo.Login;
import connections.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ValdeneidaRodrigues
 */
public class LoginDAO {
    public static void Add(Login c) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        stmt = con.prepareStatement("INSERT INTO LOGIN(usuario, senha) VALUES (?, ?)");
        stmt.setString(1, c.getUsuario());
        stmt.setString(2, c.getSenha());
        stmt.execute();
        
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    public static void Remove(int ID) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        stmt = con.prepareStatement("DELETE FROM LOGIN WHERE ID = ID");
        
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    public static Login Search(int ID) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String search = "SELECT * FROM LOGIN WHERE ID = "+ID;
        stmt = con.prepareStatement("SELECT * FROM LOGIN WHERE ID = ID");
        stmt.execute();
        rs = stmt.executeQuery(search);
        Login l = new Login();
        if (rs.next()) {
            l.setID(rs.getInt("ID"));
            l.setUsuario(rs.getString("usuario"));
            l.setSenha(rs.getString("senha"));
        }
        ConnectionFactory.closeConnection(con, stmt);
        return l;
    }
    
    public static void Update() throws SQLException{
    
    }
}
