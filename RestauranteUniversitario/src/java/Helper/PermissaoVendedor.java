/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import Modelo.Usuario;
import Modelo.Venda;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author mathe
 */
public class PermissaoVendedor implements Vendedor {

    @Override
    public Boolean venderCredito(Usuario usuario, Double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean validarVenda(Venda venda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Venda gerarVenda(Usuario vendedor, Double valor, Time horario, Date data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean debitarCredito(Usuario usuario, Double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
