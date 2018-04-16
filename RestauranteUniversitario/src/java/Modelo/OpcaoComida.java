/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mathe
 */
public class OpcaoComida {
    private String nomeComida;
    private String categoria;
    private InformacoesNutricionais informacoesAdicionais;
    private List<Ingrediente> ingredientes;

    public OpcaoComida() {
        super();
    }
    
    public OpcaoComida(String nomeComida, String categoria, InformacoesNutricionais informacoesAdicionais,
                        List<Ingrediente> ingredientes) {
        this.setNomeComida(nomeComida);
        this.setCategoria(categoria);
        this.setIngredientes(ingredientes);
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

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        if(ingredientes!=null && ingredientes.size()>0){
            this.ingredientes = ingredientes;
        }else{
            throw new IllegalArgumentException("Ingredientes não foram expecificados");
        }
    }
    
    
    
}
