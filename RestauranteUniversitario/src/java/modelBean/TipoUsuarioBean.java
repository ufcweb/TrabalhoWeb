/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelBean;

import Helper.Administrador;
import Helper.Cliente;
import Helper.Nutricionista;
import Helper.Vendedor;

/**
 *
 * @author mathe
 */
public class TipoUsuarioBean {
    private int id;
    private Integer nivelAcesso;
    private Double precoCredito;

    public TipoUsuarioBean() {
    }

    public Integer getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(Integer nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public Double getPrecoCredito() {
        return precoCredito;
    }

    public void setPrecoCredito(Double precoCredito) {
        this.precoCredito = precoCredito;
    }

    public int getId() {
       return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
            
}
