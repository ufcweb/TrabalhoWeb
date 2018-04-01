/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author mathe
 */
public class Venda {
    private Usuario vendedor;
    private Double quantidadeCreditoVendido;
    private Date dataVenda;
    private Time horarioVenda;

    public Venda() {
        super();
    }
    

    public Venda(Usuario vendedor, Double quantidadeCreditoVendido, Date dataVenda, Time horarioVenda) {
        this.vendedor = vendedor;
        this.quantidadeCreditoVendido = quantidadeCreditoVendido;
        this.dataVenda = dataVenda;
        this.horarioVenda = horarioVenda;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        if (vendedor!=null) {
            this.vendedor = vendedor;
        }else{
            throw new IllegalArgumentException("Vendedor invalido");
        }
    }

    public Double getQuantidadeCreditoVendido() {
        return quantidadeCreditoVendido;
    }

    public void setQuantidadeCreditoVendido(Double quantidadeCreditoVendido) {
        if (quantidadeCreditoVendido !=null && quantidadeCreditoVendido>0) {
            this.quantidadeCreditoVendido = quantidadeCreditoVendido;
        }else{
            throw new IllegalArgumentException("Quantidade crédito invalida");
        }
        
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        if (dataVenda!=null) {
           this.dataVenda = dataVenda; 
        }else{
            throw new IllegalArgumentException("Data de venda inválida");
        }
    }

    public Time getHorarioVenda() {
        return horarioVenda;
    }

    public void setHorarioVenda(Time horarioVenda) {
        if (horarioVenda!=null) {
            this.horarioVenda = horarioVenda;
        }else{
            throw new IllegalArgumentException("Horario de venda invalido");
        }
        
    }
    
    
}
