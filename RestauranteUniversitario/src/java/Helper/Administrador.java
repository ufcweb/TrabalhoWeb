/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import Modelo.Relatorio;
import Modelo.RelatorioVendas;
import Modelo.SolicitacaoReembolso;
import Modelo.Usuario;
import java.util.Date;

/**
 *
 * @author mathe
 */
public interface Administrador extends Vendedor {
    
    public Boolean addUsuario(Usuario usuario);
    public Boolean alterarUsuario(Usuario usuario);
    public Boolean removerUsuario(Usuario usuario);
    public Usuario obterUsuario(Usuario usuario);
    
    public RelatorioVendas verRelatorioVendas(Date data);
    public Relatorio verRelatorioGeral(Date data);
    
    public Boolean analisarSolicitacaoReembolso(SolicitacaoReembolso solicitacaoReembolso);
}
