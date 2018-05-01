/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mathe
 */
public class CardapioBean {
    private Date dataFinal;
    private Date dataInicial;
    private ArrayList<OpcaoDiariaBean> opcoesDiarias;
    
    public CardapioBean(){
        
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public ArrayList<OpcaoDiariaBean> getOpcoesDiarias() {
        return opcoesDiarias;
    }

    public void setOpcoesDiarias(ArrayList<OpcaoDiariaBean> opcoesDiarias) {
        this.opcoesDiarias = opcoesDiarias;
    }
    
    
}
