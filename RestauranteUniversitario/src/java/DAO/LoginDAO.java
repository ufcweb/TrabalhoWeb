/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import modelBean.LoginBean;
import Modelo.Login;
import Modelo.Usuario;
import connections.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelBean.TipoUsuarioBean;
import modelBean.UsuarioBean;

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
    
    public static LoginBean Search(int ID) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String search = "SELECT * FROM LOGIN WHERE ID = "+ID;
        stmt = con.prepareStatement("SELECT * FROM LOGIN WHERE ID = ID");
        stmt.execute();
        rs = stmt.executeQuery(search);
        LoginBean l = new LoginBean();
        if (rs.next()) {
            l.setId(rs.getInt("ID"));
            l.setUsuario(rs.getString("usuario"));
            l.setSenha(rs.getString("senha"));
        }
        ConnectionFactory.closeConnection(con, stmt);
        return l;
    }
    
    public static UsuarioBean Search(LoginBean log){
        Connection con = null;
        String search = "SELECT * FROM LOGIN JOIN USUARIO ON (LOGIN.ID = USUARIO.LOGIN) JOIN TIPO_USUARIO ON (USUARIO.tipoUsuario=TIPO_USUARIO.ID) WHERE login = \""+log.getUsuario()+"\" AND senha = \""+log.getSenha()+"\" ";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        UsuarioBean usuario = new UsuarioBean();
        try {
            con = ConnectionFactory.getConnection();
            
            stmt = con.prepareStatement(search);
            stmt.execute();
            rs = stmt.executeQuery(search);
            LoginBean login = new LoginBean();
            TipoUsuarioBean tipoBean = new TipoUsuarioBean();
            if (rs.next()) {
                usuario.setId(rs.getInt("ID"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCreditos(rs.getDouble("creditos"));
                usuario.setEmail(rs.getString("email"));
                usuario.setCodigoIdentificador(rs.getInt("codIdentificador"));

                login.setId(rs.getInt("ID"));
                login.setSenha(rs.getString("senha"));
                login.setUsuario(rs.getString("usuario"));

                usuario.setLoginBean(login);

                tipoBean.setId(rs.getInt("ID"));
                tipoBean.setNivelAcesso(rs.getInt("nivelAcesso"));
                tipoBean.setPrecoCredito(rs.getDouble("preçoCredito"));

                usuario.setTipoUsuarioBean(tipoBean);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return usuario;
    }
    
    public static void Update() throws SQLException{
   
    }
}
