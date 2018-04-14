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
    private int ID;
    private Date dataInicial;
    private Date dataFinal;
    private ArrayList<OpcoesDiarias> opcoesDiarias;
    private int opcoesDiariasCE;

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

    public int getOpcoesDiariasCE() {
        return opcoesDiariasCE;
    }

    public void setOpcoesDiariasCE(int opcoesDiariasCE) {
        this.opcoesDiariasCE = opcoesDiariasCE;
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

    public ArrayList<OpcoesDiarias> getOpcoesDiarias() {
        return opcoesDiarias;
    }

    public void setOpcoesDiarias(ArrayList<OpcoesDiarias> opcoesDiarias) {
        if (opcoesDiarias!=null) {
            this.opcoesDiarias = opcoesDiarias;
        }else{
            throw new IllegalArgumentException("Opções diárias vazias");
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
        return "Cardapio{" + "ID=" + ID + ", dataInicial=" + dataInicial + ", dataFinal=" + dataFinal + ", opcoesDiarias=" + opcoesDiarias + ", opcoesDiariasCE=" + opcoesDiariasCE + '}';
    }
    
    
}
