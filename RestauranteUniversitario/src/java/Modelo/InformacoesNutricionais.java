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
public class InformacoesNutricionais {
    private int ID;
    private Double porcaoGramas;
    private Double quantidadeProteinas;
    private Boolean comidaLactosa;
    private Double quantidadeSodio;

    public InformacoesNutricionais(){
        super();
    }
    public InformacoesNutricionais(Double porcaoGramas, Double quantidadeProteinas, Boolean comidaLactosa,Double quantidadeSodio) {
        this.setPorcaoGramas(porcaoGramas);
        this.setQuantidadeProteinas(quantidadeProteinas);
        this.setComidaLactosa(comidaLactosa);
        this.setQuantidadeSodio(quantidadeSodio);
    }

    public Double getPorcaoGramas() {
        return porcaoGramas;
    }

    public void setPorcaoGramas(Double porcaoGramas) {
        this.porcaoGramas = porcaoGramas;
    }

    public Double getQuantidadeProteinas() {
        return quantidadeProteinas;
    }

    public void setQuantidadeProteinas(Double quantidadeProteinas) {
        this.quantidadeProteinas = quantidadeProteinas;
    }

    public Boolean getComidaLactosa() {
        return comidaLactosa;
    }

    public void setComidaLactosa(Boolean comidaLactosa) {
        this.comidaLactosa = comidaLactosa;
    }

    public Double getQuantidadeSodio() {
        return quantidadeSodio;
    }


    public void setQuantidadeSodio(Double quantidadeSodio) {
        if (quantidadeSodio>0) {
           this.quantidadeSodio = quantidadeSodio; 
        }  
    } 
    
    public int getID() {
        return ID;
    }

    private void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "InformacoesNutricionais{" + "ID=" + ID + ", porcaoGramas=" + porcaoGramas + ", quantidadeProteinas=" + quantidadeProteinas + ", comidaLactosa=" + comidaLactosa + ", quantidadeSodio=" + quantidadeSodio +  '}';
    }
    
    

}
