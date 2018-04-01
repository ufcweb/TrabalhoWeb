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
public class RelatorioVendas extends Relatorio{
    private Cardapio cardapio;

    public RelatorioVendas() {
        super();
    }

    public RelatorioVendas(Date dataEmissao, Time horarioEmissao, ArrayList<Pagamento> registroPagamentos,Usuario gerador) {
        super(dataEmissao, horarioEmissao, registroPagamentos,gerador);
    }

    public RelatorioVendas(Cardapio cardapio, Date dataEmissao, Time horarioEmissao, ArrayList<Pagamento> registroPagamentos,Usuario gerador) {
        this(dataEmissao, horarioEmissao, registroPagamentos,gerador);
        this.setCardapio(cardapio);
    }
    

    public Cardapio getCardapio() {
        return cardapio;
    }

    public void setCardapio(Cardapio cardapio) {
        if (cardapio!=null) {
            this.cardapio = cardapio;
        }else{
            throw new IllegalArgumentException("Cardapio do relatorio invalido");
        }
    }
    
    
}
