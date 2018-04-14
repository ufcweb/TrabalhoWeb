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
    private int ID;
    private String nomeComida;
    private String categoria;
    private InformacoesNutricionais informacoesAdicionais;
    private int informacoesAdicionaisCE;

    public OpcaoComida() {
        super();
    }
    
    public OpcaoComida(String nomeComida, String categoria, InformacoesNutricionais informacoesAdicionais) {
        this.setNomeComida(nomeComida);
        this.setCategoria(categoria);
        this.setInformacoesAdicionais(informacoesAdicionais);
    }

    public int getInformacoesAdicionaisCE() {
        return informacoesAdicionaisCE;
    }

    public void setInformacoesAdicionaisCE(int informacoesAdicionaisCE) {
        this.informacoesAdicionaisCE = informacoesAdicionaisCE;
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
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "OpcaoComida{" + "ID=" + ID + ", nomeComida=" + nomeComida + ", categoria=" + categoria + ", informacoesAdicionais=" + informacoesAdicionais + ", informacoesAdicionaisCE=" + informacoesAdicionaisCE + '}';
    }
    
    
    
}
