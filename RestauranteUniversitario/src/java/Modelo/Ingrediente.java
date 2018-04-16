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
public class Ingrediente {
    private String nomeComida;

    public Ingrediente(String nomeComida) {
        this.setNomeComida(nomeComida);
    }

    public String getNomeComida() {
        return nomeComida;
    }

    public void setNomeComida(String nomeComida) {
        if(nomeComida != null){
           this.nomeComida = nomeComida; 
        }
    }  
}
