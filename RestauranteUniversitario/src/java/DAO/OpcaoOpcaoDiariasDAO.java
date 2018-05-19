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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelBean.OpcaoComidaBean;
import modelBean.OpcaoDiariaBean;

/**
 *
 * @author ValdeneidaRodrigues
 */
public class OpcaoOpcaoDiariasDAO {
    public static void Add(OpcaoComida c, OpcaoDiaria d) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = stmt.executeQuery("SELECT * FROM OPCAO WHERE ID = ?");
        stmt.setInt(1, c.getId());
        ResultSet rs2 = stmt.executeQuery("SELECT * FROM WHERE ID = ?");
        stmt.setInt(2, d.getID());
        while(rs.next()){
            System.out.println(rs.getString("nomeComida"));
        }
        stmt = con.prepareStatement("INSERT INTO");
        stmt.execute();
        
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    public void Remove(int ID) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        stmt = con.prepareStatement("DELETE FROM OPCAO_OPCOES_DIARIAS WHERE ID = ?");
        stmt.setInt(1, ID);
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    public void Search() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
    }
    
    public boolean Update(OpcaoComidaBean c,OpcaoDiariaBean d) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String update = "UPDATE OPCAO_OPCOES_DIARIAS SET ID=ID, ID_opcao=?, ID_opcoesDiarias=?,"
                + "WHERE ID=ID"; //qual ID colocar, eis o problema
        stmt = con.prepareStatement(update);
        stmt.setInt(1,c.getId());
        stmt.setInt(2,d.getId());
        stmt.execute();
        ConnectionFactory.closeConnection(con,stmt);
        return true;
    }
}
