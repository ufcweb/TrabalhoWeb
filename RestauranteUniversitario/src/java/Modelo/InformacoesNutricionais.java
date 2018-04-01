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
    private Float valorEnergetico;
    private Float quantidadeCarboidratos;
    private Float quantidadeSodio;
    private Float fibraAlimentar;
    private Float gorduraTrans;
    private Float gorduraSaturada;
    private Float gordurasTotais;

    public InformacoesNutricionais(){
        super();
    }
    public InformacoesNutricionais(Float porcaoGramas, Float quantidadeProteinas, Boolean comidaLactosa, Float valorEnergetico, Float quantidadeCarboidratos, Float quantidadeSodio, Float fibraAlimentar, Float gorduraTrans, Float gorduraSaturada, Float gordurasTotais) {
        this.setPorcaoGramas(porcaoGramas);
        this.setQuantidadeProteinas(quantidadeProteinas);
        this.setComidaLactosa(comidaLactosa);
        this.setValorEnergetico(valorEnergetico);
        this.setQuantidadeCarboidratos(quantidadeCarboidratos);
        this.setQuantidadeSodio(quantidadeSodio);
        this.setFibraAlimentar(fibraAlimentar);
        this.setGorduraTrans(gorduraTrans);
        this.setGorduraSaturada(gorduraSaturada);
        this.setGordurasTotais(gordurasTotais);
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

    public Float getValorEnergetico() {
        return valorEnergetico;
    }

    public void setValorEnergetico(Float valorEnergetico) {
        if(valorEnergetico>0){
            this.valorEnergetico = valorEnergetico;
        }    
    }

    public Float getQuantidadeCarboidratos() {
        return quantidadeCarboidratos;
    }

    public void setQuantidadeCarboidratos(Float quantidadeCarboidratos) {
        if (quantidadeCarboidratos>0) {
            this.quantidadeCarboidratos = quantidadeCarboidratos;
        }
    }

    public Float getQuantidadeSodio() {
        return quantidadeSodio;
    }

    public void setQuantidadeSodio(Float quantidadeSodio) {
        if (quantidadeSodio>0) {
           this.quantidadeSodio = quantidadeSodio; 
        }  
    }

    public Float getFibraAlimentar() {
        return fibraAlimentar;
    }

    public void setFibraAlimentar(Float fibraAlimentar) {
        if (fibraAlimentar>0) {
            this.fibraAlimentar = fibraAlimentar;
        }     
    }

    public Float getGorduraTrans() {
        return gorduraTrans;
    }

    public void setGorduraTrans(Float gorduraTrans) {
        if (gorduraTrans>0) {
           this.gorduraTrans = gorduraTrans; 
        } 
    }

    public Float getGorduraSaturada() {
        return gorduraSaturada;
    }

    public void setGorduraSaturada(Float gorduraSaturada) {
        if (gorduraSaturada>0) {
            this.gorduraSaturada = gorduraSaturada;
        }
    }

    public Float getGordurasTotais() {
        return gordurasTotais;
    }

    public void setGordurasTotais(Float gordurasTotais) {
        if (gordurasTotais>0) {
            this.gordurasTotais = gordurasTotais;
        }
    }
    
    
    
    
}
