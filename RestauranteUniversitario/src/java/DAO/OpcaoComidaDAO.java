/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.OpcaoComida;
import Modelo.OpcaoDiaria;
import connections.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ValdeneidaRodrigues
 * ~ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nomeComida VARCHAR(30),
    categoria VARCHAR(30),
    ID_informacoesNutricionais INT,
 */
public class OpcaoComidaDAO {
    public static void Add(OpcaoComida c) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        stmt = con.prepareStatement("INSERT INTO OPCAO(nomeComida, categoria) VALUES(?, ?)");
        stmt.setString(1, c.getNomeComida());
        stmt.setString(2, c.getCategoria());
        stmt.execute();
        
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    public static void Remove(int ID) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        stmt = con.prepareStatement("DELETE FROM OPCAO WHERE ID = ?");
        stmt.setInt(1, ID);
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
    }
    //RETORNAR TDS AS OPCOES EM UM ARRAY, PARA O ADM CONSEGUIR VISUALIZAR EM ALGUM METODO
    public static OpcaoComida Search(int ID) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String search = "SELECT * FROM OPCAO WHERE ID = "+ID;
        stmt = con.prepareStatement("SELECT * FROM OPCAO WHERE ID = ID");
        stmt.execute();
        rs = stmt.executeQuery(search);
        OpcaoComida l = new OpcaoComida();
        if (rs.next()) {
            l.setID(rs.getInt("ID"));
            l.setCategoria(rs.getString("categoria"));
            l.setNomeComida(rs.getString("nomeComida"));
        }
        ConnectionFactory.closeConnection(con, stmt);
        return l;
    }
    
    public static OpcaoComida setID(OpcaoComida c) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs;
        String a = ""+c.getCategoria()+"";
        System.out.println(a);
        String aaa = "SELECT * FROM OPCAO WHERE nomeComida = \""+c.getNomeComida()+"\" AND categoria = \""+c.getCategoria()+"\"";
        
        stmt = con.prepareStatement(aaa);
        rs = stmt.executeQuery(aaa);
        if(rs.next()){
            c.setID(rs.getInt("ID"));
        }
        ConnectionFactory.closeConnection(con, stmt);
        return c;
    }
}
