/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Modelo.InformacoesNutricionais;
import Modelo.Ingrediente;
import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class OpcaoComidaBean {
    private String nomeComida;
    private String categoria;
    private InformacoesNutricionaisBean informacoesNutricionais;
    private ArrayList<IngredienteBean> ingredientes;
    
    public OpcaoComidaBean(){
        
    }

    public String getNomeComida() {
        return nomeComida;
    }

    public void setNomeComida(String nomeComida) {
        this.nomeComida = nomeComida;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public InformacoesNutricionaisBean getInformacoesNutricionais() {
        return informacoesNutricionais;
    }

    public void setInformacoesNutricionais(InformacoesNutricionaisBean informacoesNutricionais) {
        this.informacoesNutricionais = informacoesNutricionais;
    }

    public ArrayList<IngredienteBean> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<IngredienteBean> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    
}
