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
    private Date dataVenda;
    private Time horarioVenda;
    private Double valor;

    public Venda() {
        super();
    }
    

    public Venda(Usuario vendedor, Double valor, Date dataVenda, Time horarioVenda) {
        this.setVendedor(vendedor);
        this.setDataVenda(dataVenda);
        this.setHorarioVenda(horarioVenda);
        this.setValor(valor);
        
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        if(valor != null && valor>0.0){
            this.valor = valor;
        }else{
            throw new IllegalArgumentException("Valor de venda inválido");
        }
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
