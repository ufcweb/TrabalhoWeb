/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import Bean.LoginBean;
import Bean.TipoUsuarioBean;
import Bean.UsuarioBean;
import Modelo.TipoUsuario;
import Modelo.Usuario;
import connections.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    public static void Add(Usuario c) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        stmt = con.prepareStatement("INSERT INTO USUARIO(nome, codIdentificador, email, creditos, login, tipoUsuario) VALUES(?, ?, ?, ?, ?, ?)");
        stmt.setString(1, c.getNome());
        stmt.setLong(2, c.getCodIdentificador());
        stmt.setString(3, c.getEmail());
        stmt.setDouble(4, c.getCreditos());
        stmt.setInt(5, c.getLogin().getID());
        stmt.setInt(6, c.getTipoUsuario().getID());
        stmt.execute();
        
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    public void Remove(int ID) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        stmt = con.prepareStatement("DELETE FROM USUARIO WHERE ID = ?");
        stmt.setInt(1, ID);
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    public static UsuarioBean Search(int ID) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String search = "SELECT * FROM USUARIO WHERE ID = "+ID;
        stmt = con.prepareStatement("SELECT * FROM USUARIO WHERE ID = ID");
        stmt.execute();
        rs = stmt.executeQuery(search);
        UsuarioBean l = new UsuarioBean();
        if (rs.next()) {
            l.setId(rs.getInt("ID"));
            l.setCodigoIdentificador(rs.getInt("codIdentificador"));
            l.setCreditos(rs.getDouble("creditos"));
            l.setEmail(rs.getString("email"));
            l.setLoginBean((LoginBean)rs.getObject("login"));
            l.setNome(rs.getString("nome"));
            l.setTipoUsuarioBean((TipoUsuarioBean)rs.getObject("tipoUsuario"));
        }
        ConnectionFactory.closeConnection(con, stmt);
        return l;
    }
    
    
    public static void Update() throws SQLException{
    
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
