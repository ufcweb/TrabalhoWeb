/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;


import DAO.UsuarioDAO;
import Helper.Permissoes;
import Modelo.*;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import modelBean.LoginBean;
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
        // TODO code application logic here
        String Log = "aaa";
        String search = "SELECT * FROM LOGIN WHERE login = \""+Log+"\" ";
        System.out.println(search);
        
        LoginBean l = new LoginBean();
        l.setId(1);
        l.setSenha("papaoo");
        l.setUsuario("385391");
        TipoUsuarioBean t = new TipoUsuarioBean();
        t.setId(1);
        t.setNivelAcesso(Permissoes.ALUNO_NORMAL);
        t.setPrecoCredito(Permissoes.PRECO_ALUNO_NORMAL);
        UsuarioBean a = new UsuarioBean();
        a.setId(1);
        a.setCodigoIdentificador(8474554);
        a.setCreditos(0.0);
        a.setEmail("matheusdin04@gmail.com");
        a.setNome("Matheus");
        a.setLoginBean(l);
        a.setTipoUsuarioBean(t);
        UsuarioDAO.Add(a);
        /*
        InformacoesNutricionais c = InformacoesNutricionaisDAO.Search(2);
        Venda v = VendaDAO.Search(1);
        Usuario u = UsuarioDAO.Search(1);
        TipoUsuario tu = TipoUsuarioDAO.Search(1);
        System.out.println(c.toString());
        System.out.println(v.toString());
        System.out.println(u.toString());
        System.out.println(tu.toString());
        
        InformacoesNutricionais c = new InformacoesNutricionais();
        c.setComidaLactosa(true);
        c.setFibraAlimentar(2.0);
        c.setGorduraSaturada(2.0);
        c.setGorduraTrans(2.0);
        c.setGordurasTotais(2.0);
        c.setPorcaoGramas(2.0);
        c.setQuantidadeCarboidratos(2.0);
        c.setQuantidadeProteinas(2.0);
        c.setQuantidadeSodio(2.0);
        c.setValorEnergetico(2.0);
        InformacoesNutricionaisDAO.Add(c);
        c = InformacoesNutricionaisDAO.setID(c);
        System.out.println(c.getID());
        
        Cardapio c = new Cardapio();
        Date d = new Date(118, 3, 20);
        Date d2 = new Date(118, 3, 27);
        c.setDataInicial(d);
        c.setDataFinal(d2);
        
        CardapioDAO.Update(c, d2, d);
        System.out.println(c.getID());
       
        OpcaoComida c = new OpcaoComida();
        c.setCategoria("aaqqqawww");
        c.setInformacoesAdicionaisCE(1);
        c.setNomeComida("qqww");
        
        OpcaoComidaDAO.Add(c);
        c = OpcaoComidaDAO.setID(c);
        
        System.out.println(c.getCategoria());
        OpcoesDiarias d = new OpcoesDiarias();
        //OpcaoOpcaoDiariasDAO.Add(c, d);
        
        
        Date d = new Date(118, 3, 11);
        Time t = new Time(1,1,1);
        Pagamento p = new Pagamento();
        Venda v = new Venda();
        v.setDataVenda(d);
        v.setHorarioVenda(t);
        v.setQuantidadeCreditoVendido(15555.0);
        v.setVendedorCE(1);
        VendaDAO.Add(v);
        p.setClienteCE(1);
        p.setPrecoTotal(2.0);
        p.setVendaCE(1);
        PagamentoDAO.Add(p);
        //RelatorioDAO.Add(d, t, 1);
        
        
        
        TipoUsuario t = new TipoUsuario();
        t.setNivelAcesso(1);
        t.setPrecoCredito(1.10);
        Login l = new Login();
        l.setUsuario("aaa");
        l.setSenha("bbb");
        Usuario u = new Usuario();
        u.setCodIdentificador((long)1);
        u.setEmail("aaaaaaa");
        u.setLoginCE(1);
        u.setTipo(1);
        u.setCreditos(0.0);
        u.setNome("alguem");
        
        TipoUsuarioDAO.Add(t);
        LoginDAO.Add(l);
        UsuarioDAO.Add(u);
        
        
        InformacoesNutricionais c = new InformacoesNutricionais();
        c.setComidaLactosa(true);
        c.setFibraAlimentar(2.0);
        c.setGorduraSaturada(2.0);
        c.setGorduraTrans(2.0);
        c.setGordurasTotais(2.0);
        c.setPorcaoGramas(2.0);
        c.setQuantidadeCarboidratos(2.0);
        c.setQuantidadeProteinas(2.0);
        c.setQuantidadeSodio(2.0);
        c.setValorEnergetico(2.0);
        InformacoesNutricionaisDAO.Add(c);
        InformacoesNutricionaisDAO.Remove(1);
        
         Cardapio c = new Cardapio();
        Date d = new Date(118, 3, 11);
        Date d2 = new Date(118, 3, 18);
       
        CardapioDAO.Update(4, d, d2);
        */
    }
    
}
