/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mathe
 */
public class OpcaoDiaria {
    private Date dataRefeicao;
    private String diaSemana;
    private ArrayList<OpcaoComida> opcoes;
    
    public OpcaoDiaria(){
        super();
    }

    public OpcaoDiaria(Date dataRefeicao, String diaSemana, ArrayList<OpcaoComida> opcoes) {
        this.dataRefeicao = dataRefeicao;
        this.diaSemana = diaSemana;
        this.opcoes = opcoes;
    }

    public Date getDataRefeicao() {
        return dataRefeicao;
    }

    public void setDataRefeicao(Date dataRefeicao) {
        if(dataRefeicao!=null){
            this.dataRefeicao = dataRefeicao;
        }else{
            throw new IllegalArgumentException("Data inválida");
        }
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        if (diaSemana!=null) {
            this.diaSemana = diaSemana;
        }else{
            this.diaSemana = "";
        }
        
    }

    public ArrayList<OpcaoComida> getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(ArrayList<OpcaoComida> opcoes) {
        if(opcoes!=null){
            this.opcoes = opcoes;
        }else{
            throw new IllegalArgumentException("Nenhuma opção inserida");
        }
        
    }
    
    
}
