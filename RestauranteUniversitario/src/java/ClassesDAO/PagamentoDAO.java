/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import Modelo.Cardapio;
import Modelo.OpcoesDiarias;
import Modelo.Pagamento;
import connections.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ValdeneidaRodrigues
 * ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 * precoTotal DOUBLE,
 * venda INT,
 * cliente INT,
 */
public class PagamentoDAO {
    public static void Add(Pagamento c) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        stmt = con.prepareStatement("INSERT INTO PAGAMENTO(precoTotal, venda, cliente) VALUES(?, ? , ?)");
        stmt.setDouble(1, c.getPrecoTotal());
        stmt.setLong(2, c.getVendaCE());
        stmt.setLong(3, c.getClienteCE());
        stmt.execute();
        
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    public static void Remove(int ID) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        stmt = con.prepareStatement("DELETE FROM PAGAMENTO WHERE ID = ?");
        stmt.setInt(1, ID);
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    public static Pagamento Search(int ID) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String search = "SELECT * FROM PAGAMENTO WHERE ID = "+ID;
        stmt = con.prepareStatement("SELECT * FROM PAGAMENTO WHERE ID = ID");
        stmt.execute();
        rs = stmt.executeQuery(search);
        Pagamento l = new Pagamento();
        if (rs.next()) {
            l.setID(rs.getInt("ID"));
            l.setClienteCE(rs.getInt("cliente"));//FAZER UM RS PRA RETORNAR OS DADOS DO USUARIO E FAZER UM OBJETO
            l.setPrecoTotal(rs.getDouble("precoTotal"));
            l.setVendaCE(rs.getInt("venda"));//FAZER UM RS PRA RETORNAR OS DADOS DA VENDA E FAZER UM OBJETO
        }
        ConnectionFactory.closeConnection(con, stmt);
        return l;
    }
    
    public static void Update() throws SQLException{
    
    }
    
    public static Pagamento setID(Pagamento c) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs;
        String aaa = "SELECT * FROM PAGAMENTO WHERE precoTotal = "+c.getPrecoTotal()+" AND cliente = "+c.getClienteCE()+" AND venda = "+c.getVendaCE();
        
        stmt = con.prepareStatement(aaa);
        rs = stmt.executeQuery(aaa);
        if(rs.next()){
            c.setID(rs.getInt("ID"));
        }
        ConnectionFactory.closeConnection(con, stmt);
        return c;
    }
}
