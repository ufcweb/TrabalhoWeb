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
    private int ID;
    private Double precoTotal;
    private Venda venda;
    private int vendaCE;
    private Usuario cliente;
    private int clienteCE;

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

    public int getVendaCE() {
        return vendaCE;
    }

    public void setVendaCE(int vendaCE) {
        this.vendaCE = vendaCE;
    }

    public int getClienteCE() {
        return clienteCE;
    }

    public void setClienteCE(int clienteCE) {
        this.clienteCE = clienteCE;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "ID=" + ID + ", precoTotal=" + precoTotal + ", venda=" + venda + ", vendaCE=" + vendaCE + ", cliente=" + cliente + ", clienteCE=" + clienteCE + '}';
    }
    
    
}
