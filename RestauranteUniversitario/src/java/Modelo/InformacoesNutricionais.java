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
    private Double valorEnergetico;
    private Double quantidadeCarboidratos;
    private Double quantidadeSodio;
    private Double fibraAlimentar;
    private Double gorduraTrans;
    private Double gorduraSaturada;
    private Double gordurasTotais;

    public InformacoesNutricionais(){
        super();
    }
    public InformacoesNutricionais(Double porcaoGramas, Double quantidadeProteinas, Boolean comidaLactosa, Double valorEnergetico, Double quantidadeCarboidratos, Double quantidadeSodio, Double fibraAlimentar, Double gorduraTrans, Double gorduraSaturada, Double gordurasTotais) {
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

    public Double getValorEnergetico() {
        return valorEnergetico;
    }

    public void setValorEnergetico(Double valorEnergetico) {
        this.valorEnergetico = valorEnergetico;
    }

    public Double getQuantidadeCarboidratos() {
        return quantidadeCarboidratos;
    }

    public void setQuantidadeCarboidratos(Double quantidadeCarboidratos) {
        this.quantidadeCarboidratos = quantidadeCarboidratos;
    }

    public Double getQuantidadeSodio() {
        return quantidadeSodio;
    }

    public void setQuantidadeSodio(Double quantidadeSodio) {
        this.quantidadeSodio = quantidadeSodio;
    }

    public Double getFibraAlimentar() {
        return fibraAlimentar;
    }

    public void setFibraAlimentar(Double fibraAlimentar) {
        this.fibraAlimentar = fibraAlimentar;
    }

    public Double getGorduraTrans() {
        return gorduraTrans;
    }

    public void setGorduraTrans(Double gorduraTrans) {
        this.gorduraTrans = gorduraTrans;
    }

    public Double getGorduraSaturada() {
        return gorduraSaturada;
    }

    public void setGorduraSaturada(Double gorduraSaturada) {
        this.gorduraSaturada = gorduraSaturada;
    }

    public Double getGordurasTotais() {
        return gordurasTotais;
    }

    public void setGordurasTotais(Double gordurasTotais) {
        this.gordurasTotais = gordurasTotais;
    }

    
    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "InformacoesNutricionais{" + "ID=" + ID + ", porcaoGramas=" + porcaoGramas + ", quantidadeProteinas=" + quantidadeProteinas + ", comidaLactosa=" + comidaLactosa + ", valorEnergetico=" + valorEnergetico + ", quantidadeCarboidratos=" + quantidadeCarboidratos + ", quantidadeSodio=" + quantidadeSodio + ", fibraAlimentar=" + fibraAlimentar + ", gorduraTrans=" + gorduraTrans + ", gorduraSaturada=" + gorduraSaturada + ", gordurasTotais=" + gordurasTotais + '}';
    }
    
    
    
}
