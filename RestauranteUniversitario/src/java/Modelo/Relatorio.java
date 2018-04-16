/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mathe
 */
public class Relatorio {
    private Date dataEmissao;
    private Time horarioEmissao;
    private ArrayList<Pagamento> registroPagamentos;
    private Usuario gerador;

    public Relatorio() {
        super();
    }

    public Relatorio(Date dataEmissao, Time horarioEmissao, ArrayList<Pagamento> registroPagamentos,Usuario gerador) {
        this.setDataEmissao(dataEmissao);
        this.setHorarioEmissao(horarioEmissao);
        this.setRegistroPagamentos(registroPagamentos);
        this.setGerador(gerador);
    }

    public Usuario getGerador() {
        return gerador;
    }

    public void setGerador(Usuario gerador) {
        if (gerador!=null) {
            this.gerador = gerador;
        }else{
            throw new IllegalArgumentException("Usuario gerador invalido");
        }
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        if (dataEmissao!=null) {
            this.dataEmissao = dataEmissao;
        }else{
            throw new IllegalArgumentException("Data de emissao do relatorio invalida");
        }
        
    }

    public Time getHorarioEmissao() {
        return horarioEmissao;
    }

    public void setHorarioEmissao(Time horarioEmissao) {
        if (horarioEmissao!=null) {
            this.horarioEmissao = horarioEmissao;
        }else{
            throw new IllegalArgumentException("Horário de emissao do relatorio invalido");
        }
        
    }

    public ArrayList<Pagamento> getRegistroPagamentos() {
        return registroPagamentos;
    }

    public void setRegistroPagamentos(ArrayList<Pagamento> registroPagamentos) {
        if (registroPagamentos!=null) {
            this.registroPagamentos = registroPagamentos;
        }else{
            throw new IllegalArgumentException("Lista de pagamentos inválida");
        }
        
    }
    
    
}
