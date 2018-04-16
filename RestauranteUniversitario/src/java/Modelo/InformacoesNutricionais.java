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
    private Float porcaoGramas;
    private Float quantidadeProteinas;
    private Boolean comidaLactosa;
    private Float quantidadeSodio;

    public InformacoesNutricionais(){
        super();
    }
    public InformacoesNutricionais(Float porcaoGramas, Float quantidadeProteinas, Boolean comidaLactosa) {
        this.setPorcaoGramas(porcaoGramas);
        this.setQuantidadeProteinas(quantidadeProteinas);
        this.setComidaLactosa(comidaLactosa);
    }

    public Float getPorcaoGramas() {
        return porcaoGramas;
    }

    public void setPorcaoGramas(Float porcaoGramas) {
        if(porcaoGramas > 0){
            this.porcaoGramas = porcaoGramas;
        }
    }

    public Float getQuantidadeProteinas() {
        return quantidadeProteinas;
    }

    public void setQuantidadeProteinas(Float quantidadeProteinas) {
        if(quantidadeProteinas>0){
           this.quantidadeProteinas = quantidadeProteinas; 
        }
    }

    public Boolean getComidaLactosa() {
        return comidaLactosa;
    }

    public void setComidaLactosa(Boolean comidaLactosa) {
        this.comidaLactosa = comidaLactosa;
    }


    public Float getQuantidadeSodio() {
        return quantidadeSodio;
    }

    public void setQuantidadeSodio(Float quantidadeSodio) {
        if (quantidadeSodio>0) {
           this.quantidadeSodio = quantidadeSodio; 
        }  
    } 
}
