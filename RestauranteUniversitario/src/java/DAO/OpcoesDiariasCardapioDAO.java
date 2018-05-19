/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import connections.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelBean.CardapioBean;
import modelBean.OpcaoDiariaBean;

/**
 *
 * @author ValdeneidaRodrigues
 */
public class OpcoesDiariasCardapioDAO {
    public void Add() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        stmt.execute();
        
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    public void Remove(int ID) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        stmt = con.prepareStatement("DELETE FROM OPCOES_DIARIAS_CARDAPIO WHERE ID = ?");
        stmt.setInt(1, ID);
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    public void Search() throws SQLException{
    
    }
    
    public boolean Update(CardapioBean c,OpcaoDiariaBean d) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String update = "UPDATE OPCOES_DIARIAS_CARDAPIO SET ID=? WHERE ID="; //aaaaaaaaaaaaaaaa
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
        return true;
    }
}
