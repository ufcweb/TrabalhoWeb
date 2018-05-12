/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.UsuarioDAO;
import Helper.Permissoes;
import java.sql.SQLException;
import junit.framework.TestCase;
import modelBean.LoginBean;
import modelBean.TipoUsuarioBean;
import modelBean.UsuarioBean;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mathe
 */
public class TesteDAO  {
    
    public TesteDAO() throws SQLException {
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
        
    }
    
    
}
