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
public class OpcaoComida {
    private String nomeComida;
    private String categoria;
    private InformacoesNutricionais informacoesAdicionais;

    public OpcaoComida() {
        super();
    }
    
    public OpcaoComida(String nomeComida, String categoria, InformacoesNutricionais informacoesAdicionais) {
        this.setNomeComida(nomeComida);
        this.setCategoria(categoria);
        this.setInformacoesAdicionais(informacoesAdicionais);
    }

    public String getNomeComida() {
        return nomeComida;
    }

    public void setNomeComida(String nomeComida) {
        if (nomeComida!=null) {
            this.nomeComida = nomeComida;
        }else{
            this.nomeComida="";
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria!=null) {
            this.categoria = categoria;
        }else{
            this.categoria="";
        }
        
    }

    public InformacoesNutricionais getInformacoesAdicionais() {
        return informacoesAdicionais;
    }

    public void setInformacoesAdicionais(InformacoesNutricionais informacoesAdicionais) {
        if(informacoesAdicionais!=null){
           this.informacoesAdicionais = informacoesAdicionais; 
        }else{
            throw new IllegalArgumentException("Informaçõe da comida estão vazias");
        }
        
    }
    
    
}
