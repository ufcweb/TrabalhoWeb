/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author mathe
 */
public class PagamentoBean {
    private VendaBean venda;
    private UsuarioBean cliente;
    
    public PagamentoBean(){
        
    }

    public VendaBean getVenda() {
        return venda;
    }

    public void setVenda(VendaBean venda) {
        this.venda = venda;
    }

    public UsuarioBean getCliente() {
        return cliente;
    }

    public void setCliente(UsuarioBean cliente) {
        this.cliente = cliente;
    }
}
