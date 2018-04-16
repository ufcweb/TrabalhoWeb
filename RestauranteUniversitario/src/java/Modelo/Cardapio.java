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
public class Cardapio {
    private Date dataInicial;
    private Date dataFinal;
    private ArrayList<OpcaoDiaria> opcoesDiarias;

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        if (dataInicial!=null) {
            this.dataInicial = dataInicial;
        }else{
            throw new IllegalArgumentException("Data inválida");
        }
        
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        if (dataFinal!=null) {
            this.dataFinal = dataFinal;
        }else{
            throw new IllegalArgumentException("Data inválida");
        }
    }

    public ArrayList<OpcaoDiaria> getOpcoesDiarias() {
        return opcoesDiarias;
    }

    public void setOpcoesDiarias(ArrayList<OpcaoDiaria> opcoesDiarias) {
        if (opcoesDiarias!=null) {
            this.opcoesDiarias = opcoesDiarias;
        }else{
            throw new IllegalArgumentException("Opções diárias vazias");
        }
        
    }
    
    
}
