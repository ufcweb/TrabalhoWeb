/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import modelBean.InformacoesNutricionaisBean;
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
    public static boolean Update(InformacoesNutricionaisBean c) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String update = "UPDATE INFORMACOES_NUTRICIONAIS SET ID=?,quantidadeProteina=?"
                + ", lactose=?, porcaoGramas=?,lipidio=? WHERE ID =" + c.getId();
        stmt = con.prepareStatement(update);
        stmt.setInt(1,c.getId());
        stmt.setDouble(2,c.getQuantidadeProteinas());
        //stmt.setBoolean(3,c.getComidaLactosa());
        stmt.setBoolean(3,c.getLactosa());
        stmt.setDouble(4,c.getPorcaoGramas());
        //stmt.setDouble(5,c.getQuantidadeSodio());
        stmt.setDouble(5,c.getLipidios());
        //rs = stmt.executeQuery(update);
        /*
        String pesquisa = "SELECT * FROM INFORMACOES_NUTRICIONAIS WHERE ID="+c.getID();
        stmt = con.prepareStatement(pesquisa);
        rs = stmt.executeQuery(pesquisa);
        InformacoesNutricionais aux = new InformacoesNutricionais();
        if(rs.next()){
            aux.setID(c.getID());
            if(rs.getDouble("quantidadeProteina")!=c.getQuantidadeProteinas()) 
                aux.setQuantidadeProteinas(c.getQuantidadeProteinas());
            else{
                aux.setQuantidadeProteinas(rs.getDouble("quantidadeProteinas"));
            }
            if(rs.getBoolean("lactose")!=c.getComidaLactosa()) 
                aux.setComidaLactosa(c.getComidaLactosa());
            else{
                aux.setComidaLactosa(rs.getBoolean("lactose"));
            }
            if(rs.getDouble("lipidios")!=c.getQuantidadeSodio())
                aux.setQuantidadeLipidio(c.getQuantidadeSodio());
            else{
                aux.setQuantidadeLipidio(rs.getDouble("lipidios"));
            }
            if(rs.getDouble("porcaoGramas")!=c.getPorcaoGramas())
                aux.setPorcaoGramas(c.getPorcaoGramas());
            else{
                aux.setPorcaoGramas(rs.getDouble("porcaoGramas"));
            }
        }
        stmt = con.prepareStatement("UPTADE INFORMACOES_NUTRICIONAIS quantidadeProteinas=?"
                + ",lactose=?,lipidios=?,porcaoGramas=? WHERE ID=?");
        stmt.setDouble(1, aux.getQuantidadeProteinas());
        stmt.setBoolean(2, aux.getComidaLactosa());
        stmt.setDouble(3, aux.getQuantidadeSodio());
        stmt.setDouble(4, aux.getPorcaoGramas());
        */
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
        return true;
    }
}
