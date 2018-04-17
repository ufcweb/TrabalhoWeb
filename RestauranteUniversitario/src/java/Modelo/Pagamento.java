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
    private Venda venda;
    private Usuario cliente;

    public Pagamento() {
        super();
    }
    
    public Pagamento(Venda venda, Usuario cliente) {
        this.setVenda(venda);
        this.setCliente(cliente);
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
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "ID=" + ID + ", venda=" + venda +  ", cliente=" + cliente + '}';
    }
    
    
}
