/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import modelBean.UsuarioBean;
import Modelo.Usuario;
import Modelo.Venda;
import connections.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelBean.VendaBean;

/**
 *
 * @author ValdeneidaRodrigues
 * ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    vendedor INT,
    quantidadeCredito DOUBLE,
    data DATE,
    horario TIME,
 */
public class VendaDAO {
    public static void Add(Venda c) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        stmt = con.prepareStatement("INSERT INTO VENDA(vendedor, quantidadeCredito, data, horario) VALUES(?, ?, ?, ?)");
        stmt.setInt(1, c.getVendedor().getID());
        stmt.setDouble(2, c.getValor());
        stmt.setDate(3, (Date)c.getDataVenda());
        stmt.setTime(4, c.getHorarioVenda());
        stmt.execute();
        
        
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    public void Remove(int ID) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        stmt = con.prepareStatement("DELETE FROM VENDA WHERE ID = ?");
        stmt.setInt(1, ID);
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    public static Venda Search(int ID) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String search = "SELECT * FROM VENDA WHERE ID = "+ID;
        stmt = con.prepareStatement("SELECT * FROM VENDA WHERE ID = ID");
        stmt.execute();
        rs = stmt.executeQuery(search);
        Venda l = new Venda();
        if (rs.next()) {
            l.setID(rs.getInt("ID"));
            l.setDataVenda((Date)rs.getDate("dataVenda"));
            l.setHorarioVenda(rs.getTime("horario"));
            l.setValor(rs.getDouble("quantidadeCredito"));
            l.setVendedor((Usuario)rs.getObject("vendedor"));
        }
        ConnectionFactory.closeConnection(con, stmt);
        return l;
    }
    
    
    public static boolean Update(VendaBean c) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String update = "UPDATE VENDA SET ID=?, vendendor=?, quantidadeCredito=?,"
                + "dataVenda=?,horario=? WHERE ID="+c.getID();
        stmt = con.prepareStatement(update);
        stmt.setInt(1, c.getID());
        stmt.setInt(2, c.getVendedor().getID());
        stmt.setDouble(3,c.getValorVenda());
        stmt.setDate(4,(Date)c.getDataVenda());
        stmt.setTime(5,c.getHorarioVenda());
        stmt.execute();
        ConnectionFactory.closeConnection(con,stmt);
        return true;
    }
    /*
    public static Venda setID (Venda c) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs;
        String aaa = "SELECT * FROM RELATORIO WHERE vendedor = "+c.getVendedor().getID()+" AND quantidadeCredito = "+c.getValor()+""
                + " AND data = "+(Date)c.getDataVenda()+" AND horario = "+c.getHorarioVenda()+" ";
        
        stmt = con.prepareStatement(aaa);
        rs = stmt.executeQuery(aaa);
        if(rs.next()){
            c.setID(rs.getInt("ID"));
        }
        ConnectionFactory.closeConnection(con, stmt);
        return c; 
    }*/
}
