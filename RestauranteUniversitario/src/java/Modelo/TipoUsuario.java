/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author mathe
 */
public class TipoUsuario {
    private Integer nivelAcesso;
    private Double precoCredito;
    

    public Integer getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(Integer nivelAcesso) {
        if (nivelAcesso!=null) {
            this.nivelAcesso = nivelAcesso;
        }else{
            throw new IllegalArgumentException("Nível de acesso inválido");
        }
    }

    public Double getPrecoCredito() {
        return precoCredito;
    }

    public void setPrecoCredito(Double precoCredito) {
        if (precoCredito!=null) {
            this.precoCredito = precoCredito;
        }else{
            throw new IllegalArgumentException("Preco de crédito inválido");
        }
        
    }
    
    
}
