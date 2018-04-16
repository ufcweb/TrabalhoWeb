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
public class SolicitacaoReembolso {
    private Usuario usuario;
    private Date date;
    private Time horario;

    public SolicitacaoReembolso(Usuario usuario, Date date, Time horario) {
        this.usuario = usuario;
        this.date = date;
        this.horario = horario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        if(usuario != null){
            this.usuario = usuario;
        }  
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        if(date != null){
            this.date = date;
        }
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        if(horario != null){
            this.horario = horario;
        }  
    }
    
    
}
