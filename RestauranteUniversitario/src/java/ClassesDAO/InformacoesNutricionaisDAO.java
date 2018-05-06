/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import Bean.InformacoesNutricionaisBean;
import Modelo.Cardapio;
import Modelo.InformacoesNutricionais;
import connections.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ValdeneidaRodrigues
 * private int id;
    private Double quantidadeProteinas;
    private Boolean lactosa;
    private Double lipidios;
    private Double porcaoGramas;
 */

public class InformacoesNutricionaisDAO {
    public static void Add(InformacoesNutricionais in) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        //stmt = con.prepareStatement("INSERT INTO bibliotecario (NOME, TURNO) VALUES(?,?)");
        stmt = con.prepareStatement("INSERT INTO INFORMACOES_NUTRICIONAIS(quantidadeProteina, lactose, porcaoGramas, lipidio) VALUES(?, ?, ?, ?)");
        stmt.setDouble(1, in.getQuantidadeProteinas());
        stmt.setBoolean(2, in.getComidaLactosa());
        stmt.setDouble(3, in.getPorcaoGramas());
        stmt.setDouble(4, in.getQuantidadeSodio());
        
        stmt.execute();
        
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    public static void Remove(int ID) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        stmt = con.prepareStatement("DELETE FROM INFORMACOES_NUTRICIONAIS WHERE ID = ?");
        stmt.setInt(1, ID);
        stmt.execute();
        
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    public static InformacoesNutricionaisBean Search(int ID) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String search = "SELECT * FROM INFORMACOES_NUTRICIONAIS WHERE ID = "+ID;
        System.out.println(search);
        stmt = con.prepareStatement("SELECT * FROM INFORMACOES_NUTRICIONAIS WHERE ID = ID");
        rs = stmt.executeQuery(search);
        stmt.execute();
        InformacoesNutricionaisBean a = new InformacoesNutricionaisBean();
        if(rs.next()){
            System.out.println(rs.getDouble("quantidadeProteina"));
            a.setId(rs.getInt("ID"));
            a.setQuantidadeProteinas(rs.getDouble("quantidadeProteina"));
            a.setLactosa(rs.getBoolean("lactose"));
            a.setPorcaoGramas(rs.getDouble("porcaoGramas"));
            a.setLipidios(rs.getDouble("lipidio"));
        }
        ConnectionFactory.closeConnection(con, stmt);
        return a;
    }
   
    
    public static void Update(InformacoesNutricionais c) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    
}
