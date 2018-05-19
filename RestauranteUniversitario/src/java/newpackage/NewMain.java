/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;


import DAO.CardapioDAO;
import DAO.InformacoesNutricionaisDAO;
import DAO.LoginDAO;
import DAO.UsuarioDAO;
import Helper.Permissoes;
import Modelo.*;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import modelBean.CardapioBean;
import modelBean.LoginBean;
import modelBean.OpcaoDiariaBean;
import modelBean.TipoUsuarioBean;
import modelBean.UsuarioBean;

/**
 *
 * @author ValdeneidaRodrigues
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Login c = new Login();
        c.setUsuario("ARROZ");
        c.setSenha("2222222");
        c.setID(1);
        //LoginDAO.Add(c);
        LoginDAO.Update(c);
        
        /*
        CardapioBean cb = new CardapioBean();
        Date d = new Date(-20, 01, 10);
        Date d2 = new Date(18, 01, 15);
        cb.setId(1);
        cb.setOpcoesDiarias(new ArrayList<OpcaoDiariaBean>());
        cb.setDataInicial(d);
        cb.setDataFinal(d2);
        Cardapio p = new Cardapio(cb);
        CardapioDAO.Add(p);
        CardapioDAO.Update(p);
        
        /*
        InformacoesNutricionais i = new InformacoesNutricionais();
        InformacoesNutricionais j = new InformacoesNutricionais();
        i.setComidaLactosa(true);
        i.setPorcaoGramas(22.3);
        i.setQuantidadeLipidio(33.5);
        i.setQuantidadeProteinas(44.0);
        j.setComidaLactosa(true);
        j.setPorcaoGramas(33.2);
        j.setQuantidadeLipidio(22.3);
        j.setQuantidadeProteinas(22.4);
       // InformacoesNutricionaisDAO.Add(i);
        //InformacoesNutricionaisDAO.Add(j);
        i.setID(1);
        InformacoesNutricionaisDAO.Update(i);
*/
        //p = new Cardapio(cb);
    }
    
}
