/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

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
 * quantidadeProteina DOUBLE,
    lactose BOOLEAN,
    valorEnergetico DOUBLE,
    carboidratos DOUBLE,
    sodio DOUBLE,
    fibraAlimentar DOUBLE,
    gorduraTrans DOUBLE,
    goduraSaturada DOUBLE,
    gordurasTotais DOUBLE,
    porcaoGramas DOUBLE
 */

public class InformacoesNutricionaisDAO {
    public static void Add(InformacoesNutricionais in) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        //stmt = con.prepareStatement("INSERT INTO bibliotecario (NOME, TURNO) VALUES(?,?)");
        stmt = con.prepareStatement("INSERT INTO INFORMACOES_NUTRICIONAIS(quantidadeProteina, lactose, valorEnergetico, carboidratos, sodio, fibraAlimentar, gorduraTrans, goduraSaturada"
                + ", gordurasTotais, porcaoGramas) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        stmt.setDouble(1, in.getQuantidadeProteinas());
        stmt.setBoolean(2, in.getComidaLactosa());
        stmt.setDouble(3, in.getValorEnergetico());
        stmt.setDouble(4, in.getQuantidadeCarboidratos());
        stmt.setDouble(5, in.getQuantidadeSodio());
        stmt.setDouble(6, in.getFibraAlimentar());
        stmt.setDouble(7, in.getGorduraTrans());
        stmt.setDouble(8, in.getGorduraSaturada());
        stmt.setDouble(9, in.getGordurasTotais());
        stmt.setDouble(10, in.getPorcaoGramas());
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
    
    public static InformacoesNutricionais Search(int ID) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String search = "SELECT * FROM INFORMACOES_NUTRICIONAIS WHERE ID = "+ID;
        System.out.println(search);
        stmt = con.prepareStatement("SELECT * FROM INFORMACOES_NUTRICIONAIS WHERE ID = ID");
        rs = stmt.executeQuery(search);
        stmt.execute();
        InformacoesNutricionais a = new InformacoesNutricionais();
        if(rs.next()){
            System.out.println(rs.getDouble("quantidadeProteina"));
            a.setQuantidadeProteinas(rs.getDouble("quantidadeProteina"));
            a.setComidaLactosa(rs.getBoolean("lactose"));
            a.setFibraAlimentar(rs.getDouble("fibraAlimentar"));
            a.setGorduraSaturada(rs.getDouble("goduraSaturada"));
            a.setGorduraTrans(rs.getDouble("gorduraTrans"));
            a.setGordurasTotais(rs.getDouble("gordurasTotais"));
            a.setPorcaoGramas(rs.getDouble("porcaoGramas"));
            a.setQuantidadeCarboidratos(rs.getDouble("carboidratos"));
            
            a.setQuantidadeSodio(rs.getDouble("sodio"));
            a.setValorEnergetico(rs.getDouble("valorEnergetico"));
            InformacoesNutricionaisDAO.setID(a);
        }
        ConnectionFactory.closeConnection(con, stmt);
        return a;
    }
   
    
    public static void Update(InformacoesNutricionais c) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        InformacoesNutricionaisDAO.setID(c);
        stmt = con.prepareStatement("UPDATE INFORMACOE_NUTRICIONAIS SET dataInicial = ?, dataFinal = ? WHERE ID = ?");
        
        
        stmt.execute();
        ConnectionFactory.closeConnection(con, stmt);
    }
    
    public static InformacoesNutricionais setID (InformacoesNutricionais c) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs;
        String aaa = "SELECT * FROM INFORMACOES_NUTRICIONAIS WHERE quantidadeProteina = "+c.getQuantidadeProteinas()+" "
                + "AND lactose = "+c.getComidaLactosa()+" AND "
                + " valorEnergetico = "+c.getValorEnergetico()+" AND "
                + "carboidratos = "+c.getQuantidadeCarboidratos()+" AND "
                + "sodio = "+c.getQuantidadeSodio()+" AND "
                + "fibraAlimentar = "+c.getFibraAlimentar()+" AND "
                + "gorduraTrans = "+c.getGorduraTrans()+" AND "
                + "goduraSaturada = "+c.getGorduraSaturada()+" AND "
                + "gordurasTotais = "+c.getGordurasTotais()+" AND "
                + "porcaoGramas = "+c.getPorcaoGramas()+" ";
        System.out.println(aaa);
        stmt = con.prepareStatement(aaa);
        rs = stmt.executeQuery(aaa);
        if(rs.next()){
            c.setID(rs.getInt("ID"));
            System.out.println(c.getID());
        }else{
            System.out.println("SEM RESULTADO");
        }
        ConnectionFactory.closeConnection(con, stmt);
        return c;
    }
}
