/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import modelBean.LoginBean;
import modelBean.TipoUsuarioBean;
import modelBean.UsuarioBean;
import Modelo.TipoUsuario;
import Modelo.Usuario;
import connections.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ValdeneidaRodrigues
 * ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 * nome VARCHAR(255),
 * codIdentificador LONG,
 * email VARCHAR(255),
 * creditos DOUBLE,
 * login INT,
 * tipoUsuario INT,
 */
public class UsuarioDAO {
    public static Boolean Add(UsuarioBean c){
        PreparedStatement stmt = null;
        
        Connection con = null;
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement("INSERT INTO USUARIO(nome, codIdentificador, email, creditos, login, tipoUsuario) VALUES(?, ?, ?, ?, ?, ?)");
            stmt.setString(1, c.getNome());
            stmt.setLong(2, c.getCodigoIdentificador());
            stmt.setString(3, c.getEmail());
            stmt.setDouble(4, c.getCreditos());
            stmt.setInt(5, c.getLoginBean().getId());
            stmt.setInt(6, c.getTipoUsuarioBean().getId());
            if(stmt.execute()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        ConnectionFactory.closeConnection(con, stmt);
        return true;
    }
    
    public static Boolean Remove(UsuarioBean ub){
        PreparedStatement stmt = null;
        Connection con = null;
        try {
            con = ConnectionFactory.getConnection();
            stmt = con.prepareStatement("DELETE FROM USUARIO WHERE ID = ?");
            stmt.setInt(1, ub.getId());
            if(stmt.execute()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        ConnectionFactory.closeConnection(con, stmt);
        return false;
    }
    
    public static UsuarioBean Search(UsuarioBean ub){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Connection con = null;
        UsuarioBean l = new UsuarioBean();
        try {
            con = ConnectionFactory.getConnection();
            String search = "SELECT * FROM USUARIO WHERE ID = "+ub.getId();
            stmt = con.prepareStatement("SELECT * FROM USUARIO WHERE ID = ?");
            stmt.execute();
            rs = stmt.executeQuery(search);
            if (rs.next()) {
                l.setId(rs.getInt("ID"));
                l.setCodigoIdentificador(rs.getInt("codIdentificador"));
                l.setCreditos(rs.getDouble("creditos"));
                l.setEmail(rs.getString("email"));
                l.setLoginBean((LoginBean)rs.getObject("login"));
                l.setNome(rs.getString("nome"));
                l.setTipoUsuarioBean((TipoUsuarioBean)rs.getObject("tipoUsuario"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConnectionFactory.closeConnection(con, stmt);
        return l;
    }
    
    
    public static boolean Update(UsuarioBean usuario){
        return true;
    }
    
    public static Usuario setID (Usuario c) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs;
        String aaa = "SELECT * FROM RELATORIO WHERE nome = \""+c.getEmail()+"\" "
                + "AND email = \""+c.getEmail()+"\"  "
                + "AND creditos = "+c.getCreditos()+" "
                + "AND codIdentificador = "+c.getCodIdentificador()+" "
                + "AND login = "+c.getLogin()+" "
                + "AND tipoUsuario = "+c.getTipoUsuario()+" ";
        
        stmt = con.prepareStatement(aaa);
        rs = stmt.executeQuery(aaa);
        if(rs.next()){
            c.setID(rs.getInt("ID"));
        }
        ConnectionFactory.closeConnection(con, stmt);
        return c; 
    }
}
