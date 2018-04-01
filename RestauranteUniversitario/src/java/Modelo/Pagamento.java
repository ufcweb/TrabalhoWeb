/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author mathe
 */
public class Pagamento {
    private Double precoTotal;
    private Venda venda;
    private Usuario cliente;

    public Pagamento() {
        super();
    }
    
    public Pagamento(Double precoTotal, Venda venda, Usuario cliente) {
        this.precoTotal = precoTotal;
        this.venda = venda;
        this.cliente = cliente;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        if (precoTotal!=null && precoTotal>0) {
            this.precoTotal = precoTotal;
        }else{
            throw new IllegalArgumentException("Preco da venda invalido");
        }
        
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        if (venda!=null) {
             this.venda = venda;
        }else{
            throw new IllegalArgumentException("Venda invalida");
        }
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        if (cliente!=null) {
            this.cliente = cliente;
        }else{
            throw new IllegalArgumentException("Cliente invalido");
        }
        
    }
    
    
}
